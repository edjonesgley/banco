import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {

        String cabecalho = """
                *************************************************
                Dados iniciais do cliente:

                Nome:              Edjones Gley Lima Silva
                Tipo de conta:     Conta Corrente
                Número da conta:   1234-5
                Agência:           1234-5
                Saldo inicial:     R$ 2500,00

                *************************************************""";

        String opcoes = """
                Opções de operação:

                1 - Depositar
                2 - Sacar
                3 - Transferir
                4 - Extrato
                5 - Sair""";

        System.out.println(cabecalho);
        System.out.println(opcoes);

        // Inicializar variaveis

        double saldo = 2500.00;

        // Entrada de dados do usuário

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        while (opcao!= 5){

            System.out.println(opcoes);
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

        switch (opcao) {
            case 1: System.out.println("Digite o valos do deposito: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Deposito realizado com sucesso! Novo saldo: R$ " + saldo); //scanner.close();
                break;
            case 2: System.out.println("Digite o valor do saque: ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente para saque!");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
                }
                break;
            case 3: System.out.println("Digite o valor da transferencia: ");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente para transferencia!");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Transferencia realizada com sucesso! Novo saldo: R$ " + saldo);
                }scanner.close();
                break;
            case 4: System.out.println("Extrato: ");
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            case 5: System.out.println("Transação encerrada!");
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;

            default:
                break;


        }

    }}
}




