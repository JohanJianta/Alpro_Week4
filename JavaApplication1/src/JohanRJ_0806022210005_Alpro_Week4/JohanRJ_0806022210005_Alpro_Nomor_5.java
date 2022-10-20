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
public class JohanRJ_0806022210005_Alpro_Nomor_5 {
    public static void main(String[] args) {
        String nama, kelamin, status;
        
        Scanner baca = new Scanner (System.in);
        
        System.out.print("Masukkan nama anda : ");
        nama = baca.nextLine();
        System.out.print("Masukkan jenis kelamin anda (L/P) : ");
        kelamin = baca.nextLine();
        System.out.print("Apakah anda sudah menikah? (Y/T) : ");
        status = baca.nextLine();
        
        if ("L".equals(kelamin) || "l".equals(kelamin)) {
            if ("Y".equals(status) || "y".equals(status) || "T".equals(status) || "t".equals(status)) {
                System.out.println("Hello, Mr. "+nama);
            } else {
                System.out.println("Maaf data yang dimasukkan tidak valid");
            }
        } else if ("P".equals(kelamin) || "p".equals(kelamin)) {
            if ("Y".equals(status) || "y".equals(status)) {
                System.out.println("Hello, Mrs. "+nama);
            } else if ("T".equals(status) || "t".equals(status)) {
                System.out.println("Hello, Ms. "+nama);
            } else {
                System.out.println("Maaf data yang dimasukkan tidak valid");
            }
        } else {
            System.out.println("Maaf data yang dimasukkan tidak valid");
        }
    }
}