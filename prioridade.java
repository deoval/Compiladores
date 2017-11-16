
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