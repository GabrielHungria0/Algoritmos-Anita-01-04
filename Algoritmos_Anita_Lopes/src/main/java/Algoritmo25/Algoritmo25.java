/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo25;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo25 {
    public static void main(String[] args) {
        int data,dia,mes,ano;
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Informe a data no formato ddmmaa: ");
        
        data=scanner.nextInt();
        dia=data/10000;
        mes=data%10000/100;
        ano=data%10000%100;
        
        System.out.println("Dia: "+dia);
        System.out.println("Mes: "+mes);
        System.out.println("Ano: "+ano);
        
    }
}
