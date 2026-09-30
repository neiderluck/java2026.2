package notes;

import java.util.Scanner;

public class Elself {
    public static void main(String[] args) {


        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese su Peso:");

        float peso = SC.nextFloat();

        System.out.println("Ingrese su altura:");

        float altura = SC.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            //
            System.out.println("Interpretación: Bajo peso - Menos de 18.5");
        } else if (imc >= 18.5 && imc < 25) {
            //
            System.out.println("Interpretación: Peso normal - 18.5 a 25");
        } else if (imc >= 25 && imc < 30) {
            //
            System.out.println("Interpretación: Sobrepeso - 25 a 30");
        } else {
            //
            System.out.println("Interpretación: Obesidad - 30 o más");
        }



    }
}


