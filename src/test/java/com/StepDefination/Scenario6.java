package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario6 {

@Given("scenario6 method1")
public void scenario6_method1() {
	 System.out.println("scenario6 method1");
}

@When("scenario6 method2")
public void scenario6_method2() {
	 System.out.println("scenario6 method2");
}

@Then("scenario6 method3")
public void scenario6_method3() {
	 System.out.println("scenario6 method3");
	 System.out.println("--------------------");
}

}
