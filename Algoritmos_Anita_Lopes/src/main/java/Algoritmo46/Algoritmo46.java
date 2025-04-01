/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo46;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Algoritmo46 {
    public static void main(String[] args) {
        float saldo,novoSaldo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe o saldo");
        saldo=scanner.nextFloat();
        novoSaldo=saldo*1.01f;
        System.out.println("Saldo anterior: "+saldo+"\nSaldo atual: "+novoSaldo);
        
    }
}
