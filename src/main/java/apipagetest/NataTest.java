package main.java.apipagetest;


import main.java.helperinstrument.EnviromentHelper;

import org.testng.annotations.Test;

import java.io.IOException;
import static io.restassured.RestAssured.given;

public class NataTest {

    //    given()
//                .auth()
//                .basic({userName}, {password})
//            .get({baseUrl} + "/api/countries/216")
//            .then()
//                .log().all()
//                .statusCode(200)
//                .body("prestashop.country.iso_code", CoreMatchers.is("UA"));
    @Test
    public void testingApi() throws IOException {

        given().auth().basic("8EK95K35AXZ1FL416IG25475KBC48S7T", "")
                .get(EnviromentHelper.getPrestaUrl() + "/api/addresses/12")
                .then()
                .log().all()
           //    .body("api shopName=\"ShBr2k\".addresses.", CoreMatchers.is(12))
                .statusCode(200);

//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url("http://3.124.147.74/api/addresses/12")
//                .get()
//
//                .addHeader("Authorization", "Basic OEVLOTVLMzVBWFoxRkw0MTZJRzI1NDc1S0JDNDhTN1Q6")
//                //.addHeader("User-Agent", "PostmanRuntime/7.19.0")
////                .addHeader("Accept", "*/*")
////                .addHeader("Cache-Control", "no-cache")
//                //.addHeader("Postman-Token", "9bfa2a01-6350-439e-bb75-b3595966e64d,da160ae2-bf9a-41bc-b1a3-1168d65ff2bc")
//                //.addHeader("Host", "3.124.147.74")
//                //.addHeader("Accept-Encoding", "gzip, deflate")
//                .addHeader("Connection", "keep-alive")
//                .addHeader("cache-control", "no-cache")
//
//                .build()
//                ;
//
//        Response response = client.newCall(request).execute();
//    }
    }
}
