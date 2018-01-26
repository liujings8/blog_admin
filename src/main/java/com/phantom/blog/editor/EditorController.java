package com.phantom.blog.editor;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Classname: EditorController
 * @Description: TODO()
 * @Author: phantom
 * @Created: 2018/1/26 10:56
 */
@Controller
@RequestMapping("/editor")
public class EditorController {
    private static Logger LOGGER = Logger.getLogger(EditorController.class);

    @RequestMapping("/editorPage")
    public String editorPage(){
        return "editor/editor_save";
    }

}
