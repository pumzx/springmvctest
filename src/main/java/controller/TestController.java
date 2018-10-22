package controller;

import domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author panzhixiong
 * @date 2018/10/22
 */

@Controller
@RequestMapping("/test")
public class TestController {

    // http://localhost:8080/springmvctest/test/index
    @RequestMapping("/index")
    public @ResponseBody String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }

    // http://localhost:8080/springmvctest/test/pathvar/str=panzx
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String pathvar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, str:" + str;
    }

    // http://localhost:8080/springmvctest/test/requestParam?id=1000
    @RequestMapping(value = "requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String requestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, id = " + id;
    }

    // http://localhost:8080/springmvctest/test/requestDomain?id=520&name=panzx
    @RequestMapping(value = "requestDomain", produces = "application/json;charset=UTF-8")
    public @ResponseBody String requestDomain(Person person, HttpServletRequest request) {
        // print: url:http://localhost:8080/springmvctest/test/requestDomain,person.id=520, person.name= panzx
        return "url:" + request.getRequestURL()+ ",person.id=" + person.getId() + ", person.name= " + person.getName();
    }

    // http://localhost:8080/springmvctest/test/path1
    // http://localhost:8080/springmvctest/test/path2
    @RequestMapping(value = {"/path1","/path2"})
    public @ResponseBody String paths(HttpServletRequest request) {
        return "url:" + request.getRequestURL();
    }
}
