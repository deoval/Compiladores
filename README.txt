Trabalho de Compiladores

Alunos: Deoval Luis dos Santos Junior
        Pedro Paulo Soares Kastrup Ferreira


Segue em conjunto a esse txt os arquivos jflex e jacc pedidos.

Nós tentamos fazer alguns testes além dos que foram passados no esqueleto do projeto:

** Para o analisador léxico, utilizamos os 4 testes pré-definidos no arquivo testscanner.kt.

Observamos que o sinal de '>' não estava presente na especificação, então utilizamos o mesmo
para simular um erro de análise léxica.

Então para utilizar esse teste é só adicionar essas linhas ao aquivo testscanner.kt

@Test
    fun test5() {
        val f = java.io.FileReader("sinalmaior.java")
        val scan = Scanner(f)
        for (tok in scan.tokens())
            System.out.println(tok)
    }

Além disso será necessário criar um arquivo sinalmaior.java com o seguinte código

class Sinalmaior {
    public static void main(String[] a){
        System.out.println(new Maior().utilizarSinalMaior(10, 9));
    }
}

class Maior {

    public int utilizarSinalMaior(int num1, int num2){
        if (num1 > num2){
            return 1;
        }
        return 0;
    }
}

** Para o analisador sintático fizemos um teste que mostra a ordem de prioridade de alguns operadores

Para executar esse teste é necessário adicionar o código ao arquivo testparser.kt

@Test
    fun test5() {
        val f = java.io.FileReader("prioridade.java")
        var parser = Parser(f)
        parser.parse()
        val saida = parser.saida.toString()
        println(saida)) //Comentar essa linha caso queira ver somente o resultado true, como nos outros testes
        val sr = java.io.StringReader(saida)
        parser = Parser(sr)
        parser.parse()
        val saida2 = parser.saida.toString()
        println(saida == saida2)
    }


Além de criar o arquivo prioridade.java com o seguinte código:

class Prioridade {
    public static void main(String[] a){
        System.out.println(new Operacao().prioridade());
    }
}

class Operacao{

    public int prioridade(){
        int t;
        boolean b;

        t = 3+2*4; //Deve imprimir 11 duas vezes -> * com prioridade sobre +
        System.out.println(11);
        System.out.println(t);

        b = true;
        if (!false && b != false){ //Se der True, esta na ordem correta de !, AND e inigualdade
            System.out.println(1);
        }
        else { System.out.println(2); }

        return 0;
    }
}

Inserimos essa linha "println(saida)" no código para que a estrutura
do programa seja exibida e que as prioridades apareçam, como por exemplo:
"t = (3 + (2 * 4));", onde podemos ver que o a multiplicação tem prioridade sobre a soma.

