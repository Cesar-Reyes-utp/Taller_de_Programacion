package programas;

import java.util.Scanner;

public class ejercicio_propuesto3 {

    public static void main(String[] args) {
        //declaracion de variables
        String empleado;
        double ingreso,gasto,m,b,s,a;
        //creamos el objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //ingreso de datos
        System.out.print("Nombre del empleado: ");
        empleado=lectura.next();
        System.out.print("Ingreso del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gasto del empleado: ");
        gasto=lectura.nextDouble();
        //procesos
        m=ingreso-gasto;
        b=m*2;
        s=m*6;
        a=m*12;
        //salida de datos
        System.out.println("Ahorro mensual: " + m);
        System.out.println("Ahorro bimestral: " + b);
        System.out.println("Ahorro semestral: " + s);
        System.out.println("Ahorro anual: " + a);
    }
}
