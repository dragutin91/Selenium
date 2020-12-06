package com.symphony.utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue={"com.symphony.stepDefintions","com.symphony.hooks"})

public class TestRunner {

}
