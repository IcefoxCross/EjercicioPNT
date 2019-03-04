public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String _nombre, double _precio) {
        nombre = _nombre;
        precio = _precio;
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
}

class Bebida extends Producto {
    private double litros;

    public Bebida(String _nombre, double _litros, double _precio) {
        super(_nombre, _precio);
        litros = _litros;
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

    public Limpieza(String _nombre, String _contenido, double _precio) {
        super(_nombre, _precio);
        contenido = _contenido;
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

    public Fresco(String _nombre, String _uVenta, double _precio) {
        super(_nombre, _precio);
        uVenta = _uVenta;
    }

    public String getUVenta() {
        return uVenta;
    }

    public String toString() {
        return String.format("Nombre: %s /// Precio: $%s /// Unidad de Venta: %s", getNombre(),Math.round(getPrecio()),uVenta);
    }
}