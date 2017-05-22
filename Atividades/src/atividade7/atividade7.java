
package atividade7;

import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int idade[]= new int[5];
        double alt[]= new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual a altura da pessoa?");
            alt[i]=ler.nextDouble();
            System.out.println("Qual a idade?");
            idade[i]=ler.nextInt();
        }
        for (int i = 4; i > -1; i--) {
            System.out.println("A idade da "+i+" pessoa é: "+idade[i]+".");
            System.out.println("A altura da "+i+" pessoa é: "+alt[i]+".");           
        }
    }
    
}
