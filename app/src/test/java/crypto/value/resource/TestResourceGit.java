package crypto.value.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TestResourceGit {

    @Test
    public void testStatusEndpoint() {
        given()
                .when().get("git/status")
                .then()
                .statusCode(200)
                .body(is("Git OK"));
    }

    @Test
    public void testGitConnectivity() {
        given()
                .when().get("git")
                .then()
                .statusCode(200);
    }
}
