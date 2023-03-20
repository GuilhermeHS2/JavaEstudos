/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaEstudos;
import java.util.Scanner;
/**
 *
 * @author cagas
 */
public class relogio {
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite os segundos: ");
       int segundos = ler.nextInt();
       
       int horas = segundos/3600;
       int minutos = (segundos%3600)/60;
       int segundo = (segundos%3600)%60;
       System.out.println("O tempo em horas, minutos e segundo e:  " + horas +  "h"  + minutos +  "min"   + segundo +  "s" );
       
       ler.close();
       
}
   }
    
