/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 * @author Cristian
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            System.out.println("");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros con el título: " + titulo);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese 1 para agregar libro");
            System.out.println("Ingrese 2 para listar libros");
            System.out.println("Ingrese 3 para buscar libro por título");
            System.out.println("Ingrese 4 para salir");
            System.out.println("");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anio = scanner.nextInt();
                    System.out.println("");
                    scanner.nextLine();

                    Libro libro = new Libro(titulo, autor, anio);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    System.out.println("");
                    biblioteca.listarLibros();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Ingrese el título o parte del título del libro a buscar: ");
                    String tituloBusqueda = scanner.nextLine();
                    biblioteca.buscarLibroPorTitulo(tituloBusqueda);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
