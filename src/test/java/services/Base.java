package services;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


public class Base {
    public static void initParametrosMora(String pais){
        if (pais.isEmpty()) {
            pais = "ar";
        }
        RestAssured.baseURI = "https://cob-parameters-mora-service-payment-interfaces-"+pais+"-desa.apps.osen02.claro.amx";
        RestAssured.basePath = "/";
        RequestSpecification requestSpecification = new RequestSpecBuilder().
                addHeader("Content-Type", ContentType.JSON.toString())
                .setRelaxedHTTPSValidation()
                .build();
        RestAssured.requestSpecification = requestSpecification;
    }
}
