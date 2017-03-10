package com.sostar.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by mao_yejun on 2016/10/11.
 */
@Configuration
public class DataSoureConfig {
    @Resource
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        String url = environment.getProperty("spring.dataSource.url");
        dataSource.setUrl(url);
        String userName = environment.getProperty("spring.dataSource.username");
        dataSource.setUsername(userName);
        String password = environment.getProperty("spring.dataSource.password");
        dataSource.setPassword(password);
        String initialSize = environment.getProperty("spring.dataSource.initial-size");
        dataSource.setInitialSize(Integer.parseInt(initialSize));
        String maxActive = environment.getProperty("spring.dataSource.max-active");
        dataSource.setMaxActive(Integer.parseInt(maxActive));
        String minIdle = environment.getProperty("spring.dataSource.max-idle");
        dataSource.setMinIdle(Integer.parseInt(minIdle));
        String maxWait = environment.getProperty("spring.dataSource.max-wait");
        dataSource.setMaxWait(Integer.parseInt(maxWait));
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(false);
        dataSource.setTestWhileIdle(true);
        dataSource.setPoolPreparedStatements(false);
        return dataSource;
    }
}
