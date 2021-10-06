import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test6 {



@SuppressWarnings("resource")
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004939\\Documents\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//google search
driver.get("https://www.google.com");

String search_data = "SELENIUM";
driver.findElement(By.xpath("//input[@name='q']")).click();
driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).sendKeys("1234");

String searched_data = driver.findElement(By.xpath("//form[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).getAttribute("value");

if ( search_data.equals(searched_data)) {
System.out.print("passs");
}else {
System.out.print("fail");
}
Thread.sleep(3000);
driver.close();



}



}