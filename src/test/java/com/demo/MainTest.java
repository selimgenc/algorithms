package com.demo;

import org.junit.Test;

public class MainTest {

    @Test
    public void getName() {
        String name = new Main().getName();
        System.out.println(name);
    }
}