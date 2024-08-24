package org.proj1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Project_1 {
	public static void main(String[]args) throws InterruptedException, AWTException
	{
		//step1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\FinalProject\\driver1\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://scentarts.ae/");
		drive.manage().window().maximize();
		
		//step2
		WebElement ele=drive.findElement(By.xpath("(//a[text()='About Us'])[1]"));
		ele.click();
		
		//step3
		//method1
		/*Actions a =new Actions(drive);
		WebElement scroll=drive.findElement(By.xpath("//h2[text()='FAQs']"));
		a.moveToElement(scroll).perform();*/
		
		//method2
		JavascriptExecutor js=(JavascriptExecutor) drive;
		WebElement scroll=drive.findElement(By.xpath("//h2[text()='FAQs']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);

		
		//step4
		WebElement hotel=drive.findElement(By.xpath("//a[text()='Hotels']"));
		hotel.click();
		
		//step5
		WebElement txt=drive.findElement(By.xpath("//p[text()='Smell provides guests with a sense of orientation before the visual role is fully established.']"));
		String text = txt.getText();
		System.out.println("Scenario1: "+text);
		System.out.println();
		
		//step6
		WebElement service=drive.findElement(By.xpath("(//span[text()='Our Services'])[2]"));
		service.click();
		
		//step7
		JavascriptExecutor js1=(JavascriptExecutor) drive;
		WebElement scroll1=drive.findElement(By.xpath("(//span[text()='Contact Us'])[3]"));
		js1.executeScript("arguments[0].scrollIntoView(false)", scroll1);
		scroll1.click();
		
		//step8
		JavascriptExecutor js2=(JavascriptExecutor) drive;
		WebElement scroll2=drive.findElement(By.xpath("//span[text()='Send']"));
		js1.executeScript("arguments[0].scrollIntoView(false)", scroll2);
		WebElement name=drive.findElement(By.xpath("//input[@placeholder='Full Name']"));
		name.sendKeys("Velmurugan E");
		WebElement company=drive.findElement(By.xpath("//input[@placeholder='Company Name']"));
		company.sendKeys("Inamkes Infotech");
		WebElement ph=drive.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		ph.sendKeys("8394029838");
		WebElement mail=drive.findElement(By.xpath("//input[@placeholder='Email Address']"));
		mail.sendKeys("inmakes@0903");
		Thread.sleep(3000);
		
		//step9
		WebElement element2 = drive.findElement(By.xpath("//select[@class='elementor-field-textual elementor-size-sm']"));
		Select s=new Select(element2);
		List<WebElement> allSelectedOptions = s.getOptions();
		WebElement k=allSelectedOptions.get(3);
		String text1 =k.getText();
		System.out.println("Scenario2: "+text1);
		k.click();
		
		//step10
		WebElement country=drive.findElement(By.xpath("//input[@placeholder='Country Name']"));
		country.sendKeys("India");
		JavascriptExecutor js3=(JavascriptExecutor) drive;
		WebElement scroll3=drive.findElement(By.xpath("(//span[text()='Home'])[2]"));
		js3.executeScript("arguments[0].scrollIntoView(false)", scroll3);
		
		
		
		




		
		
		}
	}
	

