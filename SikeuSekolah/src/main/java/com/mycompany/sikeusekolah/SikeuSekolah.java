/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sikeusekolah;

import com.mycompany.sikeusekolah.form.DialogLogin;
import com.mycompany.sikeusekolah.form.FormUtama;
import java.sql.SQLException;
/**
 *
 * @author Lamat
 */
public class SikeuSekolah {
    
    public static FormUtama tampilanUtama;
    public static DialogLogin tampilanLogin;
    
 public static void main(String[] args) {
 System.out.println("Menjalankan aplikasi SIKEU - Sekolah");
 
 Koneksi cek = new Koneksi();
try {
    cek.konekDB.close(); //tutup koneksi
} catch (SQLException ex){
    
}
 tampilanUtama = new FormUtama();
 tampilanLogin = new DialogLogin(tampilanUtama,true);
 tampilanLogin.setVisible(true);
 }
}
