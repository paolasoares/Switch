/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch3;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Switch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);
        int     n1 = 1, n5 = 5, n10 = 10, n50 = 50, n100 = 100;
        int condicao = 0;
        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();
        if(valor >= 0){
            if(valor >= n100){
                condicao = 1;
                n100 = valor / 100;
                valor = valor % n100;
            }
            if(valor >= n50){
                condicao = 2;
                n50 = valor / 50;
                valor = valor % n50;
            }
            if(valor >= n10){
                condicao = 3;
                n10 = valor / 10;
                valor = valor % n10;
            }
            if(valor >= n5){
                condicao = 4;
                n5 = valor / 5;
                valor = valor % n5;
            }
            if(valor > n1){
                condicao = 5;
                n1 = valor / 1;
               valor = valor % n1;
            }
        }else{
            System.out.println("Valor inválido");
        }
        switch (condicao){
            case 1:
            System.out.println(" Notas de 100: "+100);
            case 2:
            System.out.println(" Notas de 50: "+50 );
            case 3:
                 System.out.println(" Notas de 10: "+10);
            case 4:
                 System.out.println(" Notas de 5: "+5);
            case 5:     
            System.out.println(" Notas de 1: "+1);
        }
      
    }
}
