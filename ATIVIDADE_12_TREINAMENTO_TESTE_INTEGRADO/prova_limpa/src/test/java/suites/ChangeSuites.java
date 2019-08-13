package suites;

        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;
        import suporte.Seleium;
        import static objects.Login.*;
        import static objects.Index.*;

public class ChangeSuites extends Seleium {

    @BeforeClass
    public void iniciarChromeDrive () {
        criarChromeDriver();
        navegar("https://homolog.rosie.artit.com.br/auth/login");
    }

    @Test()
    public void buscarColaboradores() throws InterruptedException {
        send(xpathUsername, "dlcastro");
        send(xpathPassword, "Artit@2018");
        click(xpathLogin);
        click(xpathButtonColaboradores);
        click(xpathInputBuscar);
        send(xpathInputBuscar, "Denis Augusto");
        Thread.sleep(3000);
        clear(xpathInputBuscar);
        send(xpathInputBuscar, "Felipe");
        Thread.sleep(3000);
        clear(xpathInputBuscar);
        send(xpathInputBuscar, "Reykard");
        Thread.sleep(3000);
        clear(xpathInputBuscar);
    }

}
