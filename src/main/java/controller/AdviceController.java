package controller;

import domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author panzhixiong
 * @date 2018/10/23
 */

@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomeThing(@ModelAttribute("msg") String msg, Person person, @ModelAttribute("id") int id) {
        throw new IllegalArgumentException("occur some Exception... and the msg is " + msg);
    }
}
