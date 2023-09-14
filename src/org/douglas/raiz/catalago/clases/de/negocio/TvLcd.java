package org.douglas.raiz.catalago.clases.de.negocio;
import org.douglas.raiz.catalago.clase.abstracta.Electronico;
public class TvLcd extends Electronico{

    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

    public int getPulgada() {
        return pulgada;
    }
}
