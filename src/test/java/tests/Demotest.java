package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;

//import org.testng.annotations.Test;

public class Demotest extends BaseClass {
	
	
	
	@Test(priority=1)
	public void test1() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(priority=2)
	public void test2() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("oneplus",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=3)
	public void test3() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("samsung",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=4)
	public void test4() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("vivo",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=5)
	public void test5() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("oppo",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();}
	@Test(priority=6)
	public void test6() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver";
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q"))
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("realme",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();}
	
	
		
}
 