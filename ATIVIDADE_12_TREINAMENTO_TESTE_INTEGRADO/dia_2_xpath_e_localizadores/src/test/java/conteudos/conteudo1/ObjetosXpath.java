package conteudos.conteudo1;

public class ObjetosXpath {

    /*
    Xpath é um localizador de elementos web, uma ferramenta de busca estruturada que armazena o 'endereço' de um elemento na web

    Existem dois tipos de xpath, o relacional que insere valores e atributos para realizar a busca por um ou mais elementos específicos e o xpath absoluto que descreve toda a estrutura da página até o elemento

    Exemplo de xpath absoluto:

    /html/body/div/div/div/a/i

    Construindo xpaths relacionais:

    1 - '//' ou '/' inicia uma busca por elementos web via xpath
    OBS: '//' serve para realizar a busca de forma recursiva, ou seja, dentro de todos os elementos 'filhos', já '/' serve apenas para o próximo elemento 'filho'

    2 - Tipo do elemento (exemplo: input, a, button, etc)
    OBS: O * também pode ser usado como localizador de elementos

    3 - (Opcional) @ + Atributos do elemento a ser procurado envolvidos por colchetes (exemplo: [@value], [@id], [@href], etc)
    OBS: O texto é o unico elemento que não é iniciado com @ e sim como 'text()'
        3.1 - (Opcional) Valores dos atributos do elemento (exemplo: [@value="test"], [@id="user"])
        OBS: A leitura é 'at value equals test' ou seja, "em que o atributo value é igual a test"
            3.1.1 - (Opcional) Contains
            - O contains muda a extrutura de atribuição de valor, como não estamos buscando o valor extato, a nova construção fica: //input[contains(@value, "tes")], o navegador irá então tentar encontrar um input com o value contendo o valor "tes"

            3.1.2 - (Opcional) Not
            - O not irá retornar o resultado negativo da busca, ou seja, na busca //a[not(@id="pass")] o navegador retornará o primeiro elemento 'a' sem o id pass

            3.1.3- (Opcional) StartsWith
            - O StartsWith retorna valores que iniciam com o parametro inserido, exemplo: //div[starts-with(@id,"com")] retorna o primeiro 'div' que o id começa com 'com'

            3.1.4- (Opcional) EndsWith
            - O EndsWith retorna valores que finalizam com o parametro inserido, exemplo: //div[starts-with(@id,"foo")] retorna o primeiro 'div' que o id termina com 'foo'

        3.2 - (Opcional) ancestor::
        - Realiza a busca nos elementos acima da hierarquia, ou seja, realiza uma busca nos elementos 'pai'.
        - Como resultado da pesquisa //span//ancestor::a teremos o primeiro elemento 'a' que é 'pai' de um elemento span


    Exemplo de xpath completo para retornar o primeiro 'a' que não contém no atributo 'id' o caractere 'd' e que é 'pai' do elemento 'span' que contém o texto 'relative' no atributo classe e que tem o valor '10' no atributo 'value'

    //span[contains(@class,"relative")][@value="10"]//ancestor::a[not(contains(@id, "d"))]

    Ao escrever os xpaths para testes automatizados, é sempre recomendado utilizar o conceito de page objects. Page objects é a divisão de xpaths por página, criando assim classes 'containers' que terão todos os xpaths para a página equivalente e essa, podendo ser acessada por qualquer outra classe, tendo a reutilização desse código.

     */

    public static String meuXpath = "//span[contains(@class,\"relative\")][@value=\"10\"]//ancestor::a[not(contains(@id, \"d\"))]";

}