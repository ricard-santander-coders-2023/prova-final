import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número da questão de 1 a 3 ou 0(zero) para sair: ");
            int selecao = sc.nextInt();
            switch (selecao) {
                case 1:
                    Questao1 questao1 = new Questao1();
                    questao1.executar();
                    break;

                case 2:
                    Questao2 questao2 = new Questao2();
                    questao2.executar();
                    break;

                case 3:
                    Questao3 questao3 = new Questao3();
                    questao3.executar();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Numero de questao invalido");

            }
        sc.close();
    }
}