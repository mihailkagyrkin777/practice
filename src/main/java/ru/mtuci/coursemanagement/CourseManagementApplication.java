package ru.mtuci.coursemanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootTest
class CourseManagementApplicationTests {

    @Test
    void contextLoads() {
    }

}
@SpringBootApplication
public class CourseManagementApplication {


    public static void main(String[] args) {
        SpringApplication.run(CourseManagementApplication.class, args);
    }

}
