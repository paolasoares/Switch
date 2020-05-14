/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swiitch2;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Swiitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um dia (1a7): ");
            int dia = entrada.nextInt();
        switch(dia){
            case 1:
                System.out.printf("Domingo - fim de semana");
            break;
            case 2:
                System.out.printf("Segunda - dia útil ");
            break;
            case 3:
                System.out.printf("Terça - dia útil ");
            break;
            case 4:
                System.out.printf("Quarta - dia útil ");
             break;
            case 5:
                System.out.printf("Quinta - dia útil ");
            break;
            case 6:
                System.out.printf("Sexta - dia útil ");
             break;
            case 7:
                System.out.printf("Sábado - fim de semana ");
             break;   
            default:
                System.out.printf("Dia inválido ");
                
    }
       
   
    }
    
}
