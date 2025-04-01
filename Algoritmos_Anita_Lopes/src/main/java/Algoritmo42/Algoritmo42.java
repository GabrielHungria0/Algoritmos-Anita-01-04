/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo42;

/**
 *
 * @author gabri
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Algoritmo42 {
    public static void main(String[] args) {
        double angulo,anguloRad;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o angulo em graus");
        angulo=scanner.nextDouble();
        anguloRad=(angulo/180)*Math.PI;
        
        double cosseno=Math.cos(anguloRad);
        double seno=Math.sin(anguloRad);
        double tangente=Math.tan(anguloRad);
        double cossecante=1/seno;
        double secante=1/cosseno;
        double cotangente=1/tangente;
        
        System.out.println("Seno: "+df.format(seno));
        System.out.println("Cosseno: "+df.format(cosseno));
        System.out.println("Tangente: "+df.format(tangente));
        System.out.println("Cossecante: "+df.format(cossecante));
        System.out.println("Secante: "+df.format(secante));
        System.out.println("Contangente: "+df.format(cotangente));





                
    }
}
