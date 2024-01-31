package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args, String id) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
     driver.manage().window().maximize();
    
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
	   driver.findElement(By.xpath("<button class=\"btn btn-danger" onclick="alertbox()">"));
	   
		
		Alert alert = driver.switchTo().alert();
		
	   System.out.println("Alert text: "+ alert.getText());
	   
		alert.accept();
		

	}

}
