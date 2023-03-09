import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test {

    @org.junit.jupiter.api.Test
    void test() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some dataa"))
        ;
    }
}

