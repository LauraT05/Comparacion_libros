import java.util.ArrayList;

public class Ejm2 {
    public static void main(String[] args) {

        ArrayList<Descontable> descontables = new ArrayList<>();

        descontables.add(new Producto(150));
        descontables.add(new Servicio(100));

        for (Descontable d : descontables) {
            System.out.println("El descuento es: " + d.aplicarDescuento());
        }
    }

}

interface Descontable{
    double aplicarDescuento();
}

class Producto implements Descontable{
    double precio;

    public Producto(double precio){
        this.precio = precio;
    }

    @Override
    public double aplicarDescuento() {
        return this.precio * 0.1;
    }
}

class Servicio implements Descontable {
    double precio;
    public Servicio(double precio){
        this.precio = precio;
    }

    @Override
    public double aplicarDescuento() {
        return this.precio * 0.2;
    }
}


