package com.github.hannotify.maventestphases;

import com.github.hannotify.maventestphases.annotations.ComponentTest;
import org.junit.jupiter.api.Test;

@ComponentTest
public class ComponentTests {
    @Test
    void test2() {
        System.out.println("This is a component test using JUnit.");
    }
}
