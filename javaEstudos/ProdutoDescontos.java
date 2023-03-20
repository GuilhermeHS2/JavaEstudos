/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaEstudos;

import java.util.Scanner;

/**
 *
 * @author cagas
 */
public class ProdutoDescontos {

  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      double total = 0;
      
      System.out.println("Bem vindo!");
      
      while(true){
          System.out.println("\nDigite o nome do produto (ou fim para terminar o programa");
          String nome = leitor.nextLine();
          
         if (nome.equalsIgnoreCase("fim")){
             break;
         }
         System.out.println("Digite o valor do produto");
         double valor = leitor.nextDouble();
         
         System.out.println("Digite a quantidade de unidades do produto");
         int quant = leitor.nextInt();
         
         leitor.nextLine();
         
         double valorTotal = valor * quant;
         
         double desconto = 0;
          
          if(quant > 10 && quant <= 20){
              desconto = 0.1;
          }else if (quant > 20 && quant <=50){
              desconto = 0.2;
          }else if(quant > 50){
              desconto = 0.25;
          }
          double valorDesconto = valorTotal - (valorTotal * desconto);
          
          System.out.println("Produto: " +nome);
          System.out.println("Total a pagar R$" +valorDesconto);
          
          total +=valorDesconto;
      }
      System.out.println("\nTotal a pagar pela compra: R$" + total);
      
      System.out.println("\nObrigado pela preferencia!");
      leitor.close();
  }
  }
          
    
    