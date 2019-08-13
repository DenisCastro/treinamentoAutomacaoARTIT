package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Seleium {
    private static WebDriver navegador;

    protected void criarChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
    }

    protected void fecharChromeDriver()
    {
        navegador.quit();
    }

    protected void navegar(String url)
    {
        navegador.get(url);
    }

    protected void click(String xpath)
    {
        navegador.findElement(By.xpath(xpath)).click();
    }

    protected void clear(String xpath)
    {
        navegador.findElement(By.xpath(xpath)).clear();
    }

    protected void send(String xpath, String text)
    {
        navegador.findElement(By.xpath(xpath)).sendKeys(text);
    }

}
