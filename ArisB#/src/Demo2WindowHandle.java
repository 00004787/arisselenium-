import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class Demo2WindowHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00003751\\Desktop\\Selenium-Training\\chromedriver.exe");
		WebDriver myd=new ChromeDriver();
		myd.get("http://www.gmail.com/");
		System.out.println(myd.getTitle());
		myd.findElement(By.linkText("Help")).click();
		Set<String> GID=myd.getWindowHandle();
		System.out.println(GID);
		Iterator<String> GIT=GID.iterator();
		String GPArent=GIT.next();
		String GChild=GIT.next();
		myd.switchTo().window(GChild);
		System.out.println(myd.getTitle());
		myd.quit();
	}

}
