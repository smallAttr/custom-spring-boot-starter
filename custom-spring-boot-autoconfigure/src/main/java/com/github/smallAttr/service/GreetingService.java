package com.github.smallAttr.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-11-13 16:05
 */
@NoArgsConstructor
@AllArgsConstructor
public class GreetingService {

    private List<String> members = new ArrayList<>();

    public void sayHello(){
        members.forEach(s -> System.out.println("hello " + s));
    }
}
