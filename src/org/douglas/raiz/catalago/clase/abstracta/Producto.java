package org.douglas.raiz.catalago.clase.abstracta;
import org.douglas.raiz.catalago.interfaces.IProducto;

abstract public class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
