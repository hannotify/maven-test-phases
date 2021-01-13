package com.github.hannotify.maventestphases;

import org.junit.jupiter.api.Test;

public class IAmNotRunAtAll {
    @Test
    void thisMethodNeverRuns() {
        System.out.println("This test never runs... :-(");
    }
}
