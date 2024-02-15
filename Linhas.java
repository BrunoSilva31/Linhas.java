import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int dobro = i * i;
            int cubo = i * i * i;
            System.out.println("Nº"+ i + " -> Dobro -> " + dobro + " Cubo -> " + cubo);
        }

        sc.close();
    }
}
