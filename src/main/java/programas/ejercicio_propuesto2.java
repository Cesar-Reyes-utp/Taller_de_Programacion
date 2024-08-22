package programas;

import java.util.Scanner;

public class ejercicio_propuesto2 {

    public static void main(String[] args) {
        //declaracion de variables    
        double s1,s2,s3,s4,s5,t,p;
        //creamos el objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //ingreso de datos
        System.out.print("Primer sueldo: ");
        s1=lectura.nextDouble();
        System.out.print("Segundo sueldo: ");
        s2=lectura.nextDouble();
        System.out.print("Tercer sueldo: ");
        s3=lectura.nextDouble();
        System.out.print("Cuarto sueldo: ");
        s4=lectura.nextDouble();
        System.out.print("Quinto sueldo: ");
        s5=lectura.nextDouble();
        //procesos
        t=s1+s2+s3+s4+s5;
        p=t/5;
        //salidad de datos
        System.out.println("Total a pagar: " + t);
        System.out.println(":Sueldo Promedio " + p);

    }
}
