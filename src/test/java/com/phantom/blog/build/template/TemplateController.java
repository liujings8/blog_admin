package com.phantom.blog.build.template;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Classname: TemplateController
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/26 10:12
 */
@Controller
public class TemplateController {

    private static final Logger LOGGER = Logger.getLogger(TemplateController.class);

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "from TemplateController.helloHtml");
        return "/helloHtml";
    }

}
