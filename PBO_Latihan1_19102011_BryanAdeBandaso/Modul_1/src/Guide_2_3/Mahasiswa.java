/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guide_2_3;

/**
 * Bryan Ade Bandaso
 * 19102011
 */
import java.io.*; //Pemanggilan Library dalam Java
class Mahasiswa
{
    private String Nama[]= new String[3]; //Deklarasi array
// dalam Java
    private String NIM[]= new String[3];
    private int i;
    public void inputData()
    {
        BufferedReader b;
        b=new BufferedReader(new InputStreamReader
        (System.in));
        try //Penjelasan Exception lebih lanjut di berikutnya
        {
            System.out.println("-Input Data Mahasiswa-");
            for (i=0;i<3;i++) // Perulangan (looping)
            {
                System.out.print ("Masukkan Nama : ");
                Nama[i] =b.readLine (); //Pembacaan inputan melaluimkeyboard (seperti "cin" dalam C++)
                System.out.print ("Masukkan NIM : ");
                NIM[i] =b.readLine ();
            }
        }
        catch (Exception E){}
    }
    public void display()
    {
        System.out.println("");
        System.out.println("-Display Data Mahasiswa-");
        for (i=0;i<3;i++)
        {
            System.out.println("Nama : "+Nama[i]);
            System.out.println("NIM : "+NIM[i]);
            System.out.println("");
        }
    }
}
