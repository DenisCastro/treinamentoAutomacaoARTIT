package denis;

import conteudos.conteudo1.Selenium;
import org.testng.annotations.Test;

public class Login extends Selenium {

    public static String URL = "http://homolog.change.artit.com.br/logon/index.php";
    public static String xpathUsername = "//input[@name=\"username\"]";
    public static String xpathPassword = "//input[@class=\"password\"]";
    public static String xpathButtonLogin = "//input[@type=\"submit\"]";

    @Test
    public void testeLogin () {
        criarChromeDriver();
        navegar(this.URL);

         send(xpathUsername, "dlcastro");
         send(xpathPassword, "Artit@2018");
         click(xpathButtonLogin);



    }


}

