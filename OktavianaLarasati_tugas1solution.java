/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author oktaviana larasati
 */
public class OktavianaLarasati_tugas1solution {
    //membuat fungsi diskriminan
    public static void main (String[]args){
         System.out.println("Polinomial");
        Scanner input = new Scanner (System.in);
        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("b = ");
        int b = input.nextInt();
        System.out.println("c= ");
        int c = input.nextInt();
        
     if (a==0){
     System.out.println("a harus lebih dari 0");
     }
     if (a!=0){
     System.out.println (a+ "x^2+" +b+"x+" +c);
     }

     //mencari deskriminan
     int D = (b*b)-(4*a*c);
      System.out.println("Diskriminan = "+ D);
      
    //akar akar polinomial
      int X1;
      X1 = (-b + (D^(1/2)))/(2*a);
      int X2;
      X2 = (-b - (D^(1/2)))/(2*a);
      System.out.println("Akar-Akar dari Polinomial = " + X1 + " dan "+ X2);
      
      
      // menentukan titik stasioner
      int x ;
      x = -b/(2*a);
      int y ; 
      y = -D/(4*a);
      System.out.println( " Titik Stasioner = ( "+ x + ","+ y +")");
      
      // menentukan kecekungan kurva
      if (a>0 ){
          System.out.println("Kecekungan kurva = ke atas" );
      }
      else{ 
          System.out.println ("Kecekungan kurva = ke bawah");
      }
      //menentukan nilai minimum lokal
   
          System.out.println("Nilai minimum Lokal = " + y );
                  }
       
                  }
      

      
      
     
        
    

