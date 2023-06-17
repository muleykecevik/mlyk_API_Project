package test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class C07_Get_BodyTekrarlardanKurtulma {
    /*
                https://restful-booker.herokuapp.com/booking/10 url’ine
                bir GET request gonderdigimizde donen Response’un,
                status code’unun 200,
                ve content type’inin application/json; charset=utf-8,
                ve response body’sindeki
                    "firstname“in,"Jim",
                    ve "lastname“in, "Wilson",
                    ve "totalprice“in, 609,
                    ve "depositpaid“in,false,
                    ve "additionalneeds“in,"Breakfast"
                oldugunu test edin
         */

    @Test
    public void get01(){

        //1- url hazirla

        String url= "https://restful-booker.herokuapp.com/booking/10";

        //2-expected data hazirla

        //3-response kaydet

        Response response= given().when().get(url);

        response.prettyPrint();

        //4-assertion

      /*  response.then().assertThat()
                .statusCode(200).contentType("application/json; charset=utf-8")
                .body("firstname", Matchers.equalTo("Susan"),
                              "lastname", Matchers.equalTo("Wilson"),
                              "totalprice", Matchers.equalTo(613),
                              "depositpaid", Matchers.equalTo(false),
                              "additionalneeds", Matchers.equalTo("Breakfast"));

       */


        response.then().assertThat()
                .statusCode(200).contentType("application/json; charset=utf-8")
                .body("firstname",equalTo("Susan"),
                        "lastname", equalTo("Wilson"),
                        "totalprice", equalTo(613),
                        "depositpaid", equalTo(false),
                        "additionalneeds", equalTo("Breakfast"));

    }
}
