package conteudos.revisao;

public class Revisao {

    //COMENTÁRIOS-------------------------------------------------------------------------------------------------------
    //Exemplo de comentário

    /*
    Exemplo de comentário para multiplas linhas
     */

    //TODO exemplo de comentário em highlight

    //PACOTES-----------------------------------------------------------------------------------------------------------
    /*
    Pacotes (packages) java são todas as pastas dentro dos diretórios delimitados pelo compilador como fonte do java
    Pacotes devem sempre começar com letras minusculas
    Exemplo:
        idea                    -não é um pacote
        src                     -não é um pacote
            main                -não é um pacote
                java            -diretório delimitador
                resources       -não é um pacote
            test                -não é um pacote
                java            -diretório delimitador
                    conteudos   -pacote java
                resources       -não é um pacote
     */

    //CLASSES-----------------------------------------------------------------------------------------------------------
    /*
    Classes e interfaces são os arquivos java que contém fonte para ser compilados
        Classes devem sempre começar com letras maiúscula
        Classes e interfaces devem sempre estar dentro dos diretórios java
        CamelCase para classes e variáveis, é a escrita mais indicada
            Exemplo de CamelCase: ClasseDoPrimeiroDia
     */

    //STATIC------------------------------------------------------------------------------------------------------------
    /*
    Métodos ou variáveis estáticas (static) são itens que pertencem à classe e não à sua instância
    Métodos ou variáveis estáticas só conseguem 'conversar' com métodos e variáveis estáticas
    Exemplo:
        Para uma chamada de classe A, define-se a variável int a = 0 e posteriormente, atribui-se o valor a = 10;
            Se a variável for estática, em uma segunda chamada à classe A, ainda teremos o valor 10.
            Se a variável não for estática, em uma segunda chamada à classe, seu valor volta a ser 0 (valor de compilação)

    OBS: Simplificando, métodos e variáveis estáticos mantém valores até que algum método os apaque, já os não estáticos tem seus valores zerados à cada chamada
     */

    //TIPOS DE VARIÁVEIS------------------------------------------------------------------------------------------------

    /*
    int - inteiros; numeros sem casas decimais de até 4 bytes
    long - numeros sem casa decimais de até 8 bytes
    float - numeros contendo casas decimais de até 4 bytes
    double - numeros contendo casas decimais de até 8 bytes
    String - textos
    char - caracteres individuais
    boolean - verdadeiro ou falso/true ou false
    Object - container generalizado, armazena qualquer dado (gasta mais memória)
     */

    //CONSTRUÇÃO DE METODOS---------------------------------------------------------------------------------------------
    /*
    Um método é construído da seguinte forma

        1 - Seu nível de acesso (exemplo: public, private, protected)
            OBS: O mesmo pode ser ignorado, e então, o nível de acesso será restrito apenas para classes do mesmo pacote

        2 - Seu retorno (void, String, int, boolean, etc)
            OBS: Qualquer variável ou objeto pode ser retornado de um método
            OBS2: Salvo nulo, qualquer retorno declarado torna obrigatório o uso da função 'return'

        3 - Seu nome sem espaços ou caracteres especiais (exemplo: meuPrimeiroMetodo)
            OBS: Métodos, assim como pacotes, devem iniciar apenas com letras minusculas, letras maiúsculas são apenas para classes
            OBS: Assim como classes, métodos devem ser escritos em CamelCase

        4 - Seus parâmetros de entrada (exemplo: int posicaoX, int posicaoY)
            OBS: Qualquer variável ou objeto pode ser um parâmetro de entrada de um método

    Exemplo de método construído:

        public int metodoSoma(int a, int b){
            return a+b;
        }

    //CHAMADAS DE METODOS-----------------------------------------------------------------------------------------------

    Para chamar um método, basta digitar o seu nome (considerando instanciação de classes e hierarquia) e inserir seus argumentos.

    Exemplo:
        metodoSoma(2,3);

    Exemplo considerando uma chamada de outra classe:
        new Revisao().metodoSoma(2,3);

    Exemplo considerando uma chamada de outra classe2:
        Revisao revisao = new Revisao();
        revisao.metodoSoma(2,3);

    Exemplo considerando o método como estático:
        Revisao.metodoSoma(2,3);

    Exemplo considerando o método como estático2:
        import static conteudos.revisao.Revisao.metodoSoma;
        metodoSoma(2,3);

    Exemplo considerando hierarquia de classes:
        public class Exemplo extends Revisao
        metodoSoma(2,3);

     */

    //MAVEN-------------------------------------------------------------------------------------------------------------

    /*
    Maven é um controlador de artefatos/dependências (Outro exemplo é o gradle)

    Através do arquivo POM.xml, localizado sempre na raiz do projeto, é possível inserir uma série de configurações do projeto
    Exemplo:
        Como estamos utilizando os plugins Junit e TestNG, colocamos a dependência no maven na tag <dependencies> e os arquivos .jar são automaticamente baixados para o nosso %appdata% e inseridos no projeto

     */

}
