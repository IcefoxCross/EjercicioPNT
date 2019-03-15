public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String n, double p) {
        nombre = n;
        precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return String.format("Nombre: %s /// Precio: $%s", nombre,Math.round(precio));
    }

    @Override
    public int compareTo(Producto p) {
        return Double.compare(this.precio, p.precio);
    }

    public boolean mayorQue(Producto p) {
        return this.compareTo(p) == 1;
    }

    public boolean menorQue(Producto p) {
        return this.compareTo(p) == -1;
    }
}

class Bebida extends Producto {
    private double litros;

    public Bebida(String n, double l, double p) {
        super(n, p);
        litros = l;
    }

    public double getLitros() {
        return litros;
    }

    public String toString() {
        return String.format("Nombre: %s /// Litros: %s /// Precio: $%s", getNombre(),litros,Math.round(getPrecio()));
    }
}

class Limpieza extends Producto {
    private String contenido;

    public Limpieza(String n, String c, double p) {
        super(n, p);
        contenido = c;
    }

    public String getContenido() {
        return contenido;
    }

    public String toString() {
        return String.format("Nombre: %s /// Contenido: %s /// Precio: $%s", getNombre(),contenido,Math.round(getPrecio()));
    }
}

class Fresco extends Producto {
    private String uVenta;

    public Fresco(String n, String u, double p) {
        super(n, p);
        uVenta = u;
    }

    public String getUVenta() {
        return uVenta;
    }

    public String toString() {
        return String.format("Nombre: %s /// Precio: $%s /// Unidad de Venta: %s", getNombre(),Math.round(getPrecio()),uVenta);
    }
}