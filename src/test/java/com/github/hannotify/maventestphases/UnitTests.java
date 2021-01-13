package com.github.hannotify.maventestphases;

import com.github.hannotify.maventestphases.annotations.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
public class UnitTests {
    @Test
    void test() {
        System.out.println("This is a unit test using JUnit.");
    }
}
