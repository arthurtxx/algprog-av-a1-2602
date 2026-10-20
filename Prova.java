import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  commodity;
        double  cotacaoAtual;
        int     perda;

       
        System.out.println("Digite o nome da commodity: ");
        commodity = sc.nextLine();

        System.out.println("Digite o valor da cotação atual: ");
        cotacaoAtual = sc.nextDouble();
        
        System.out.println("Digite a perda estimada da safra: ");
        perda = sc.nextInt();

        if (perda < 0 || perda > 100) {
            System.out.println("ERRO DETECTADO: Percentual de safra perdida invalido!");
        } else {
            double cotacao_projetada = cotacaoAtual + (perda * 0.10);

            System.out.printf("O Commodity: %s | A Cotação Atual: US$ %.2f%n",
                    commodity, cotacaoAtual);

            System.out.printf("A Cotação Projetada: US$ %.2f%n",
                    cotacao_projetada);

            if (perda > 15 && cotacaoAtual > 50.00) {
                System.out.println("ALERTA DE RISCO: Alta volatilidade no mercado!");
            }
        }

        sc.close();
    }
}
