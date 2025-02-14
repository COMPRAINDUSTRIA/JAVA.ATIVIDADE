package br.com.Lista02;

import java.util.Scanner;

public class Sofia {
        static public void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Digite um numero querida Sofia: ");
            int numero01 =scanner.nextInt();
            System.out.println("Digite outro numero querida Sofia: ");
            int numero02 =scanner.nextInt();

            if(numero02 == numero01+1) {
                System.out.println(numero02 + " é o sucessor de " + numero01 + ".");
            }else{
                System.out.println(numero02+" NÃO é o sucessor de " + numero01 + ".");


            }
        }
}
