
package atividade4;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        char letra[]= new char[10];
        Scanner ler= new Scanner(System.in);
        int cons=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite uma letra:");
            letra[i]= ler.next().toUpperCase().charAt(0);
            switch(letra[i]){
               case'A':{letra[i]=' '; break;}
               case'E':{letra[i]=' '; break;}
               case'I':{letra[i]=' '; break;}
               case'O':{letra[i]=' '; break;}
               case'U':{letra[i]=' '; break;}
    }
    }
        for (int i = 0; i < 10; i++) {
           if(letra[i] != ' '){
               cons= 1+cons;
               System.out.println("A letra é: "+letra[i]+"."); 
           } 
        }
        System.out.println("Foram lidar "+cons+" consoantes.");
    }
    
}
