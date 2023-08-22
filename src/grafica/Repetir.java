package grafica;

import java.io.*;
public class Repetir {
   public static void main (String[] args) throws IOException{
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader br = new BufferedReader(isr);
       int contador=0;
       
       while(contador<3){
           System.out.println("Ingrese su Usuario: ");
           int usuario = Integer.parseInt(br.readLine());
           System.out.println("Ingrese su Clave: ");
           int clave = Integer.parseInt(br.readLine());
           if (usuario==12345 && clave==123){
               System.out.println("Ingreso OK!!");
               contador = 3;
               System.out.println("BIENVENIDO!!");
           }
           else{
               System.out.println("INGRESO INCORRECTO");
               contador ++;
               
           }
       }
       System.out.println("****************USUARIO BLOQUEADO***************");
       System.out.println("****************Fin del Programa*****************");
   } 
}
