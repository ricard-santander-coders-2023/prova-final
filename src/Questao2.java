import java.util.Locale;
import java.util.Scanner;

public class Questao2 implements Questoes {
     public void executar() {
        System.out.println("Essa e a questão 2");

         // digitar "." nos valores double estavam retornando erro de tipo
         Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ;
        System.out.print("Informe a temperatura: ");
        double temperatura = sc.nextDouble();
        sc.nextLine();
        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F] ");
        String origem = sc.nextLine().toUpperCase();
        System.out.print("Qual unidade de destino dessa temperatura? [C, K, F] ");
        String destino = sc.nextLine().toUpperCase();

        conversorTemperatura(temperatura, origem, destino);
        sc.close();
    }

    private void conversorTemperatura(double temperatura, String origem, String destino) {
        double tempOrigem = 0;
        double tempDestino = 0;

        //Converte entrada para celsius
        switch (origem){
            case "F":
                tempOrigem = (temperatura - 32) * 5 / 9;
                break;
            case "K":
                tempOrigem = temperatura - 273.15;
                break;
            default:
                tempOrigem = temperatura;
                break;
        }

        switch (destino){
            case "F":
                tempDestino = (tempOrigem * 9 / 5) + 32;
                break;
            case "K":
                tempDestino = 273.15 + tempOrigem;
                break;
            default:
                tempDestino = tempOrigem;
                break;
        }

        System.out.printf("%.2f %s = %.2f %s", temperatura, origem, tempDestino, destino);
        System.out.println();
    }

    ;

}
