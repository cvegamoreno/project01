package project01;

import java.io.*;
public class Project02 {
    public static void main (String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //declaración de variables
        double n1;
        byte n2;
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = Double.parseDouble(br.readLine());//lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = Byte.parseByte(br.readLine());
        //mostrar resultado
        System.out.println("Ha introducido los números: "+n1+" y "+n2);
    }
}
