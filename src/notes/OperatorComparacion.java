package notes;

public class OperatorComparacion {

    public static void main(String[] args) {
        //operadores de comparacion >,<, >=,<=,==

        int num3 = 500;
        int num4 = 380;
        int num5 = 500;
        String num6 = "dos";
        String num7 = "dos";

        boolean resultado = num3 <= num4;
        System.out.println("resultado" + resultado);

        boolean esIgual = num3 == num5;
        System.out.println("resultado" + esIgual);

        boolean esIgualValor = num6 == num7;
        System.out.println("resultado" + esIgualValor);

        boolean esEqual = num6.equals(num7);
        System.out.println("resultado" + esEqual);


    }
}
