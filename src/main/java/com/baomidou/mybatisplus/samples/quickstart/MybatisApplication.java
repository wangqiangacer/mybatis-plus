package com.baomidou.mybatisplus.samples.quickstart;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@Slf4j
public class MybatisApplication {

    @Resource
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }


    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(16);
        executor.setMaxPoolSize(300);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("defaultThreadPool_");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //线程空闲后的最大存活时间
        executor.setKeepAliveSeconds(60);
        executor.initialize();
        log.info("初始化线程池成功~");
        return executor;
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            log.debug("Let's inspect the beans provided by Spring Boot:");
            log.info(String.format("\n----------------------------------------------------------\n\t" +
                            "Application '%s' is running! Access URLs:\n\t" +
                            "Local: \t\thttp://localhost:%s\n\t" +
                            "The following profiles are active: %s\n" +
                            "----------------------------------------------------------",
                    env.getProperty("spring.application.name"),
                    env.getProperty("server.port"),
                    env.getProperty("spring.profiles.active")));

        };
    }
}
