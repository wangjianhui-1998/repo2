package cn.wolfcode.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberServer {
    public static void main(String[] args) {
        SpringApplication.run(MemberServer.class,args);
    }
}
