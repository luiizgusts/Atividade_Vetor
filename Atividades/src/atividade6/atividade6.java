
package atividade6;

import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int num[]= new int[5];
        float q=1;
        int w=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero:");
            num[i]= ler.nextInt();
            q= q*num[i];
            w= w+num[i];
        }
        System.out.println("A soma dos numeros é: "+w+".");
        System.out.println("A multiplicação dos numeros é: "+q+".");
        for (int i = 0; i < 5; i++) {
            System.out.println("Os numeros são: "+num[i]+"."); 
        }
    }
    
    
}
