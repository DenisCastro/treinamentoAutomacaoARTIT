package suites;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import suporte.Navegador;

import java.util.Date;

import static objetos.Login.*;
import static objetos.Index.*;

public class ChangeSuit extends Navegador {

    private static String URL = "http://homolog.change.artit.com.br/logon/index.php";
    private static String USER = "rjtempesta";
    private static String PASSWORD = "123456";

    private static String ASSUNTO = "Teste de Automação";
    private static String RAMAL = "5509";
    private static String CEL = "14 997905465";
    private static String DESCRICAO = "Treinamento de teste de automação";

    @Test(priority = 2, description = "Criar Chamado no Change")
    public void ct02(){
        System.out.println("Criando Chamado");
        click(xButtonCriar);
        click(xComboProjeto);
        click(xIndiceSisInterno);
        click(xButtonProximo);
        send (xInputAssunto,  this.ASSUNTO);
        click(xComboAreaReq);
        click(xIndiceFT);
        send (xInputRamal,    this.RAMAL);
        send (xInputCel,      this.CEL);
        click(xComboTipo);
        click(xIndiceTipo);
        click(xComboSistema);
        click(xIndiceSistema);
        send (xInputDescricao, this.DESCRICAO);
        print(new Date());
        click(xButtonOK);
    }

    @Test(priority = 1, description = "Realiza o Login no Change")
    public void ct01(){
        System.out.println("Realizando Login no Change");
        send (inputUsername, this.USER);
        send (inputPassword, this.PASSWORD);
        System.out.println("Logando");
        click(inputLogin);
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("------------------------INICIAR TESTE------------------------");
        System.out.println("Criar ChromeDriver");
        criarChromeDriver();
        System.out.println("Navegar até: " + this.URL);
        navegar(this.URL);
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Fechar ChromeDriver");
        fecharChromeDriver();
    }
}
