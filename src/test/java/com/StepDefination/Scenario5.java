package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario5 {
	@Given("scenario5 method1")
	public void scenario5_method1() {
		 System.out.println("scenario5 method1");
	}

	@When("scenario5 method2")
	public void scenario5_method2() {
		 System.out.println("scenario5 method2");
	}

	@Then("scenario5 method3")
	public void scenario5_method3() {
		System.out.println("scenario5 method3");
		 System.out.println("--------------------");
	}
}
