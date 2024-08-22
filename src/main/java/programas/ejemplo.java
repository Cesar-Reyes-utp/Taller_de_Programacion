package programas;

import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {
        //declaracion de variables
        String empleado;
        double ingreso,gasto,ahorrom,ahorroa;
        //creamos el objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //ingreso de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Ingreso del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print("Gasto del empleado: ");
        gasto=lectura.nextDouble();
        //proceso de gastos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        //salida de datos
        System.out.println("Ahorro mensual: " + ahorrom);
        System.out.println("Ahorro anual: " + ahorroa);
    }
}
