package week2.day1homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Ltd");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Asma");
			
				
				//dropdown
				
				WebElement ele=driver.findElement(By.id("createLeadForm_dataSourceId"));
				//create object for "select" class
				Select dd=new Select(ele);
				
				//id,index,visible text
				//dd.selectByVisibleText("Direct Mail");
				//dd.selectByIndex(4);
				dd.selectByValue("LEAD_PARTNER");
				
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kouser");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Asmu");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				WebElement elDesc = driver.findElement(By.id("createLeadForm_description"));
				elDesc.sendKeys("Learning Automation");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asmunazeer@gmail.com");
				//state/provincd dropdown
				WebElement ele1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd1=new Select(ele1);
				dd1.selectByVisibleText("New York");
				driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.linkText("Edit")).click();
				Thread.sleep(3000);
				WebElement ele3=driver.findElement(By.id("updateLeadForm_description"));
				Point location = ele3.getLocation();	
				System.out.println(location);
				ele3.clear();
				ele3.sendKeys("selenium Practice");
				Dimension size = ele3.getSize();
				System.out.println(size);				
				driver.findElement(By.name("importantNote")).sendKeys("Priority notes");
				driver.findElement(By.className("smallSubmit")).click();
				System.out.println("Title of page is"+driver.getTitle());
				driver.close();
			
	}

}
