/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swich5;


import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Swich5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new  Scanner(System.in);
       int res = 0, dezembro=12 , fevereiro=2 , junho=6 , julho=7 ;
      
        System.out.println("Digite o número do mês desejado : ");
        int mes = entrada.nextInt();
        
      if( res==dezembro || res==fevereiro || res==junho || res==julho){
          System.out.println("Mês de alta temporada");
     }else{
           System.out.println("Mês de baixa temporada");
      }
      }
            
        
    }


      
    
    

