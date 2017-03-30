package com.xiaolu;

import java.io.Serializable;

/**
 * Created by xiaolu on 2017/3/21.
 */
public class Person implements Serializable {
    private String id;

    private int age;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
