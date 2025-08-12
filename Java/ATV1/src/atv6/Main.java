package atv6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, fat;

        System.out.print("Digite um valor (max. 17): ");
        num = scan.nextInt();

        fat = 1; 
        int i = num; 

        while (i > 1) {
            fat = fat * i; 
            i--;           
        }

        System.out.println("Fatorial de " + num + " é: " + fat);
        
        scan.close();
    }
}
