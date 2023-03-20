/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaEstudos;

import java.util.Scanner;

/**
 *
 * @author cagas
 */
public class Fibona{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = ler.nextInt();
        
        int fib1 = 1, fib2 = 1, fib3 = 0;
        boolean fazParte = false;
        while(fib3 < num){
            fib3 = fib1 + fib2;
            if(fib3 == num){
                fazParte = true;
                break;
            }
            fib1 = fib2;
            fib2 = fib3;
            
          }
        if (fazParte){
            System.out.println("O numero:  " + num + "  Faz parte da sequencia de fibonacci.");
        }else{
            System.out.println("O numero:  " + num + "  Nao faz parte da sequencia de fibonacci.");
        }
        ler.close();
    }
}