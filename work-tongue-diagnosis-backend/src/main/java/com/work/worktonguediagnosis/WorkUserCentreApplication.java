package com.work.worktonguediagnosis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 启动类
 *
 * @author <a href="https://github.com/xiaogithuboo">limou3434</a>
 */
@SpringBootApplication
@Slf4j
public class WorkUserCentreApplication {
    public static void main(String[] args) {
        /* var context = */
        SpringApplication.run(WorkUserCentreApplication.class, args);
        log.info("访问 http://localhost:8000/work_tongue_diagnosis_api/doc.html 即可得到在线文档");
    }
}
