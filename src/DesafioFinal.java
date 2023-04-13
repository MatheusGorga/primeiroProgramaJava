import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        double saldo = 2500.00;
        double valor = 0;
        String dadosCliente;
        String menuCliente;
        int opcaoCliente;

        Scanner leitor = new Scanner(System.in);

        dadosCliente = """
                        ***********************************
                        
                        Nome: Matheus Gorga
                        Tipo conta: Corrente
                        Saldo inicial: R$ """
                        + saldo +
                        """ 
                        
                        
                        ***********************************
                        """;
        menuCliente = """
                  
                        Operações
                                        
                        1- Consultar saldos
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                """;
        System.out.println(dadosCliente);
        System.out.println(menuCliente);
        System.out.println("Digite a opção desejada : ");
        opcaoCliente = leitor.nextInt();

        if (opcaoCliente == 1){
            System.out.println("Saldo = " + saldo);

        } else if (opcaoCliente == 2) {
            System.out.println("Quando voce gostaria de receber = ");
            valor = leitor.nextInt();
            if (valor >= 1) {
                saldo += valor;
                System.out.println("Saldo = " + saldo);
            } else {
                System.out.println("Valores menore que zero nao podem ser transferidos ");

            }


        } else if (opcaoCliente == 3) {
            System.out.println("Quando voce gostaria de transferir = ");
            valor = leitor.nextInt();
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saldo = " + saldo);
            } else {
                System.out.println("Voce nao tem saldo suficiente para essa transferencia " + saldo);

            }

        } else if (opcaoCliente == 4) {
            System.out.println("Muito Obrigado por visitar nosso banco");


        }else {
            System.out.println("Não temos essa opção digite a opção correta");
            System.out.println(menuCliente);
            opcaoCliente = leitor.nextInt();
        }


    }
}
