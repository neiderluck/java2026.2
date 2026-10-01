package notes;

public class metodoconreturn {
    public static void main(String[] args) {
        int resultado = sumardosnumeros(3435 , 3049);
        System.out.println("el resultado de la suma es:" + resultado);
    }
    public static int sumardosnumeros(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;

    }
}
