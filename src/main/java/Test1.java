import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/");
		driver.findElement(By.id("addoption")).click();
		driver.findElement(By.id("title")).sendKeys("Ore naalil panakkarar aavadhu eppadi?");
		driver.findElement(By.id("author")).sendKeys("Santhan");
		driver.findElement(By.id("button")).click();
		
	}

}
