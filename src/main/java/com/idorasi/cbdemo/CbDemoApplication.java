package com.idorasi.cbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories
public class CbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbDemoApplication.class, args);
    }

}
