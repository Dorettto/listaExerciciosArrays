import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("***Bem vindo ao programa dos Arrays***");
        System.out.println("Para começar você deve inserir 6 números no array:");
            int [] conjunto = new int[6];
                for (int i = 0; i < conjunto.length; i++){
                    System.out.println("Insira um número para a posição "+ i);
                    conjunto[i] = scan.nextInt();
                }

        System.out.println("---------------Resultados----------------");
        System.out.println("Seu Array tem "+totalPares(conjunto)+ " pares");
        System.out.println("O maior número do seu array é "+maiorValor(conjunto));
        scan.close();
    }
    public static int totalPares(int[] conjunto){
        int pares = 0;
        for (int i = 0; i < conjunto.length; i ++){
            if(conjunto[i]%2==0){
                pares += 1;
            }
        }
        return pares;
    }
    public static int maiorValor(int[] conjunto){
        int maior = 0;
        for (int i = 0; i < conjunto.length; i++){
            if(conjunto[i]>=maior){
                maior = conjunto[i];
            }
        }
        return maior;
    }
}
