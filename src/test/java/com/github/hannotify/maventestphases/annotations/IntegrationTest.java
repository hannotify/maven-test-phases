package com.github.hannotify.maventestphases.annotations;

import java.lang.annotation.*;
import org.junit.jupiter.api.Tag;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("integration")
@Documented
@Inherited
public @interface IntegrationTest {
}
