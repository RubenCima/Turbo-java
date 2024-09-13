package servicio;

import dominio.Pelicula;

//una interface no contiene la definicion de sus metodos, solo escribe los metodos que posteriormente otra clase tendra que implementar
public interface IServicioPeliculas {
    public void listarPeliculas();
    public void agregarPelicula(Pelicula pelicula); //recibe el parametro de pelicula , la pelicula a agregar
    public void buscarPelicula(Pelicula pelicula);

}
