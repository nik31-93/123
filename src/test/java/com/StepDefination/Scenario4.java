package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario4 {
	@Given("scenario4 method1")
	public void scenario4_method1() {
		System.out.println("scenario4 method1");
	}

	@When("scenario4 method2")
	public void scenario4_method2() {
		System.out.println("scenario4 method2");
	}

	@Then("scenario4 method3")
	public void scenario4_method3() {
		System.out.println("scenario4 method3");
		 System.out.println("--------------------");
	}
}
