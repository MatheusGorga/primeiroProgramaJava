import java.util.Scanner;

public class DesafioFinalChatGpt {
    public static void main(String[] args) {
        double saldo = 2500.00;
        double valor;
        String dadosCliente = """
                                ***********************************
                                
                                Nome: Matheus Gorga
                                Tipo conta: Corrente
                                Saldo inicial: R$ %.2f\s
                                
                                ***********************************
                              """.formatted(saldo);
        String menuCliente = """
                              Operações
                                            
                              1 - Consultar saldo
                              2 - Receber valor
                              3 - Transferir valor
                              4 - Sair
                             """;
        Scanner leitor = new Scanner(System.in);

        System.out.println(dadosCliente);
        System.out.println(menuCliente);

        int opcaoCliente = leitor.nextInt();

        while (opcaoCliente != 4) {
            switch (opcaoCliente) {
                case 1 -> System.out.printf("Saldo = R$ %.2f%n", saldo);
                case 2 -> {
                    System.out.print("Quanto você gostaria de receber? R$ ");
                    valor = leitor.nextDouble();
                    if (valor >= 1) {
                        saldo += valor;
                        System.out.printf("Saldo = R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valores menores que zero não podem ser transferidos.");
                    }
                }
                case 3 -> {
                    System.out.print("Quanto você gostaria de transferir? R$ ");
                    valor = leitor.nextDouble();
                    if (saldo >= valor) {
                        saldo -= valor;
                        System.out.printf("Saldo = R$ %.2f%n", saldo);
                    } else {
                        System.out.printf("Você não tem saldo suficiente para essa transferência. Saldo atual: R$ %.2f%n", saldo);
                    }
                }
                default -> System.out.println("Opção inválida. Digite a opção correta:");
            }

            System.out.println(menuCliente);
            opcaoCliente = leitor.nextInt();
        }

        System.out.println("Muito obrigado por visitar nosso banco.");
    }
}