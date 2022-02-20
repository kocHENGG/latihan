/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connvertsuhu;

/**
 *
 * @author ACER
 */
public class connvertsuhu {
    double Celcius;

    public connvertsuhu(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double keFahrenheit(){
        return (Celcius*1.8+32);
    }
    double keReamur(){
        return (Celcius*0.8);
    }
    double keKelvin(){
        return (Celcius+273.15);
    }
    String kondisiair(){
        if(Celcius <= 0){
            return "Beku";
        }
        else if(Celcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
}
