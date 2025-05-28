import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int [] conjunto = {1,6,7,8,10,2,3,4,5,12};
            System.out.println("Dado a seguinte coleção:");
                for(int i = 0; i < conjunto.length; i++){
                    System.out.print(conjunto[i]+" ");
                }
                System.out.println();
                System.out.println("Digite a posição mínima a ser buscada: ");
                int minimo = scan.nextInt();
                System.out.println("Digite a posição máxima a ser buscada: ");
                int maximo = scan.nextInt();
                System.out.println("Os valores entre as posições "+minimo+" e "+maximo+" é :");
//-----------------incompleto---------------------//
                System.out.println(valoresEntre(minimo,maximo,conjunto));

        scan.close();
    }
    public static int[] valoresEntre(int minimo, int maximo, int[] conjunto){
        int tamanho = maximo-minimo;
        int [] busca = new int[tamanho];
            for(int i = 0; i < busca.length; i++){
                busca[i] = conjunto[i];
            }
        return busca;
    }
}
