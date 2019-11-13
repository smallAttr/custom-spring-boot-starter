package com.github.smallAttr.service;

import com.github.smallAttr.ApplicationLauncher;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

/**
 * @author smallAttr
 * @since 2019-11-13 16:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationLauncher.class)
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void print() {
        greetingService.sayHello();
    }
}
