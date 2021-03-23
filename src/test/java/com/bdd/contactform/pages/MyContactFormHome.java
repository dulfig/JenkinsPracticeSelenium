package com.bdd.contactform.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyContactFormHome {
	private final String url = "https://www.mycontactform.com/samples/basiccontact.php";
	WebDriver driver;
	public MyContactFormHome(WebDriver driver){
		this.driver = driver;
		this.driver.get(url);
	}
	
	public WebElement getYourName() {
		return driver.findElement(By.xpath("//tbody/tr[1]/td[2]/font[1]/input[1]"));
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@id='email']"));
	}
	
	public WebElement getMessage() {
		return driver.findElement(By.xpath("//tbody/tr[4]/td[1]/font[1]/textarea[1]"));
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]"));
	}
	
	public WebElement getThankYou() {
		return driver.findElement(By.xpath("//h4[contains(text(),'Thank You')]"));
	}
}
