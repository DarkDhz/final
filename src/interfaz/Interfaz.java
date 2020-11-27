package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

public class Interfaz{
    private static String HELP_TEXT = "Texto de ayuda";
    private static String NOMBRE_FICHERO = "libretaDeProductos.txt";

    public static void procesarPeticion(String sentencia){
        String[] args = sentencia.split(" ");
        Tienda tienda = inicializarTienda(NOMBRE_FICHERO);
        if(args[0].equals("help")){
            System.out.println(HELP_TEXT);
        } else if (args[0].equals("list")){
            if(tienda.toString().equals("")){
                System.out.println("No hay ningún producto en la libreta");
            } else {
                System.out.println(tienda);
            }
        } else if (args[0].equals("add")){
            Producto Producto = new Producto(args[1], args[2], args[3]);
            tienda.annadirProducto(Producto);
            inicializarTienda(tienda);
        }
    }

    private static void inicializarTienda(Tienda tienda){
        try{
            FileWriter fw = new FileWriter(NOMBRE_FICHERO);
            fw.write(tienda.toString());
            fw.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    private static Tienda inicializarLibreta(String nombreFichero){
        Tienda tienda = new Tienda();
        try{
            File file = new File(nombreFichero);
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String nombre = sc.next();
                String nTel = sc.next();
                Producto producto = new Producto(marca, nombre, precioProducto);
                tienda.annadirContacto(producto);
            }
            sc.close();
        } catch (FileNotFoundException e){
            inicializarFichero(tienda);
        } catch (Exception e){
            System.out.println(e);
        }
        return tienda;
    }
}
