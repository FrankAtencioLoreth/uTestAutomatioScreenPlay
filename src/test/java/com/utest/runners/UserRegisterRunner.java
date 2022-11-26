package com.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/UserRegister.feature",
    glue = "com.utest.stepDefinitions",
    tags = {"@stories", "@scenario1"},
    snippets = SnippetType.CAMELCASE
)
public class UserRegisterRunner {
}
