import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Demo3ImplicitWait {

	public static void mainmain(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
        WebDriver myD=new ChromeDriver();
        myD.manage().timeouts().ImplicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(myD, 20);
        myD.get("http://www.mortgagecalculator.org/");
        
        
		

	}

}
