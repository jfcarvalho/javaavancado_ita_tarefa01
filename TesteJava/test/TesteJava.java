import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteJava {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://localhost:8787/JavaAvancado_01/");
    driver.findElement(By.name("temp")).click();
    driver.findElement(By.name("temp")).clear();
    driver.findElement(By.name("temp")).sendKeys("100");
    driver.findElement(By.xpath("//html")).click();
    driver.findElement(By.name("Converter")).click();
    assertEquals(driver.findElement(By.cssSelector("span")).getText(), "212.0");
  }
  
   @Test
  public void testUntitledTestCase2() throws Exception {
    driver.get("http://localhost:8787/JavaAvancado_01/");
    driver.findElement(By.name("temp")).clear();
    driver.findElement(By.name("temp")).sendKeys("212");
    new Select(driver.findElement(By.name("op"))).selectByVisibleText("Fahrenheit para Celsius");
    driver.findElement(By.name("Converter")).click();
    assertEquals(driver.findElement(By.cssSelector("span")).getText(), "100.0");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}