package com.jalinyiel.coursystem.system;

//import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = {"com.jalinyiel.coursystem.system.repository"})
public class SystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(SystemApplication.class, args);
    }

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DataSource dataSource() {
//        DataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }
}
