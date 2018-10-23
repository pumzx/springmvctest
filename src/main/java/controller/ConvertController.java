package controller;

import domain.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panzhixiong
 * @date 2018/10/24
 */
@RestController
public class ConvertController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public Person convert(@RequestBody Person person) {
        return person;
    }
}
