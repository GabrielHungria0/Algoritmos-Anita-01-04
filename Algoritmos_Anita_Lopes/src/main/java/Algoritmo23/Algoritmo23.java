/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo23;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um inteiro de 3 casas ");
        
        int x = scanner.nextInt();
        int casaDezena=(x/10)%10;
        
        System.out.println("Algarismo da casa das dezenas : "+casaDezena);
    }
}
