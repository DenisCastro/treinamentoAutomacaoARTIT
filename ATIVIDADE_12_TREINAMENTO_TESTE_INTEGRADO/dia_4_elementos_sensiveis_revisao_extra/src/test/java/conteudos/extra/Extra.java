package conteudos.extra;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Extra {

    /*

    O método listado abaixo, tira uma evidência da tela no momento que é chamado e salva no formato png em uma pasta com a data de execução (caso a data seja criada como new toda vez que for chamado, será criado uma nova pasta)

     */

    private static WebDriver navegador = null;

    void print(Date date) {
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
