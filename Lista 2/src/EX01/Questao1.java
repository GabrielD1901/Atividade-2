/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EX01;

import java.util.Scanner;

/**
 *
 * @author 42413174
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite as horas");
        
   
        int horas = input.nextInt();
        System.out.println("Digite as minutos");
        
        int minutos = input.nextInt();
        
        int conversao = horas *60+ minutos;
        
        System.out.println("O total de minutos passados foi " + conversao);
       
        
    }
    
}
