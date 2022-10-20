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
public class JohanRJ_0806022210005_Alpro_Nomor_3 {
    public static void main(String[] args) {
        int N;
        
        Scanner tulis = new Scanner (System.in);
        
        System.out.print("Angka : ");
        N = tulis.nextInt();
        
        if (N % 2 == 0) {
            System.out.println("Angka anda adalah Genap"); 
        } else {
            System.out.println("Angka anda adalah Ganjil");
        }
    }
}
