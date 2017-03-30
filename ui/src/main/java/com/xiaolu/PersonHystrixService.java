package com.xiaolu;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaolu on 2017/3/29.
 */
@Service
public class PersonHystrixService {
    @Autowired
    private PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public Person save() {
        return personService.getPerson();
    }

    public Person fallbackSave() {
        Person person = new Person();
        person.setName("error");
        return person;
    }
}
