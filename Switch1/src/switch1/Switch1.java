/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch1;

import java.util.Scanner;
/**
 *
 * @author Paola Soares
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = entrada.nextInt();
        int divisor =( a % 3);
        
        switch(divisor){
            case 0:
            System.out.println("O número é divisivel pro 3: ");
            break;
            default:
            System.out.println("O número não é divisivel por 3: ");
            break;
        }

    }
    
}