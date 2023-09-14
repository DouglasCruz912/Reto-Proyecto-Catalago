package org.douglas.raiz.catalago.clases.de.negocio;

import org.douglas.raiz.catalago.clase.abstracta.Electronico;
import org.douglas.raiz.catalago.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto {

    private String modelo;

    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }
}
