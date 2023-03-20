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
public class Mes {
 public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um numero de 1 a 12:  ");
    int mes = ler.nextInt();

    String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    if (mes >= 1 && mes <= 12) {
      System.out.println(meses[mes-1]);
    } else {
      System.out.println("Inválido!");
    }
    

  }

}
