package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2 {
	@Given("scenario2 method1")
	public void scenario2_method1() {
		System.out.println("scenario2 method1");
	}

	@When("scenario2 method2")
	public void scenario2_method2() {
		System.out.println("scenario2 method2");
	}

	@Then("scenario2 method3")
	public void scenario2_method3() {
	    System.out.println("scenario2 method3");
	    System.out.println("--------------------");
	}
}
