import org.openqa.selenium.By;

public class Demo1Elements5
{

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
		WebDriver myD = new EdgeDriver();
		myD.get("http://www.google.com/");
		System.out.println("it has navigated to : "+myD.getTitle());
		
		int vSize=myD.findElements(By.tagName("a")).size();
		System.out.println(vSize);
		
		for(int i=0;i<vSize;i++) {
			String vLink=myD.findElement(By.tagName("a")).get(i).getText();
			System.out.println(vLink);
		}
		myD.close();
		

	}
}