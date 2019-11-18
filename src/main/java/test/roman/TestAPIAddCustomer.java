package main.java.test.roman;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import okhttp3.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;


public class TestAPIAddCustomer {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify adding two equals customers with length password less than 5 chars.")
    @Test
    public void testAPI() {
        int codeResponse = addCustomerRequest();
        //first adding is correct
        Assert.assertTrue(codeResponse == 201, "codeResponse should be aquals to 201."); //201 - created
        //second adding is must be wrong, but response is ok;
        codeResponse = addCustomerRequest();
        Assert.assertTrue(codeResponse != 201, "codeResponse should be different from 201."); //201 - created
    }


    private int addCustomerRequest() {
        OkHttpClient client = new OkHttpClient();
        Response response = null;
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<prestashop>\r\n\t<customer>\r\n\t\t<id></id>\r\n\t\t<id_default_group>3</id_default_group>\r\n\t\t<id_lang>1</id_lang>\r\n\t\t<newsletter_date_add>2019-01-01 00:00:00</newsletter_date_add>\r\n\t\t<ip_registration_newsletter></ip_registration_newsletter>\r\n\t\t<last_passwd_gen>2019-01-01 00:00:00</last_passwd_gen>\r\n\t\t<secure_key></secure_key>\r\n\t\t<deleted>0</deleted>\r\n\t\t<passwd>1234</passwd>\r\n\t\t<lastname>Shamakhin</lastname>\r\n\t\t<firstname>Roman</firstname>\r\n\t\t<email>shbr2k.test.01@gmail.com</email>\r\n\t\t<id_gender>2</id_gender>\r\n\t\t<birthday>1979-07-20</birthday>\r\n\t\t<newsletter>0</newsletter>\r\n\t\t<optin>0</optin>\r\n\t\t<website></website>\r\n\t\t<company></company>\r\n\t\t<siret></siret>\r\n\t\t<ape></ape>\r\n\t\t<outstanding_allow_amount>0.000000</outstanding_allow_amount>\r\n\t\t<show_public_prices>0</show_public_prices>\r\n\t\t<id_risk>0</id_risk>\r\n\t\t<max_payment_days>0</max_payment_days>\r\n\t\t<active>1</active>\r\n\t\t<note></note>\r\n\t\t<is_guest>0</is_guest>\r\n\t\t<id_shop>1</id_shop>\r\n\t\t<id_shop_group>1</id_shop_group>\r\n\t\t<date_add>2019-01-01 00:00:00</date_add>\r\n\t\t<date_upd>2019-01-01 00:00:00</date_upd>\r\n\t\t<reset_password_token></reset_password_token>\r\n\t\t<reset_password_validity>0000-00-00 00:00:00</reset_password_validity>\r\n\t</customer>\r\n</prestashop>");
        Request request = new Request.Builder()
                .url("http://3.124.147.74/api/customers")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Basic OEVLOTVLMzVBWFoxRkw0MTZJRzI1NDc1S0JDNDhTN1Q6")
                .addHeader("User-Agent", "PostmanRuntime/7.19.0")
                .addHeader("Accept", "*/*")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("Host", "3.124.147.74")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Content-Length", "1257")
                .addHeader("Connection", "keep-alive")
                .addHeader("cache-control", "no-cache")
                .build();
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.code();
    }
}


