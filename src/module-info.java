
package Antecessor;

import java.util.Scanner;

public class Antecessor {

   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n1, ant, suc;
        System.out.println("Digite um n�mero ");
        n1=teclado.nextInt();
        ant=n1-1;
        suc=n1+1;
        System.out.println("O antecessor de "+n1+" � "+ant+" E o sucessor � "+suc);
    }
    
}
