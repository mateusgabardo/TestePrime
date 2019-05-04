package Teste;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercadoLivre {
		
	private  WebDriver driver;
		
		@Before
		public void beforeTest ( ) {
			//Abrir navegador fire fox
			System.setProperty("webdriver.gecko.driver", "C:\\Drives\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}
		@Test
		public void buscarPrimeControl ( ) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Drives\\geckodriver.exe");
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Mercado Livre", Keys.RETURN);
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[1]/div[3]/div/ol/li/div[1]/a[2]/h3")).click();
			driver.findElement(By.xpath("/html/body/header/div/form/input")).sendKeys("Camiseta", Keys.RETURN);

		}
		
		
		
		@After
		public void afterTest () throws InterruptedException
			{
				Thread.sleep(4000);
				
				driver.quit();
			}
		
		
		
		
		
		
			
			//valida
			//assertEquals(1, 1);
		
}
	
	
	

