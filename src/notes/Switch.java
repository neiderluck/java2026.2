
       package Logicanotes;

import java.util.Scanner;

       public class Switch {
           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               System.out.println("Seleccione 1. Cuenta de Ahorro\n" +
                       "2. Credito\n" +
                       "3. Inversion\n" +
                       "4. Mis datos");

               System.out.print("Ingrese una opcion: ");
               int option = sc.nextInt();

               switch (option) {
                   case 1:
                       System.out.println("Seleccionaste Cuenta de Ahorro");
                       // Aqui va tu logica de cuenta de ahorro
                       System.out.print("Ingresa tu saldo: ");
                       double saldo = sc.nextDouble();
                       System.out.println("Tu saldo actual es: " + saldo);
                       break;
                   case 2:
                       System.out.println("Seleccionaste Credito");
                       System.out.println("Tu credito esta en proceso");
                       break;
                   case 3:
                       System.out.println("Seleccionaste Inversion");
                       System.out.println("Tu inversion esta en proceso");
                       break;
                   case 4:
                       System.out.println("Mis datos");
                       System.out.println("Nombre: Estudiante CESDE");
                       System.out.println("Cuenta: Ahorros");
                       break;
                   default:
                       System.out.println("Opcion no valida");
                       break;
               }


           }
       }