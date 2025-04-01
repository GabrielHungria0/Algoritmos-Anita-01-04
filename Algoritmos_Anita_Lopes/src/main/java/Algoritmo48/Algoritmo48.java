/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmo48;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Algoritmo48 {
    public static void main(String[] args) {
        float salarioMinimo,qtdQuiloWatts,precoQuiloWatts,valorPagoTotal,valorComDesconto;
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00"); // Formato com 2 casas decimais

        
        System.out.println("Informe o salario minimo");
        salarioMinimo=scanner.nextFloat();
        
        System.out.println("Informe a quantidade de quilowatts");
        qtdQuiloWatts=scanner.nextFloat();
       
        precoQuiloWatts=(salarioMinimo)/700;
        valorPagoTotal=qtdQuiloWatts*precoQuiloWatts;
        
        valorComDesconto=valorPagoTotal*0.9f;
        
        System.out.println("Valor de cada quilowatt: "+df.format(precoQuiloWatts)+"\nValor em reais a ser pago: R$ "+df.format(valorPagoTotal)+"\nValor com desconto de 10%: R$ "+df.format(valorComDesconto));
    }
}
