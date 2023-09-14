package org.douglas.raiz.catalago.clases.de.negocio;
import org.douglas.raiz.catalago.clase.abstracta.Producto;
import org.douglas.raiz.catalago.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }
}
