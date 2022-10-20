/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JohanRJ_0806022210005_Alpro_Week4;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class JohanRJ_0806022210005_Alpro_Nomor_1 {
    
    public static void main(String[] args) {
        int pilih;
        double C, R, F, K;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai Celcius: ");
        C = input.nextInt();
        
        System.out.println("Pilih ingin dikonversi ke apa:");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Nomor yang dipilih = ");
        pilih = input.nextInt();
        
        if (pilih == 1){
            R = C*0.8;
            System.out.println("Suhu Reamur : "+R);
        } else if (pilih == 2){
            F = C*1.8+32;
            System.out.println("Suhu Fahrenheit : "+F);
        } else if (pilih == 3) {
            K = C+273;
            System.out.println("Suhu Fahrenheit : "+K);
        } else {
            System.out.println("Maaf nomor yang anda masukkan tidak valid");
        }   
    }
}
