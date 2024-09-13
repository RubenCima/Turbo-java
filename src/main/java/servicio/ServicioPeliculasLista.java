package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{
    private final List<Pelicula> peliculas; //a)creamos una lista de peliculas
// se puede entender List como una interfaz, y ArrayList como un metodo de la interfaz List
    public ServicioPeliculasLista(){
        this.peliculas =new ArrayList<>();//b)inicializamos la lista peliculas con su constructor
    }
    @Override
    public void listarPeliculas() {
        System.out.println("listado de peliculas...");
        peliculas.forEach(System.out::println); //c)imprimir cada objeto de tipo pelicula(metodo reference)

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);//d) agregamos objeto tipo pelicula
        System.out.println("Se agrego la película: " + pelicula);

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //devuelve el indice de la pelicula encontrada en la lista
        var indice=peliculas.indexOf(pelicula); //e) saber el indice del objeto tipo pelicula
        System.out.println("Pelicula encontrada en el indice: " + indice);

    }

    public static void main(String[] args) {
        //crear algunos objetos de tipo pelicula
        var pelicula1 = new Pelicula("Batman");
        var pelicula2 = new Pelicula("Superman");

        // Creamos el servicio (PATRON DE DISEÑO SERVICE), al crearlo podemos usar los metodos de la interfaz
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista(); //usamos el objeto servicioPeliculas y creamos un nuevo objeto que implementa la interfaz- Interfaz=implementacion Interfaz

        //Agregamos las peliculas a la lista
        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);

        //Listamos las peliculas
        servicioPeliculas.listarPeliculas();
        //Buscamos una pelicula
        //Se debe implementar el metodo equals
        servicioPeliculas.buscarPelicula(pelicula2);
    }
}
