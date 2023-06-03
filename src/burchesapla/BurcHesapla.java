package burchesapla;

import java.util.Scanner;

public class BurcHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Burç Hesaplama Uygulamasına Hoşgeldiniz...");
        
        System.out.print("Lütfen Doğduğunuz Ayı Girin (Örnek : 1) : ");
        int ay = scanner.nextInt();
        System.out.print("Lütfen Doğduğunuz Günü Girin (Örnek : 22): ");
        int gün = scanner.nextInt();
        
        
        //Ocak
        if(ay == 1 ){
            
            if(gün <= 21){
                System.out.println("Oğlak Burcusunuz...");
            }
            else{
                System.out.println("Kova Burcusunuz...");
            }
            
        }
        
        
        //Şubat
        else if(ay == 2 ){
            
            if(gün<=19){  
                System.out.println("Kova Burcusunuz...");
            }
            else{
                System.out.println("Balık Burcusunuz...");
            }
            
        }
        
        
        
        //Mart
        
        else if(ay == 3 ){
            
            if(gün<=20){
                System.out.println("Balık Burcusunuz...");
            }
            else{
                System.out.println("Koç Burcusunuz...");
            }
        }
        
 
        
        //Nisan
        else if(ay == 4){
            
            if(gün<=20){
                System.out.println("Koç Burcusunuz...");
            }
            else{
                System.out.println("Boğa Burcusunuz...");
            }
            
        }
        
        
        
        //Mayıs
        else if(ay == 5){
            
            if(gün<=21){
                System.out.println("Boğa Burcusunuz...");
            }
            else{
                System.out.println("İkizler Burcusunuz...");
            }
            
        }
        
        
        
        //Haziran
        else if(ay == 6){
            
            if(gün<=22){
                System.out.println("İkizler Burcusunuz...");
            }
            else{
                System.out.println("Yengeç Burcusunuz...");
            }
        }
        
        
        
        //Temmuz
        else if(ay == 7){
            
            if(gün<=22){
                System.out.println("Yengeç Burcusunuz...");
            }
            else{
                System.out.println("Aslan Burcusunuz...");
            }
            
        }
        
        
        
        //Ağustos
        else if(ay == 8){
            
            if(gün<=22){
                System.out.println("Aslan Burcusunuz...");
            }
            else{
                System.out.println("Başak Burcusunuz...");
            }
        }
        
        
        
        //Eylül
        else if(ay == 9){
            
            if(gün<=22){
                System.out.println("Başak Burcusunuz...");
            }
            else{
                System.out.println("Terazi Burcusunuz...");
            }
            
        }
        
        
        
        //Ekim
        else if(ay == 10){
            
            if(gün<=22){
                System.out.println("Terazi Burcusunuz...");
            }
            else{
                System.out.println("Akrep Burcusunuz...");
            }
            
        }
        
        
        
        //Kasım
        else if(ay == 11){
            
            if(gün<=21){
                System.out.println("Akrep Burcusunuz...");
            }
            else{
                System.out.println("Yay Burcusunuz...");
            }
            
        }
        
        
        
        //Aralık
        else if(ay == 12){
            
            if(gün<=21){
                System.out.println("Yay Burcusunuz...");
            }
            else{
                System.out.println("Oğlak Burcusunuz...");
            }
        }
        
        
        
        else{
            System.out.println("Geçersiz Doğum Tarihi");
            
        }
        
        
    }
    
}
