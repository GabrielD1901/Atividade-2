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
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Scanner ler = new Scanner(System.in); 
     
    System.out.println("Digite o preço do alcool");
    double alcool = ler.nextDouble();
    
    System.out.println("Digite o preço da gasolina");
    double gasolina = ler.nextDouble();
    
    double media = gasolina*0.7;
    if (media < alcool){
    System.out.println("Melhor escolha, gasolina");   
    }
    else{System.out.println("Melhor escolha, alcool");}


    }
    
   
}
