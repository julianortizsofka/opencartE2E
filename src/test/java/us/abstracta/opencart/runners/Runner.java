package us.abstracta.opencart.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/feature/pruebae2e.feature",
        glue = "us.abstracta.opencart.stepdefinitions",
        plugin = {"pretty"}
)


public class Runner {
}