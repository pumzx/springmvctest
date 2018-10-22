package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author panzhixiong
 * @date 2018/10/22
 */

@Controller
@RequestMapping("/home")
public class HelloController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
