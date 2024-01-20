import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double valorA = sc.nextDouble();
        sc.close();

        double reajuste = (valorA * 100)/ valor;
        reajuste -= 100; 
        

        System.out.printf("%.2f%%\n" , reajuste);
    }
}
