package denis;

import org.junit.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.assertEquals;

public class Teste {

    @BeforeMethod
    public void BeforeTest(ITestResult ITestResult){
        System.out.println("Inicio dos testes "+ ITestResult.getMethod().getMethodName());
    }

    @BeforeClass
    public void beforeClass() {System.out.println("Inicio da classe");}

    @AfterMethod
    public void afterMethod(ITestResult iTestResult){
        String status = iTestResult.getStatus() == 1 ? "Sucesso" : "Falha";
        System.out.println("Depois do teste: "+iTestResult.getMethod().getMethodName()+" - "+status);
    }

    @AfterClass
    public void afterClass() {System.out.println("Fim da classe");}



    @Test()
    public void primeiroTeste() {
        System.out.println("Teste de igualdade string com erro antes do primeiro assert");


        assertEquals(metodoIgualdade("Marcelo","Paulo"));

    }



}
