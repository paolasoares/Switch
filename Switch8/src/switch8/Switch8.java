/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch8;

import java.util.Scanner;

/**
 *
 * @author Paola Soares
 */
public class Switch8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o mês:  ");
            int mes = entrada.nextInt();
            System.out.println("Digite o valor da anuidade: ");
            int anuidade = entrada.nextInt();
            int juros = (anuidade % 5);
            int juros2 = ((anuidade % juros)*5)/100;
            int multa = 0 ;
            int r;
           
            switch(mes){
                case 1:
                    multa = anuidade;
                    System.out.println("janeiro o valor da multa é: "+multa+anuidade);
                    break;
                case 2:
                    multa = anuidade + juros;
                    System.out.println("Fevereiro o valor da multa é: "+anuidade+multa);
                    break;
                case 3: 
                    multa = anuidade + juros + juros2; 
                    System.out.println("Março o valor da multa é: "+anuidade+multa);
                    break;
                case 4:
                   r = multa + juros + juros2; 
                    System.out.println("Abril o valor da multa é: "+anuidade + multa);
                    break;
                case 5:
                    multa = (((anuidade + juros + juros2)% 5)/ 100)% 5 / 100;
                    System.out.println("Maio o valor da multa é: "+anuidade+multa);
                    break;
                case 6:
                    multa = anuidade + juros + juros2;
                    System.out.println("Junho o valor da multa é: "+anuidade+multa);
                    break;
                case 7:
                    multa = anuidade;
                    System.out.println("Julho o valor da multa é: "+anuidade +multa);
                    break;
                case 8:
                    multa = anuidade + juros;
                    System.out.println("Agosto o valor da multa é: "+anuidade+multa);
                    break;
                case 9:
                    multa = anuidade + juros + juros2;
                    System.out.println("Setembro o valor da multa é: "+anuidade+multa);
                    break;
                case 10:
                    multa = anuidade;
                    System.out.println("Outubro o valor da multa é: "+anuidade+multa);
                    break;
                case 11:
                    multa = anuidade + juros;
                    System.out.println("Novembro o valor da multa é: "+anuidade + multa);
                    break;
                case 12:
                    multa = anuidade + juros + juros2;
                    System.out.println("Dezembro o valor da multa é: "+anuidade +multa);
            }
    }
}
