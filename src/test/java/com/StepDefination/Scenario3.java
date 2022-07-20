package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario3 {
	@Given("scenario3 method1")
	public void scenario3_method1() {
		System.out.println("scenario3 method1");
	}

	@When("scenario3 method2")
	public void scenario3_method2() {
		System.out.println("scenario3 method2");
	}

	@Then("scenario3 method3")
	public void scenario3_method3() {
		System.out.println("scenario3 method3");
		 System.out.println("--------------------");
	}
}
