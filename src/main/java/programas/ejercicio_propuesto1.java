package programas;

import java.util.Scanner;

public class ejercicio_propuesto1 {

    public static void main(String[] args) {
        //declaracion de variables
        String cliente,producto;
        double precio,cantidad,subtotal,igv,total;
        //creamos el objeto de lectura
        Scanner lectura= new Scanner(System.in);
        //ingreso de datos
        System.out.print("Nombre del cliente: ");
        cliente=lectura.next();
        System.out.print("Producto: ");
        producto=lectura.next();
        System.out.print("Precio del producto: ");
        precio=lectura.nextDouble();
        System.out.print("Cantidad de productos: ");
        cantidad=lectura.nextDouble();
        //procesos
        subtotal=precio*cantidad;
        igv=subtotal*18/100;
        total=subtotal-igv;
        //datos a mostrar
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total: " + total);                       
    }
}
