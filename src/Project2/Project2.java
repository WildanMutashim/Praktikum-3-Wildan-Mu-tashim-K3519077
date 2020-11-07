/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author Wildan Mu'tashim
 */
import java.util.Random;
import java.util.Scanner;
public class Project2 {

    int tebakan;
    int angkaRandom;
    int skor = 100;
    int kesempatan = 5;
    
    void tebakan(){
        angkaRandom = (int) (Math.random() * 100);
        
        do{
        Scanner n=new Scanner(System.in);
        System.out.println("Tebakan Anda : ");
        this.tebakan=n.nextInt();
        
        if(skor==0){
            System.out.println("Game Over");
        }
        else if(tebakan==angkaRandom){
            System.out.println("Selamat tebakan anda benar");
            System.out.println("Score anda:" + kesempatan);
            skor -=2 ;
            kesempatan -= 1;
            if(tebakan==angkaRandom && kesempatan > 0){
                kesempatan += 50;
                System.out.println("Bonus : 50");
                System.out.println("Selamat anda mendapatkan bonus :" + kesempatan);
            }
        }
        else if(tebakan<angkaRandom){
            System.out.println("Maaf, tebakan anda terlalu kecil.\nSilahkan coba lagi");
            skor -=2 ;
            kesempatan -= 1;
        }
        else{
            System.out.println("Maaf, tebakan anda terlalu besar.\nSilahkan coba lagi");
            skor -=2;
            kesempatan -= 1;           
        }
        
        }while (tebakan != angkaRandom);
    }
}
