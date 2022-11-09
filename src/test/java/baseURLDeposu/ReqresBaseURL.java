package baseURLDeposu;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class ReqresBaseURL {

    protected RequestSpecification specReqres;

    @Before
    public void setUp() {
        specReqres = new RequestSpecBuilder().setBaseUri("https://reqres.in/api").build();
    }
}