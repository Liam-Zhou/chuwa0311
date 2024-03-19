package generic;

public class GeneticMultiArguments {
    public static <T1, T2> void geneticPrint(T1 x, T2 y){
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }

    public static void main(String[] args) {
        geneticPrint(3, "abc");
    }
}


