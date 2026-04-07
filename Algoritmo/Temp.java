import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        
    Scanner ls = new Scanner(System.in);
    double soma = 0, media;
    int temp;

    for(int i = 1; i <= 12; i++){

    System.err.println("\nDigite a temperatura " + i + " (entre 4 e 10)");
    temp = ls.nextInt();

    if(temp >= 4 && temp <= 10){
    soma += temp;
    }else{

    while (temp < 4 || temp > 10) {
    System.err.println("Digite novamente " + i + " (entre 4 e 10)");
    temp = ls.nextInt();
    }

    }

    }

    media = soma / 12;

    System.out.printf("A média de hoje das temperaturas é: : %.2f", media , "º C");
    ls.close();

    }
}
