package controller;

import domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panzhixiong
 * @date 2018/10/23
 */

@RestController
@RequestMapping("rest")
public class TestRestController {

    // http://localhost:8080/springmvctest/rest/getJson?id=520&name=pan
    @RequestMapping(value = "/getJson", produces = "application/json;charset=UTF-8")
    public Person getJson(Person person) {
        // {"id":521,"name":"pan_json"}
        return new Person(person.getId()+1, person.getName()+"_json");
    }

    // http://localhost:8080/springmvctest/rest/getXml?id=520&name=pan
    @RequestMapping(value = "/getXml", produces = "application/xml;charset=UTF-8")
    public Person getXml(Person person) {
        /*
          <Person xmlns="">
            <id>521</id>
            <name>pan_xml</name>
          </Person>
        */
        return new Person(person.getId()+1, person.getName()+"_xml");
    }
}
