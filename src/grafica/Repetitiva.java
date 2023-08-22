//hacer un programa que solicite al usuario que ingrese
//varias veces su codigo y su nombre.

package grafica;

import java.io.*;
public class Repetitiva {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char continuar;
        
        do{
            System.out.println("ingrese su codigo: ");
            int codigo = Integer.parseInt(br.readLine());
            System.out.println("ingrese su Nombre: ");
            String nombre = br.readLine();
            System.out.println("BIENVENIDO "+nombre+"!!!");
            System.out.println("Tu codigo es: "+codigo);
            System.out.println("Tu nombre es: "+nombre);
            System.out.println("Desea Continuar? S/N");
            continuar=br.readLine().charAt(0);
        }while(continuar=='S' || continuar=='s');
    }
}
