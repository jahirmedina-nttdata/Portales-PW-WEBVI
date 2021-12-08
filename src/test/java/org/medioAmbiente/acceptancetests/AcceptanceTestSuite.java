package org.medioAmbiente.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"html:target/build/cucumber-html-report", "pretty:target/build/cucumber-pretty.txt"
        , "json:target/build/cucumber.json"},
        stepNotifications=true,
        features="src/test/resources/",
        glue="org.medioAmbiente"
//        , tags = "(@CAP_F_056 or @CAP_F_057)"
        , tags = "@CAP_F_005"
        )

public class AcceptanceTestSuite {}