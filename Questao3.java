import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra/frase: 1");
        String palavra1 = entrada.nextLine();

        System.out.println("Digite a palavra/frase: 2");
        String palavra2 = entrada.nextLine();

        int i, j;

        int cont = 0;

        if (palavra1.length() == palavra2.length()) {
            for (i = 0; i < palavra1.length(); i++) {
                for (j = 0; j < palavra2.length(); j++) {

                }

                char[] a = palavra1.toCharArray();
                char[] b = palavra2.toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                cont += 1;

                if (Arrays.equals(a, b)) {
                    System.out.println("Anagrama " + cont);


                } else {
                    System.out.println("Não é anagrama" + cont);
                }


            }


        }


    }
}