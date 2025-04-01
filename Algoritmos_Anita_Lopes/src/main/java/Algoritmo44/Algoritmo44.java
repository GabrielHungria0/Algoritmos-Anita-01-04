/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo44;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo44 {
    public static void main(String[] args) {
        double num,base,logaritmo;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Entre com o logaritmando");
        num=scanner.nextDouble();
        
        System.out.println("Entre com a base");
        base=scanner.nextFloat();
        
        logaritmo=(Math.log(num)/Math.log(base));
        System.out.println("Logaritmando: "+num+" Base: "+base+" Logaritmo: "+logaritmo);

    }
}
