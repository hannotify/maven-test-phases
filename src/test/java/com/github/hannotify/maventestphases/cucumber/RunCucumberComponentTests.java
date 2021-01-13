package com.github.hannotify.maventestphases.cucumber;

import com.github.hannotify.maventestphases.annotations.ComponentTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@Category(ComponentTest.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/",
        glue = "com.github.hannotify.maventestphases.cucumber",
        tags = "@ComponentTest")
public class RunCucumberComponentTests {
}
