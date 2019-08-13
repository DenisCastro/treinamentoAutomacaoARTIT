package conteudos.conteudo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementosSensiveis {

    /*

    Considerando o que ja foi passado sobre sessões, temos os seguintes elementos:

    Alerta / Popups: São considerados pelo selenium como uma nova janela, sendo que suas validações e interações são um pouco diferenciadas.
    Ao se deparar com um alerta ou popup, a automação será incapaz de prosseguir a menos que o foco da sessão do navegador seja redirecionado para o alerta, para realizar isso podemos utilizar a função de navegador switchTo()

    Exemplo:
        navegador.switchTo().alert()

    Estando no alerta, algumas opções são acessíveis, como por exemplo validar o seu conteúdo de texto e aceitar/fechar o alerta:

    Exemplo de fechar o alerta:
        navegador.switchTo().alert().dismiss();

    Exemplo de captura de texto do alerta:
        navegador.switchTo().alert().getText()

    Exemplo de aceitar o alerta:
        navegador.switchTo().alert().accept();

    OBS: O selenium é incapaz de tirar evidências (screenshots) de um alerta


    Outro elemento problemático é o iframe, em que é interpretado pelo selenium como uma nova 'página' ou visualização dentro da mesma.
    Os erros de iframes são difíceis de se identificar por ter essa interpretação do plugin, normalmente retornando elemento não visível/indisponível.

    Para conseguir atuar com iframes, é necessário relizar mas uma troca de foco com o switchTo.

    Exemplo:
        navegador.switchTo().frame(navegador.findElement(By.xpath(xpath)));

    E após executar as ações almejadas, caso exista a necessidade de 'sair' do iframe ou retornar à visualização normal, utiliza-se o comando defaultContent()

    Exemplo:
        navegador.switchTo().defaultContent();

    Para realizar a mudança de páginas, precisamos informar ao selenium a página que ele está, armazena-la em uma variável eutilizar o switchTo novamente:

    Exemplo:
        Set<String> windows = navegador.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        patName = itr.next();
        chldName = itr.next();
        navegador.switchTo().window(chldName);

    Exemplo para retornar a página inicial:
        navegador.switchTo().window(patName);

     */

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

    protected void send(String xpath, String text)
    {
        navegador.findElement(By.xpath(xpath)).sendKeys(text);
    }

}