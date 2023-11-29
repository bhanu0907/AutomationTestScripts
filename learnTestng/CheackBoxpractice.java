package learnTestng;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import learnTestng.TestLib;

public class CheackBoxpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		WebElement female= driver.findElement(By.id("femalerb"));
		if (!female.isSelected()) 
			female.click();
		WebElement	 hindi_chk=	driver.findElement(By.id("hindichbx"));
		cheackOrUncheckElement(hindi_chk, true);
		/*if(!hindi_chk.isSelected());
		hindi_chk.click();*/

		WebElement spin_chk=driver.findElement(By.id("spanishchbx"));
		cheackOrUncheckElement(spin_chk, true);
		/*if(!spin_chk.isSelected())
			spin_chk.click();*/
		Thread.sleep(3000);
		if(hindi_chk.isSelected());
		hindi_chk.click();
	}
		
	public static void cheackOrUncheckElement(WebElement element,boolean targetState)
		{
			
			if(element.isSelected()) {
				if(!targetState)
					element.click();
				}
			else
			{
				if(targetState)
				element.click();
			}
			
		}}
		