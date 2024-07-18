/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Biblioteca {

    private static Object libros;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion;  
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca");
        do{
            System.out.println("");
            System.out.println("Ingrese 1 para registrar un libro");
            System.out.println("Ingrese 2 para mostrar la lista de los libros");
            System.out.println("Ingrese 3 para buscarun libro por titulo");
            System.out.println("Ingrese 4 para salir");
            System.out.println("");
            opcion = scan.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.print("Registro de libros");
                    libro libros = new libro();
                    System.out.print("Ingrese el título del libro: ");
                    libros.titulo = scan.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    libros.autor = scan.nextLine();
                    boolean esIncorrecto=true;
                    do{
                        String entrada;
                        try{//intente ejecutar la función
                            System.out.print("Ingrese el año de publicacion del libro: ");
                            entrada=scan.nextLine();
                           libros.año = (short) Integer.parseInt(entrada);

                            esIncorrecto=false;
                        }catch(NumberFormatException error){
                         //catch atrape el error
                            System.out.println("No ingresó un número");
                        }
                    }while(esIncorrecto);
                    
                    System.out.println("Libro registrado con éxito.");
                    
                }
                case "2" -> {
                    System.out.println("Lista de libros por titulo");
                    System.out.println("Libro 1: ");
                }
                case "3" -> {}
                case "4" -> {System.out.println("Saliendo del programa...");}
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while (!opcion.equals("4"));
    }
    
}
