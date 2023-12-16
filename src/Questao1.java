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

        amortizacaoSAC(saldo, juros, meses);
        sc.close();
    };

    private void amortizacaoSAC(double saldo_devedor_atual, double juros_ao_mes, int total_de_meses){

        double amortizacao = saldo_devedor_atual / total_de_meses;
        double totalValorJuros = 0;
        double totalPrestacao = 0;
        double saldoOriginal = saldo_devedor_atual;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f" +
                " com uma taxa de juros de %.1f%% ao mês\n", amortizacao, saldo_devedor_atual, juros_ao_mes);

        for (int i = 1; i <= total_de_meses; i++) {

            double jurosMensal = (saldo_devedor_atual * juros_ao_mes)/100;
            double parcelaMensal = jurosMensal + amortizacao;
           saldo_devedor_atual -= amortizacao;

            totalValorJuros += jurosMensal;
            totalPrestacao += parcelaMensal;

            System.out.printf("Parcela %d | Juros: R$ %.2f |" +
                    " Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n", i, jurosMensal, parcelaMensal, saldo_devedor_atual);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", totalPrestacao, totalValorJuros, saldoOriginal);

    }

}
