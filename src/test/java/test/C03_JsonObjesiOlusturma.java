package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {


 /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
    {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
    }
    */

    @Test
    public void jsonObject01(){

        JSONObject jsonObject= new JSONObject();
        jsonObject.put( "title","Ahmet");
        jsonObject.put( "body","Merhaba");
        jsonObject.put("userId",1);
        System.out.println("first json object: " +jsonObject);
    }

    @Test
    public void jsonObject02 (){

        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                    },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */

        JSONObject bookingDates= new JSONObject();
        bookingDates.put( "checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        JSONObject bookinginfo = new JSONObject();
        bookinginfo.put("firstname","Jim");
        bookinginfo.put( "additionalneeds","Breakfast");
        bookinginfo.put( "totalprice",111);
        bookinginfo.put("depositpaid",true);
        bookinginfo.put(  "lastname","Brown");
        bookinginfo.put("bookingdates", bookingDates);

        System.out.println("Booking json obj" +bookinginfo);

    }

}
