package com.tests;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import org.testng.Assert;


public class ApiValidationTest {
  @Test
  public void validationUaerData() {
	  String email=RestAssured.given()
			  .when()
			  .get("https://jsonplaceholder.typicode.com/users/1")
			  .jsonPath()
			  .getString("email");
	  System.out.println("Email:"+email);
	  Assert.assertEquals(email,"Sincere@april.biz");
  }
  
}
