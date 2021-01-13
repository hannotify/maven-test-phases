package com.github.hannotify.maventestphases.cucumber;

import com.github.hannotify.maventestphases.annotations.IntegrationTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@Category(IntegrationTest.class)
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/",
        glue = "com.github.hannotify.maventestphases.cucumber",
        tags = "@IntegrationTest")
public class RunCucumberIntegrationTests {
}
