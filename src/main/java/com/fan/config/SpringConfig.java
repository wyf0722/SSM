package com.fan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.fan.service"})
@PropertySource("classpath:jdbc.properties")  // 注意此处一定要加上classpath
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement // 事务
public class SpringConfig {
}
