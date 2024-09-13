package presentacion;

import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {

        var salir = false;
        var consola = new Scanner(System.in);
        //Agregamos implementacion del servicio

        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        while (!salir) {
            try {
                mostrarMenu();
                //  salir = ejecutarOpciones(consola, servicioPeliculas);
            } catch (Exception e) {
                System.out.println("ocurrio un error : " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                *** Catalogo de Peliculas *** 
                1. Agregar pelicula
                2. Listar peliculas
                3. Buscar pelicula
                4. Salir
                """);


    }

    private static boolean ejecutarOpciones(Scanner consola, IServicioPeliculas servicioPeliculas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {

            }
        }
    }

}
