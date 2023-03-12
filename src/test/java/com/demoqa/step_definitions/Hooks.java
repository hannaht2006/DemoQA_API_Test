package com.demoqa.step_definitions;

import com.demoqa.utils.ConfigrationReader;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;

public class Hooks {
  //runs before and after every tests in cucumber framework, so I can setUp my BaseUrl here
    @Before
    public void setUpApiRequest(){

        RestAssured.baseURI = ConfigrationReader.getProperty("apiUrl");
    }
}
