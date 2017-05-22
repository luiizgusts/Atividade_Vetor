
package ativadade3;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        float nota[] = new float[4];
        float media;
        float conj=0;
        Scanner ler= new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite uma nota:");   
            nota[i]= ler.nextFloat();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("A "+i+" nota é :"+nota[i]+".");
            conj = conj+nota[i];
        }
        media = conj/4;
        System.out.println("A sua media é:"+media+".");
    }
    
}
