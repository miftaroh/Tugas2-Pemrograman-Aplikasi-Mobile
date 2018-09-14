/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class TUGAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiAndroid = 85;
        String paras = " tampan ";
        String asal = " Malang ";
        char nilaiAndroidHuruf;
        
        System.out.println("Apakah anda ingin menikah");
        
        if (nilaiAndroid >= 85){
            nilaiAndroidHuruf= 'A';
        }
        else if (nilaiAndroid >= 75){
            nilaiAndroidHuruf= 'B';
        }
        else if (nilaiAndroid >= 65){
            nilaiAndroidHuruf= 'C';
        }
        else if (nilaiAndroid >= 55){
            nilaiAndroidHuruf= 'D';
        }
        else {
            nilaiAndroidHuruf= 'E';
        }
        
        if (nilaiAndroidHuruf== 'A' && paras== " tampan " && asal == " Malang "){
            System.out.println(" Mau bangetlah hehehe ....");
        }
        else if ((nilaiAndroidHuruf == 'A' || nilaiAndroidHuruf == 'C')&& paras== " tampan " && asal == " Malang "){
            System.out.println(" emmm bolehlah ....");
        }
        else if (asal == " Malang "){
            System.out.println(" saya pikir-pikir dulu deh ....");
        }
        else {
            System.out.println(" jelas tidak.");
        }
    }
    
}
