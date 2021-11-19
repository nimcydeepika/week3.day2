package week3.assignment;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProgram{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags"+"\n");
		WebElement radio=driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));
		radio.click();
		WebElement radio_b1=driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"));
		radio_b1.click();
		Thread.sleep(2000);
        List<WebElement>vs=driver.findElements(By.xpath("//div[@class='length']"));
        System.out.println("total no of web page:"+vs.size());
        for(WebElement product:vs) {
        	System.out.println(product.getText());
        	System.out.println("<===================================>");
        }
	}

}
