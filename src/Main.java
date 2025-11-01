import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|=========== CALCULO DO MMC ==========|");
        System.out.println("|=====================================|");
        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.println();
        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();


        int mdc = operaEuclidesMdc(numero1,numero2);
        System.out.print("O MDC de "+ numero1+" e "+numero2+" é = " + mdc );

        System.out.println();

        int mmc = numero1 * numero2 / mdc;
        System.out.print("O MMC de "+ numero1+" e "+numero2+" é = " + mmc);


        sc.close();
    }
    public static int operaEuclidesMdc  (int numero1,int numero2){
        while (numero2 != 0){
            int restoDaDivisao = numero1 % numero2;
            numero1 =  numero2; //numero1 recebeu o penultimo numero do resto
            numero2 = restoDaDivisao;
        }
        return numero1;
    }


}