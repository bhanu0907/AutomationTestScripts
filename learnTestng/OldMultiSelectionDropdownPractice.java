package learnTestng;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldMultiSelectionDropdownPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement iDe=driver.findElement(By.id("ide"));
		Select ideNAmes=new Select(iDe);

		List<WebElement> options=ideNAmes.getOptions();

		System.out.println("size of the options ="+options.size());

		for(WebElement option:options) {
			System.out.println(option.getText()+"    "+option.getAttribute("value"));

		}
		System.out.println("++++++++++++");
		ideNAmes.selectByIndex(0);
		ideNAmes.selectByValue("vs");
		ideNAmes.selectByVisibleText("IntelliJ IDEA");

		List<WebElement> selectedOptions=ideNAmes.getAllSelectedOptions();
		for (WebElement before : selectedOptions) {
			System.out.println(before.getText());
		}
		System.out.println(ideNAmes.isMultiple());
		System.out.println("+++++++++++");
		ideNAmes.deselectByIndex(0);
		ideNAmes.deselectByValue("");
		//	ideNAmes.deselectAll();
		List<WebElement> afterDeselect=ideNAmes.getAllSelectedOptions();

		for (WebElement after : afterDeselect) {
			System.out.println(after.getText());
		}
	}

}
