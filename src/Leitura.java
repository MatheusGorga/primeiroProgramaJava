import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Digite ano do filme");
        int ano = leitura.nextInt();
        System.out.println(ano);

        System.out.println("Digite avaliação do filme");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);


    }
}
