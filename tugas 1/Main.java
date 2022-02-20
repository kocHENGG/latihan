/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop;
        double SuhuAwal;
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        SuhuAwal = input.nextDouble();
        do{
            KonversiSuhu dariCelcius = new KonversiSuhu(SuhuAwal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            loop=input.nextInt();
            if(loop == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + SuhuAwal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + dariCelcius.keFahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + dariCelcius.keReamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + dariCelcius.keKelvin() + "K");
                System.out.println("Kondisi Air " + dariCelcius.kondisiair());
            }
            else if(loop == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                SuhuAwal = input.nextDouble();
            }
            else if(loop != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(loop!=3);
    }
    
}
