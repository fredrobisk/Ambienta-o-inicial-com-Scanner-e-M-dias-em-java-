package org.example;

import java.util.Scanner;

public class lacos_de_repeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();

         while(x > 0){
             System.out.println(x);
             x -= 1;
         }



        sc.close();
    }
}
