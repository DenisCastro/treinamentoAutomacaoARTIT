package conteudos.conteudo2;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class TestNG {
    /*
    O TestNG foi feito à partit do Junit, tentando aprimorar as suas 'falhas' e também inserir outras funcionalidades

    Assim como no Junit, o testNG possui as mesmas tags, sendo elas
        @Test - Executa um determinado bloco de código, dispensando artefatos .jar e compiladores via --java
        @BeforeMethod - É executado antes de todos os @Test
        @BeforeClass - É executado uma vez, antes do primeiro @Before, ou seja, quando a classe compila
        @AfterMethod - É executado depois de todos os @Test
        @AfterClass - É executado uma vez, depois do ultimo @After, ou seja, assim que os testes terminam

    OBS: As tags podem ser inseridas em qualquer ordem, não impacta na sua execução

    Vantagens:
        Correções de alguns problemas, como por exemplo a implementação forçada de static para @BeforeClass e @AfterClass
        Uma variedade enorme de parâmetros de entrada, listeners, construtores e confugrações de qualidade

    Desvantagens:
        Pouca integração com massa de testes


    Segue como exemplo:
        A implementação do Assert.assertEquals, serve para comparar variáveis e exibir a comparação caso ocorra falha
        A implementação do SoftAssert, que não impede a execução até que se chame o método assertAll();
        A utilização do parametro 'priority' que ordena quais testes devem ser executados primeiro
        A utilização do parametro 'dependsOnMethods' que não executa o teste, caso algum método declarado tenha falhado
        A utilização do parametro 'description' que insere uma descrição para o teste (útil para relatórios e acompanhamento)
     */

    @BeforeMethod
    public void beforeTest(ITestResult iTestResult){
        System.out.println("Antes do teste - "+iTestResult.getMethod().getMethodName());
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Inicio da classe");
    }

        @AfterMethod
        public void afterMethod(ITestResult iTestResult){
            String status = iTestResult.getStatus() == 1 ? "Sucesso" : "Falha";
            System.out.println("Depois do teste - "+iTestResult.getMethod().getMethodName()+" - "+status);
        }

    @AfterClass
    public void afterClass(){
        System.out.println("Fim da classe");
    }

    @Test(priority = 3, description = "Exemplo de descrição de teste")
    public void primeiroTeste(){
        System.out.println("primeiro teste");
    }

    @Test(priority = 2)
    public void segundoTeste(){
        System.out.println("Teste de igualdade string com erro");
        Assert.assertEquals("Paulo", "paulo");
        new SoftAssert().assertEquals("Paulo", "paulo");
    }

    @Test(priority = 1)
    public void terceiroTeste(){
        System.out.println("Teste de igualdade string com erro antes do primeiro assert");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Paulo", "paulo");
        System.out.println("Teste de igualdade string com erro depois do primeiro assert");
        softAssert.assertEquals("Marcelo", "paulo");
        System.out.println("Teste de igualdade string com erro depois do segundo assert");
        softAssert.assertAll();
    }

    @Test(priority = 4, description = "Exemplo de descrição de teste", dependsOnMethods = {"primeiroTeste", "segundoTeste"})
    public void quartoTeste(){
        System.out.println("quarto teste");
    }
}
