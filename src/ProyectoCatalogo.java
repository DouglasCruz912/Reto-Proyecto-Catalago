import org.douglas.raiz.catalago.clase.abstracta.*;
import org.douglas.raiz.catalago.clases.de.negocio.*;
import org.douglas.raiz.catalago.interfaces.*;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[6];
        productos[0] = new IPhone(299000, "Apple", "3G", "Negro");
        productos[1] = new IPhone(399000, "Apple", "4G", "Blanco");
        productos[2] = new TvLcd(340000, "Sony", 40);
        productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        productos[5] = new Comics(5000, "Pepo", "Condorito", "Alguna...", "Condorito");



        for (IProducto producto : productos) {

            System.out.print("Tipo de producto: " + producto.getClass().getSimpleName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                if (producto instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) producto).getColor());
                }

                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getEditorial());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getFechaPublicacion());


                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}