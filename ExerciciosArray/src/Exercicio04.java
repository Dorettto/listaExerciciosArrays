import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("**BEM VINDO AO JOGO: QUAL É O FILME?**");
            System.out.println("Para começar, digite o nome do filme: ");
            String filme = scan.nextLine();

            String [] pista = new String[5];

            for(int i = 0; i < 5; i++){
            String vez = "";
                switch(i){
                    case 0 -> vez = "primeira";
                    case 1 -> vez = "segunda";
                    case 2 -> vez = "terceira";
                    case 3 -> vez = "quarta";
                    case 4 -> vez = "quinta";
                }
                System.out.println("Digite a "+vez+" pista");
                pista[i] = scan.nextLine();
            }

            System.out.println("**PISTAS COLETADAS**");
            System.out.println("Agora é a vez do segundo jogador."); 

            System.out.println("Primeira pista: "+pista[1]);
            String chute;

        scan.close();
    }
}
