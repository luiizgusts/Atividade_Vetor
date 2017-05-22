
package atividades;

import java.util.Scanner;

public class Atividades {

    public static void main(String[] args) {
        int nume[] = new int[5];
        Scanner ler = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero:");
            nume[i] = ler.nextInt();   
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" numero foi:"+nume[i]+".");
        }
    }
    
}
