/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada_for;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Tabuada_for {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Entre com um número para gerar a tabuada: ");
    int num = scanner.nextInt();
    
    boolean invalido = true;
    int numinicio, numfinal;        
    
    do {
        
    System.out.println("Entre com o ínicio da tabuada");
    numinicio = scanner.nextInt();
    
    System.out.println("Entre com o final da tabuada");
    numfinal = scanner.nextInt();
    
    if (numfinal > numinicio) {
        invalido = false;
    }
        
    } while (invalido);
        
    System.out.println("Tabuada de " + num + ":");
    System.out.println("começar por:" + numinicio);
    System.out.println("Terminar em:" + numfinal);
    System.out.println();
            
    for (int i=numinicio; i <= numfinal; i++) {
        System.out.println(num + "x" + i + "=" + (num*i));
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
}
