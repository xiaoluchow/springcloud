package com.xiaolu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaolu on 2017/3/29.
 */
@RestController

public class PersonController {
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Person getOne() {
        Person person = new Person();
        person.setName("zhou");
        return person;
    }
}
