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
