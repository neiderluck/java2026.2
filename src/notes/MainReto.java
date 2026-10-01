package notes;

public class MainReto {
    public static void main(String[] args) {

        float resultado = notas(3.4f , 4.2f , 2.9f);
        System.out.println("nota promedio: " + resultado);
    }
    public static float notas(float nota1, float nota2, float nota3){
        float resultado = (nota1 + nota2 + nota3) /3;
        return resultado;
    }
}
