package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GoRestBaseUrl {

    protected RequestSpecification spec;

    @Before
    public void setup(){
        spec = new RequestSpecBuilder().setBaseUri("https://gorest.co.in/public/v1").build(); // spec'i islemleri devam ettirebilmek icin https://gorest.co.in/public/v1 ' e esitledik
    }
}