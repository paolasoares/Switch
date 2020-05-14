/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch10;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Switch10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Insira apenas, + , - , / , e , *: ");
        int operacao = entrada.next().charAt(0);
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        
            switch(operacao){
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case'-' :
                    System.out.println(num1-num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                default:
                    System.out.println("Operaçao invalida");
                   
            }
            
    }       
}
