
package atividade5;

import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {
        float media[]= new float[10];
        Scanner ler= new Scanner(System.in);
        float nota[]= new float[40];
        float junt=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do aluno numero:"+i+".");
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite uma nota:");
                nota[i] = ler.nextFloat();
                junt = junt+nota[i];
            }
            for (int x = 0; x < 10; x++) {
                media[i]=junt/4;
            }
           junt=0;    
        }
        for (int i = 0; i < 9; i++) {
            if (media[i] >= 7){
                System.out.println("O aluno "+i+" passou com média :"+media[i]+".");  
            }
        }
   
    
    }
}
