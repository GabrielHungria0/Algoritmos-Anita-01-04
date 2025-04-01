/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo41;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo41 {
    public static void main(String[] args) {
        float numero1,numero2,numero3,numero4,mediaPonderada;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero");
        numero1=scanner.nextFloat();
        
        System.out.println("Informe o segundo numero");
        numero2=scanner.nextFloat();
        
        System.out.println("Informe o terceiro numero");
        numero3=scanner.nextFloat();
        
        System.out.println("Informe o quarto numero");
        numero4=scanner.nextFloat();
        
        mediaPonderada=(1*numero1+2*numero2+3*numero3+4*numero4)/10;
        System.out.println("Media ponderada e "+mediaPonderada);





    }
}
