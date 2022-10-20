/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double waktu;
        
        
        Scanner ketik = new Scanner(System.in);
        
        System.out.print("Masukkan waktu sekarang (0-24): ");
        waktu = ketik.nextDouble();
        
        System.out.println("Sekarang adalah pukul "
          + String.format("%.2f", waktu) + " WITA");
        
        if (waktu >= 22 && waktu <= 24 || waktu >= 0 && waktu <= 3){
            System.out.println("Sudah malam, waktunya untuk tidur");
        }
    }
}