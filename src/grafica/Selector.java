//hacer un programa que lea desede teclado un numero entre 1 y 12
//luego el programa debe imprimir en pantalla el nombre del mes
//dado el numero del mes.

package grafica;

import java.io.*;
public class Selector {
    public static void main (String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        byte numMes;
        char continuar;        
        do{
            System.out.println("Ingrese un numero entre 1 y 12: ");
            numMes = Byte.parseByte(br.readLine());
            switch(numMes){
            case 1: System.out.println("El mes es Enero"); break;
            case 2: System.out.println("El mes es Febrero"); break;
            case 3: System.out.println("El mes es Marzo"); break;
            case 4: System.out.println("El mes es Abil"); break;
            case 5: System.out.println("El mes es Mayo"); break;
            case 6: System.out.println("El mes es Junio"); break;
            case 7: System.out.println("El mes es Julio"); break;
            case 8: System.out.println("El mes es Agosto"); break;
            case 9: System.out.println("El mes es Septiembre"); break;
            case 10: System.out.println("El mes es Octubre"); break;
            case 11: System.out.println("El mes es Noviembre"); break;
            case 12: System.out.println("El mes es Diciembre"); break;
            default: System.out.println("Error.");
            }
            System.out.println("Desea Continuar? ");
            continuar=br.readLine().charAt(0);
            
        }while (continuar=='S' || continuar=='s');
       
        System.out.println("****************Fin del Programa*****************");
    }
}
