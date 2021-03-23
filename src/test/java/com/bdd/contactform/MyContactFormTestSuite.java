package com.bdd.contactform;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features/contactforms",
		glue="com.bdd.contactform"
		)
public class MyContactFormTestSuite{
	
}