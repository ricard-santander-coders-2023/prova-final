import java.util.Locale;
import java.util.Scanner;

public class Questao1 implements Questoes{


    public void executar(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);;
        System.out.println("Essa e a questão 1");

        System.out.print("Saldo total: ");
        double saldo = sc.nextDouble();

        System.out.print("Taxa juros/mes(%): ");
        double juros = sc.nextDouble();

        System.out.print("Total meses: ");
        int meses = sc.nextInt();

        amortizacao(saldo, juros, meses);
        sc.close();
    };

    private void amortizacao(double saldo_devedor_atual, double juros_ao_mes, int total_de_meses){

        double saldoDevedor = saldo_devedor_atual;
        double totalAmortizado = 0;
        double totalJuros = 0;

        double amortizacao = saldo_devedor_atual / total_de_meses;
        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com uma taxa de juros de %.1f%% ao mês\n", amortizacao, saldo_devedor_atual, juros_ao_mes);

        for (int i = 1; i <= i; i++) {

            double jurosMensal = total_de_meses * (juros_ao_mes / 100);
            double prestacaoMensal = jurosMensal + amortizacao;

            total_de_meses -= amortizacao;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, jurosMensal, prestacaoMensal, total_de_meses);
        }
    }

}
