package week2.day1homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
						WebDriverManager.chromedriver().setup();
						ChromeDriver driver=new ChromeDriver();
						driver.get("http://leaftaps.com/opentaps/control/main");
						driver.manage().window().maximize();
						//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
						//xpath-uname
						driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
						//driver.findElement(By.id("password")).sendKeys("crmsfa");
						//xpath-pwd
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
						//driver.findElement(By.className("decorativeSubmit")).click();
						//xpath-click
						driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
						
						//driver.findElement(By.linkText("CRM/SFA")).click();
						//xpath-crm/sfa link
						////tagName[contains(text(),'textValue')]
						driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
						
						//driver.findElement(By.linkText("Leads")).click();
						//xpath-click on leads
						driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
						
						//driver.findElement(By.linkText("Create Lead")).click();
						//xpath-createlead
						driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
						
						//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Ltd");
						//xpath-companyname
						driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC Company");
						
						//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Asma");
						driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("asma");
					
						
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
						driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Practise");
						driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asmunazeer@gmail.com");
						//state/provincd dropdown
						WebElement ele1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
						Select dd1=new Select(ele1);
						dd1.selectByVisibleText("New York");
						driver.findElement(By.className("smallSubmit")).click();
						driver.findElement(By.linkText("Edit")).click();
						WebElement ele3=driver.findElement(By.id("updateLeadForm_description"));
						ele3.clear();
						driver.findElement(By.name("importantNote")).sendKeys("Priority notes");
						driver.findElement(By.className("smallSubmit")).click();
						System.out.println("Title of page is"+driver.getTitle());
						driver.findElement(By.linkText("Duplicate Lead")).click();
						WebElement ele4=driver.findElement(By.id("updateLeadForm_companyName"));
						ele.clear();
						ele.sendKeys("hidi ltd");
						WebElement ele5=driver.findElement(By.id("updateLeadForm_firstName"));
						ele5.clear();
						ele.sendKeys("hiddah");
						driver.findElement(By.id("ext-gen593")).click();
						System.out.println("Title of page is"+driver.getTitle());
						driver.close();
					
			}

		}

