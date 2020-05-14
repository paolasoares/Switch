/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch7;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Switch7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        int plano = 100;
        
         
        if (idade >= 0 && idade <10){
            System.out.println("Criança com menos de 10 anos é: "+ 80);
        }else 
        if(idade >= 10 && idade <= 30 ){
            System.out.println("Conveniado com a idade entr 10 e 30 anos é: "+ 50);
        }else
        if(idade >= 40 && idade <= 60){
            System.out.println("Conveniado com idade entre 30 e 60 anos é: "+95);
        }else
        if(idade > 60 ){
            System.out.println("Conveniados com mais de 60 anos é: "+ 130);
    }
    }
    
}
