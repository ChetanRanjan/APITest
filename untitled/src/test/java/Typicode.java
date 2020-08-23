import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class Typicode {
    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
        Response response = given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                statusCode(200).
                extract().
                response();
        System.out.println(response.jsonPath().toString());
        System.out.println("response.getBody().toString()");
    }

    @Test
    public void getAllPosts()
    {
//        RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("http://ergast.com/api/f1/2017/circuits.json");
        // Retrieve the body of the Response    
        ResponseBody body = response.getBody();
        // By using the ResponseBody.asString() method, we can convert the  body
        // into the string representation.
        System.out.println("Response Body is: " + body.asString());
    }
}
