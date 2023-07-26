package services;

import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class cycle extends Base{
    
    public Response getResponse(){
        return get("/cycle");
    }

    public void validateSchemaIsValid(){
        getResponse().then().assertThat().body(matchesJsonSchemaInClasspath("esquemacorrespondiente.json"));
    }
}