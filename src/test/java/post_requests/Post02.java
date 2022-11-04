package post_requests;

import base_urls.RestfulBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.RestfulTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Post02 extends RestfulBaseUrl {
    /*
   Given
       1) https://restful-booker.herokuapp.com/booking
       2) {
            "firstname": "John",
            "lastname": "Doe",
            "totalprice": 11111,
            "depositpaid": true,
            "bookingdates": {
                "checkin": "2021-09-09",
                "checkout": "2021-09-21"
             }
          }
   When
       I send POST Request to the Url
   Then
       Status code is 200
       And response body should be like {
                                           "bookingid": 5315,
                                           "booking": {
                                               "firstname": "John",
                                               "lastname": "Doe",
                                               "totalprice": 11111,
                                               "depositpaid": true,
                                               "bookingdates": {
                                                   "checkin": "2021-09-09",
                                                   "checkout": "2021-09-21"
                                               }
                                           }
                                        }
*/

    @Test
    public void post02(){
        //Set the URL
        spec.pathParam("first","booking");

        //Set the expected Data
        RestfulTestData obj = new RestfulTestData();
        Map<String,String> bookingdatesMap = obj.bookingdatesMethod("2021-09-09","2021-09-21");
        Map<String,Object> expecteData = obj.expectedDataMethod("John","Doe",11111,true,bookingdatesMap);

        //Send the Request and Get the Respanse
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expecteData).when().post("/{first}");
        response.prettyPrint();

        //Do Assertion
        Map<String,Object> actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);

    }
}
