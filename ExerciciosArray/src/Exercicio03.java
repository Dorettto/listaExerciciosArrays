import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
            int [] V1 = new int[5];
            int [] V2 = new int[5];
            
                for(int i = 0; i < V1.length; i++){
                    System.out.println("Insira os dados do primeiro array: ");
                    V1[i] = scan.nextInt();
                }

                for(int i = 0; i < V2.length; i++){
                    System.out.println("Insira os dados do segundo array: ");
                    V2[i] = scan.nextInt();
                }

            System.err.print("A união dos dois arrays é: \t");
            int [] V3 = uniao(V1, V2);
                for(int i = 0; i < V3.length; i++){
                    System.out.print(V3[i]+"\t");
                }

        scan.close();

    }
    public static int[] uniao(int[] V1, int[] V2){
        int tamanho = V1.length+V2.length;
        int[] V3 = new int[tamanho];
            for(int i = 0; i < V1.length; i++){
                V3[i] = V1[i];
            }
            for(int i = V1.length; i<tamanho; i++){
                V3[i] = V2[i-5];
            }
        return V3;
    }
}
