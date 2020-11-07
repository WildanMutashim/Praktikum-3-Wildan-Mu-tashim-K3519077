/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg3;

/**
 *
 * @author Wildan Mu'tashim
 */
import java.util.Random;
import java.util.Scanner;
public class Project1 {
    int tebakan;
    int angkaRandom;
    
    void tebakan(){
        angkaRandom = (int) (Math.random() * 100);
        
        do{
        Scanner n=new Scanner(System.in);
        System.out.println("Tebakan Anda : ");
        this.tebakan=n.nextInt();
        
        
        if(tebakan==angkaRandom){
            System.out.println("Selamat tebakan anda benar");
        }
        else if(tebakan<angkaRandom){
            System.out.println("Maaf, tebakan anda terlalu kecil.\nSilahkan coba lagi");
        }
        else{
            System.out.println("Maaf, tebakan anda terlalu besar.\nSilahkan coba lagi");
        }
        
        }while (tebakan != angkaRandom);
    }
}
