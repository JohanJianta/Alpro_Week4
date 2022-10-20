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
public class JohanRJ_0806022210005_Alpro_Nomor_2 {
    public static void main(String[] args) {
        int N;
        int minimal = 75;
        Scanner ketik = new Scanner (System.in);
        
        System.out.print("Nilai Ujian : ");
        N = ketik.nextInt();
        
        if (N >= minimal) {
            System.out.println("Hasil : Lulus");
        } else {
            System.out.println("Hasil : Tidak Lulus");
        }
    }
}
