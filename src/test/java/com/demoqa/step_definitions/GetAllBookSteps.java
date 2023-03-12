package com.demoqa.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.path.json.JsonPath.given;

public class GetAllBookSteps {

    Response response;

    @When("User sends GET request to receive all books information")
    public void user_sends_get_request_to_receive_all_books_information() {
       response = RestAssured.given().accept(ContentType.JSON)
               .get("BookStore/v1/books");

       response.prettyPeek();
    }
    @Then("verifies that application returns {int} results")
    public void verifies_that_application_returns_results(int expectedBookAmount) {

 //jsonPath method (this method is easier than collection)
        JsonPath jsonPath = response.jsonPath();
        List<Object> books = jsonPath.getList("books");
        System.out.println("Books.size() " +books.size());

        Assert.assertEquals(expectedBookAmount, books.size());
//note when to do assertion: need to be the same int data type between expectedBookAmount and books.size() is int


     //collection:
        Map<String, Object> responseMap = response.as(Map.class);
        //De-Serialization--First level of information
        System.out.println("responseMap = " + responseMap);

        List<Map<String, Object>> bookList = (List<Map<String, Object>>)responseMap.get("books");

        int size = books.size();
        System.out.println("booksize : " +size);
    }

}
