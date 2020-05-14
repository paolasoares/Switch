/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch9;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Switch9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String cpf;
        Character primeiroDigito, segundoDigito, terceiroDigito, quartoDigito, quintoDigito, sextoDigito, setimoDigito, oitavoDigito, nonoDigito;
        int resultado;
        double restoDivisao, subtracao;

        System.out.println("Digite o numero do CPF para saber se é valido: ");
        cpf = entrada.nextLine();

        primeiroDigito = cpf.charAt(0);
        resultado = Integer.parseInt(primeiroDigito.toString()) * 10;

        segundoDigito = cpf.charAt(1);
        resultado = resultado + Integer.parseInt(segundoDigito.toString()) * 9;

        terceiroDigito = cpf.charAt(2);
        resultado = resultado + Integer.parseInt(terceiroDigito.toString()) * 8;

        quartoDigito = cpf.charAt(4);
        resultado = resultado + Integer.parseInt(quartoDigito.toString()) * 7;

        quintoDigito = cpf.charAt(5);
        resultado = resultado + Integer.parseInt(quintoDigito.toString()) * 6;

        sextoDigito = cpf.charAt(6);
        resultado = resultado + Integer.parseInt(sextoDigito.toString()) * 5;

        setimoDigito = cpf.charAt(8);
        resultado = resultado + Integer.parseInt(setimoDigito.toString()) * 4;

        oitavoDigito = cpf.charAt(9);
        resultado = resultado + Integer.parseInt(oitavoDigito.toString()) * 3;

        nonoDigito = cpf.charAt(10);
        resultado = resultado + Integer.parseInt(nonoDigito.toString()) * 2;

        restoDivisao = resultado % 11;

        subtracao = 11 - restoDivisao;

        if (subtracao < 10) {
            double decimoDigito = Double.parseDouble("" + cpf.charAt(12));
            if (decimoDigito != subtracao) {
                System.out.println("CPF INVALIDO");
                return;
            }
        } else {
            if (0 != subtracao) {
                System.out.println("CPF INVALIDO");
                return;
            }

        }
       

        resultado = Integer.parseInt(primeiroDigito.toString()) * 11;

        resultado = resultado + Integer.parseInt(segundoDigito.toString()) * 10;

        resultado = resultado + Integer.parseInt(terceiroDigito.toString()) * 9;

        resultado = resultado + Integer.parseInt(quartoDigito.toString()) * 8;

        resultado = resultado + Integer.parseInt(quintoDigito.toString()) * 7;

        resultado = resultado + Integer.parseInt(sextoDigito.toString()) * 6;

        resultado = resultado + Integer.parseInt(setimoDigito.toString()) * 5;

        resultado = resultado + Integer.parseInt(oitavoDigito.toString()) * 4;

        resultado = resultado + Integer.parseInt(nonoDigito.toString()) * 3;

        Character decimoDigito = cpf.charAt(12);
        resultado = resultado + Integer.parseInt(decimoDigito.toString()) * 2;

        restoDivisao = resultado % 11;

        subtracao = 11 - restoDivisao;
        
        

        if (subtracao < 10) {
            double decimoPrimeiroDigito = Double.parseDouble("" + cpf.charAt(13));

            if (decimoPrimeiroDigito != subtracao) {
                System.out.println("CPF INVALIDO");
                return;
            }
        } else {
            if (0 != subtracao) {
                System.out.println("CPF INVALIDO");
                return;
            }

        }
        System.out.println("CPF VALIDO");
     
           } 
}
