/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo40;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo40 {
    public static void main(String[] args) {
        int dividendo,divisor;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Entre com o dividendo");
        dividendo=scanner.nextInt();
        
        System.out.println("Entre com o divisor");
        divisor=scanner.nextInt();
        
        int quociente=dividendo/divisor;
        int resto=dividendo%divisor;
        
        System.out.println("Dividendo: "+dividendo);
        System.out.println("Divisor: "+divisor);
        System.out.println("quociente: "+quociente);
        System.out.println("resto: "+resto);
    }
}
