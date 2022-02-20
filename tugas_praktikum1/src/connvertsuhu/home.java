/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connvertsuhu;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop;
        double SuhuAwal;
        System.out.println("+=======================+");
        System.out.println("| PROGRAM KONVERSI SUHU |");
        System.out.println("+=======================+");
        System.out.println("Masukkan data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        SuhuAwal = input.nextDouble();
        do{
            connvertsuhu dariCelcius = new connvertsuhu(SuhuAwal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            loop=input.nextInt();
            if(loop == 1){
                System.out.println("");
                System.out.println("Dalam Celcius\t: " + SuhuAwal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + dariCelcius.keFahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + dariCelcius.keReamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + dariCelcius.keKelvin() + "K");
                System.out.println("Kondisi Air " + dariCelcius.kondisiair());
            }
            else if(loop == 2){
                System.out.println("\nMasukkan data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                SuhuAwal = input.nextDouble();
            }
            else if(loop != 3){
                System.out.println("\nOpsi anda salah. Mohon masukkan opsi yang benar");
            }
        }while(loop!=3);
    }
}
