package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlinTables {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1900)");
//        List<WebElement> headers=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
//       for (WebElement element:headers){
//           System.out.println(element.getText());
//       }

        for (int i = 2; i <7 ; i++) {
            for (int j = 1; j < 4; j++) {
                WebElement el=  driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]"));
                System.out.println(el.getText());
            }
        }


    }
}
