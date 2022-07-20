package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 {
	@Given("scenario1 method1")
	public void scenario1_method1() {
		 System.out.println("scenario1 method1");
	}

	@When("scenario1 method2")
	public void scenario1_method2() {
		 System.out.println("scenario1 method2");
	}

	@Then("scenario1 method3")
	public void scenario1_method3() {
	    System.out.println("scenario1 method3");
	    System.out.println("--------------------");
	}
}
