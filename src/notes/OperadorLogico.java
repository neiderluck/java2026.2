package notes;

public class OperadorLogico {
    public static void main(String[] args) {


        int key = 3030;
        int keyUser = 3030;
        boolean validateKey = keyUser == key;

        String user = "juan";
        String userUser = "juan";

        boolean validateUser = userUser.equals(user);
        boolean validateCredentials = validateKey &&  validateKey;
        System.out.println("iniciando secion" + validateCredentials);
    }
}
