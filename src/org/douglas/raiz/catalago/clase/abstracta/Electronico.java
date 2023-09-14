package org.douglas.raiz.catalago.clase.abstracta;
import org.douglas.raiz.catalago.interfaces.IElectronico;
abstract public class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
