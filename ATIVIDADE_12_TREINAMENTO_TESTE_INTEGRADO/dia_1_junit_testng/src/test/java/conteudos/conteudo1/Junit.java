package conteudos.conteudo1;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Junit {

    /*public static void main(String[] args) {
        System.out.println(metodoSoma(3,4));
        //System.out.println(metodoMultiplicacao(3,4));
    }*/

    private static int metodoSoma(int a, int b){
        return a+b;
    }

    private int metodoMultiplicacao(int a, int b){
        return a*b;
    }

    /*
    Junit foi inicialmente feito para atender à demanda de testes unitários

    Tags:
        @Test - Executa um determinado bloco de código, dispensando artefatos .jar e compiladores via --java
        @Before - É executado antes de todos os @Test
        @BeforeClass - É executado uma vez, antes do primeiro @Before, ou seja, quando a classe compila
        @After - É executado depois de todos os @Test
        @AfterClass - É executado uma vez, depois do ultimo @After, ou seja, assim que os testes terminam

    OBS: As tags podem ser inseridas em qualquer ordem, não impacta na sua execução

    Vantagens:
        Possui integração nativa com muitas ferramentas ótimas como mockito, cucumber, prettyreport, etc.
        Possui chamadas de massa de dados fantásticas, muito fáceis de usar

    Desvantagens:
        Possui limitações de uso
            Exemplo: poucos parâmetros de entrada nos @Before e @After
            Exemplo2: Os métodos @BeforeClass e @AfterClass devem ser estáticos, já o @Before e @After não podem, o que as vezes dificulta a usabilidade


    Segue como exemplo a implementação do assertEquals, serve para comparar variáveis e exibir a comparação caso ocorra falha
     */

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Inicio da classe");
    }

    @Before
    public void before(){
        System.out.println("Antes do teste");
    }

    @After
    public void after(){
        System.out.println("Depois do teste");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Fim da classe");
    }

    @Test
    public void primeiroTeste(){
        System.out.println("Teste de soma");
        System.out.println(metodoSoma(3,4));
    }

    @Test
    public void segundoTeste(){
        System.out.println("Teste de multiplicação");
        System.out.println(metodoMultiplicacao(3,4));
    }

    @Test
    public void testeDeIgualdadeInt(){
        System.out.println("Teste de igualdade inteiros");
        assertEquals(metodoSoma(2,2), metodoMultiplicacao(2,2));
    }

    @Test
    public void testeDeIgualdadeString(){
        System.out.println("Teste de igualdade string");
        assertEquals("Paulo", "Paulo");
    }

    @Test
    public void testeDeIgualdadeStringComErroForcado(){
        System.out.println("Teste de igualdade string com erro");
        assertEquals("Paulo", "paulo");
    }

    @Test
    public void testeDeIgualdadeComErroForcado(){
        System.out.println("Teste de igualdade int com erro");
        assertEquals(metodoSoma(3,2), metodoMultiplicacao(2,2));
    }
}