package crypto.value.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TestResourceCoinloreCrypto {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/status")
                .then()
                .statusCode(200)
                .body(is("OK"));
    }

}
