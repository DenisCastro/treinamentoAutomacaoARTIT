package suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Navegador {

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

    protected void navegar(String url) { navegador.get(url); }

    protected void click(String xpath)
    {
        navegador.findElement(By.xpath(xpath)).click();
    }

    protected void send(String xpath, String text)
    {
        navegador.findElement(By.xpath(xpath)).sendKeys(text);
    }

    protected void print(Date date) {
        int arquivo = 1;
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
        String formattedDate = df.format(date);
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
        String[] datesplit = formattedDate.split("-");
        String[] horas = datesplit[1].split("_");
        String path = System.getProperty("user.dir") + "/" + datesplit[0] + "/" + horas[0] + "h" + horas[1] + "m" + horas[2] + "s" + "/" + "screenshot_";
        if (screenshot != null) {
            while (true) {
                File f = new File(path + arquivo + ".png");
                if (!f.exists()) {
                    break;
                }
                arquivo++;
            }
            try {
                FileUtils.copyFile(screenshot, new File(path + arquivo + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
