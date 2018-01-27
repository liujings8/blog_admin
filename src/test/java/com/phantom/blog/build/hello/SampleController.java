package com.phantom.blog.build.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <a>https://projects.spring.io/spring-boot/<a/>
 * <a>https://www.cnblogs.com/yql1986/p/6819097.html<a/>
 *
 * @Classname: SampleController
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/25 9:55
 */
@Controller
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String some() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }

}
