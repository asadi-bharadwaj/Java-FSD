package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPATHDemo {
public static void main(String[] args) throws
InterruptedException {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","E:\\browser drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.wikipedia.org/");
// Find an element using XPATH locator
// XPATh : Relative XPATH : //tag[@attribute='value']
driver.findElement(By.xpath("//input[@name='search']")).sendKeys("findelement");
// element 2 to click on button
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}