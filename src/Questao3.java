import java.util.Locale;
import java.util.Scanner;

public class Questao3 implements Questoes {
    public Questao3() {
    }

    public void executar() {
        System.out.println("Essa e a questão 3");

        // digitar "." nos valores double estavam retornando erro de tipo
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número: ");
        int tamanho = sc.nextInt();

        montaPiramide(tamanho);
        montaPiramideInvertida(tamanho);

        sc.close();
    }

    private void montaPiramide(int tamanho) {

        // piramide normal
        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void montaPiramideInvertida(int tamanho) {
        //piramide invertida
        for (int i = tamanho; i >= 1; i--) {
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = tamanho; j >= i; j--) {
                System.out.print(" ");
            }
        }
    }


}
