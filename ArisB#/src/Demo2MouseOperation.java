import org.openqa.selenium.By;

public class Demo2MouseOperation
{

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\msedgedriver.exe");
		WebDriver myD = new EdgeDriver();
		myD.get("http://www.youcandealwithit.com/");
		System.out.println("it has navigated to : "+myD.getTitle());
		
		Thread.sleep(4000);
		
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).build().perform();
		Thread.sleep(4000);
		
		myD.findElement(By.linkText("Calculators & Resources")).click();
		
	}
}