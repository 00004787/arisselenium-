import org.openqa.selenium.By;

public class Demo2select
{

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD = new EdgeDriver();
		myD.get("http://www.mortgagecalculator.org/");
		System.out.println("it has navigated to : "+myD.getTitle());
		
		Thread.sleep(4000);
		
		select select=new select(myD.findElement(By.name("param[start_month")));
		select.selectByIndex(4);
		Thread.sleep(4000);
		select.selectByIndex("8");
		Thread.sleep(4000);
		select.selectByVisibleText("Dec");
		Thread.sleep(4000);
		myD.close();
		
	}
}