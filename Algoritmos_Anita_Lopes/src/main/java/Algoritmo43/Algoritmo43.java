/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo43;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo43 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num,log;
        System.out.println("Entre com o logaritmando");
        num=scanner.nextDouble();
        log=Math.log10(num);
        System.out.println("Logaritmo: "+log);
    }
}
