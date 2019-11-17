/*
 * main.java.pages.addresses;
 *
 * Version 1.0
 *
 * 09.11.2019
 *
 * Copyright: Made by Volodymyr Zyhmund
 */

package main.java.test.testvolodya;

// Additional packages
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import main.java.test.BasicTest;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

// Listeners are waiting for the error and if it occurs - make a screenshot of error page
@Listeners(BasicTest.class)

// CreateAddressVerifyExpected class
public class APItestGET extends BasicTest {

    // Severity and description for Allure report
    @Severity(SeverityLevel.MINOR)
    @Description("Verify that new address entry match expected")
    @Test
    public void apiTestGET() throws IOException {
        // Arrange
        OkHttpClient client = new OkHttpClient();

        // Act
        Request request = new Request.Builder()
                .url("http://3.124.147.74/api/addresses")
                .get()
                .addHeader("Authorization", "Basic OEVLOTVLMzVBWFoxRkw0MTZJRzI1NDc1S0JDNDhTN1Q6")
                .addHeader("User-Agent", "PostmanRuntime/7.19.0")
                .addHeader("Accept", "*/*")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Postman-Token", "3e8c4321-a102-452a-80d9-e4cee99469e7,0a7698cc-602c-4a91-869d-9b3bce670975")
                .addHeader("Host", "3.124.147.74")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Cookie", "PrestaShop-07008fe12e4aedffd7878ad92215ef88=def502000650480c3331f08f435bcc29f93cc3dc50d42ea38ab14bb70e9a8d6a0247f74f8033b02e6af663d0521d44a2fbd8c5d52183fd7bfd8554def623a7b4b2490359e92635dea10817fde76512f05e5d276846ff206671c9d5b1e661e49f418f549abd4c1c45deebc19771b70944297c292c5198e24fe65cbba4ac3b4d60dd46e13ff44f42a9e24872f6e07109a992cfe87d067a5a72fc6e1831fb8fddab489b69")
                .addHeader("Connection", "keep-alive")
                .addHeader("cache-control", "no-cache")
                .build();

        Response response = client.newCall(request).execute();

        // Assert
        assertThat(response.code(), equalTo(200));

        System.out.println("\tStatus code: " + response.code());
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("\tHeaders, returned from server: \n" + response.headers().toString());
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("\tBody, returned from server: \n" + response.body().string());

//        // Deserialization
//        try {
//
//             // Reading objects from file
//            FileInputStream fis = new FileInputStream(response.body().string());
//            XMLDecoder decoder = new XMLDecoder(fis);
//
//             // Object deserialization method
//            ArrayList<?> deserializedList = (ArrayList<?>) decoder.readObject();
//
//             // Read deserialized persons one-by-one to the output
//            for (Object deserialized : deserializedList) {
//                System.out.print(deserialized);
//            }
//
//            // Close XMLDecoder and release hardware resources
//            decoder.close();
//            fis.close();
//        } catch (IOException ioe) {
//            System.err.println(ioe.getMessage());
//        }
    }
}
