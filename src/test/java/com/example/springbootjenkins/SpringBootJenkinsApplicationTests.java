package com.example.springbootjenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test Case executing....");
        Assert.assertEquals(true, true);
    }

}
