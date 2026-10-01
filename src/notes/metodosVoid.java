package notes;

public class metodosVoid {
    public static void main(String[] args) {
        Saludarporelnombre("juan");
        sumardosnumeros(320 , 932);
    }

    public static void Saludarporelnombre (String nombre){
        System.out.println("hola" + nombre);
    }
    public static void sumardosnumeros(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println( "resultado: " + resultado);
    }
}
