package com.zf.config;

import com.dangdang.ddframe.rdb.sharding.config.yaml.api.YamlShardingDataSource;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangf
 * @version V1.0
 * @Description:
 * @date 2017/8/15
 */
@Configuration
public class ShardingConfig
{
    @Bean
    public DataSource dataSource() throws IOException
    {
        ClassPathResource classPathResource = new ClassPathResource("sharding.yaml");
        InputStream inputStream = classPathResource.getInputStream();
        File ymlFile = File.createTempFile("shrding-temp", ".yml");
        try {
            FileUtils.copyInputStreamToFile(inputStream, ymlFile);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return new YamlShardingDataSource(ymlFile);
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws IOException {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        // 设置查找器
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.zf.entity");
        // 自动扫描mybatis文件
        sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return sessionFactory;
    }
}
