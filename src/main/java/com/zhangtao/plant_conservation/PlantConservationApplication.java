package com.zhangtao.plant_conservation;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhangtao
 */
@MapperScan("com.zhangtao.plant_conservation.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class PlantConservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlantConservationApplication.class, args);
    }

}