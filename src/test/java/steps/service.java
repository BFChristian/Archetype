package steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;

import java.util.ArrayList;

import services.Base;

public class service {
    
    ArrayList<String> ss = new ArrayList<>();
    @Given("hello")
    public void testgiven(){
        Base.initParametrosMora("ar");    
    }

    @Then("chau")
    public void testthen(){
        Response response = get("/cycle");
        ArrayList<String> ss = response.path("data");
        System.out.println(ss);
    }
}
