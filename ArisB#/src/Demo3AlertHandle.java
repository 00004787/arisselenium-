import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3AlertHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
        WebDriver myD=new ChromeDriver();
        myD.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(4000);
        myD.findElement(By.xpath("//button[text()="Click mel']")).click();
        		
	}

}
