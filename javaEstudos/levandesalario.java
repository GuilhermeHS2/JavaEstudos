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
public class levandesalario {
    
    public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Quantos funcionarios a empresa possui?:  ");
       int numFunci = ler.nextInt();
       
       double[] salarios = new double[numFunci];
       
       for(int i = 0; i < numFunci; i++){
           System.out.print("Informe o salario do funcionario " + (i+1) + ": ");
           salarios[i] = ler.nextInt();
       }
       
       double mediaSala = 0;
       for(double salario : salarios){
           mediaSala += salario;
           
       }
       mediaSala /= numFunci;
       
       int numFunciAcMedia = 0;
       for(double salario : salarios){
           if (salario > mediaSala){
               numFunciAcMedia++;
           }
       }
       System.out.println("A media dos salarios e:  "+ mediaSala);
       System.out.println("Ha "  +   numFunciAcMedia  + "  Funcionariso ganham acima da media ");
       
       ler.close();
    }
    
}
