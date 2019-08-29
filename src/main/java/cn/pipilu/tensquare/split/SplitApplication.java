package cn.pipilu.tensquare.split;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.pipilu")
public class SplitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SplitApplication.class,args);
    }
}
