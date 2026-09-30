package notes;

import java.util.Scanner;

public class login {
    public static void main(String args[]) {

        String usuario = "neider";
        String usarioUsuario = "neider";
        boolean valido = usuario.equals(usarioUsuario);
        String password = "neiderc";
        String passwordUsuario = "neiderc";
        boolean validaPassword = password.equals(passwordUsuario);
        if (usuario.equals(usarioUsuario) && password.equals(passwordUsuario))
            {
            System.out.println(" inicio de sesion exitoso");

            }else{
            System.out.println("inicio de sesion invalido");
        }
    }
}
