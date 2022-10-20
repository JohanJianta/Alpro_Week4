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
public class JohanRJ_0806022210005_Alpro_Nomor_4 {
    public static void main(String[] args) {
        int jam, lembur;
        double kotor, pajak, bersih;
        Scanner read = new Scanner (System.in);
        
        System.out.print("Total jam kerja : ");
        jam = read.nextInt();
        
        if (jam > 40) {
            lembur = jam-40;
            kotor = 40*6+lembur*9;
            System.out.println("Gaji kotor : "+kotor);
        } else {
            kotor = jam*6;
            System.out.println("Gaji kotor : "+kotor);
        }
        
        if (kotor <= 250) {
            pajak = kotor*0.1;
            System.out.println("Pajak : "+pajak);
        } else {
            pajak = kotor*0.12;
            System.out.println("Pajak : "+pajak);
        }
        
        bersih = kotor-pajak;
        System.out.println("Gaji bersih : "+bersih);
    }
}
