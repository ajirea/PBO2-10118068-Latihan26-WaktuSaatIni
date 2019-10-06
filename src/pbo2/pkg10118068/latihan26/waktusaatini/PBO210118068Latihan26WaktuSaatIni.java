/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : program menampilkan waktu hari ini, dari mulai hari,
 * tanggal, bulan, tahun, jam, menit, dan detik
 */
public class PBO210118068Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make date object
        Date date = new Date();
        
        // make date format object
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "EEEE, d MMM Y H:m:s",
                new Locale("id")
        );
        
        // output 
        String hasil = dateFormat.format(date);
        System.out.println("Hari ini adalah hari : " + hasil);
    }
    
}
