package com.cedaniel200.ejercicio2.pageobject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/authenticate.feature",
        glue = "com.cedaniel200.ejercicio2.pageobject.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class Authenticate {
}
