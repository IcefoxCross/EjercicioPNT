class Producto implements Comparable {
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
        return String.format("Nombre: %1s /// Precio: $%2s", nombre,Math.round(precio));
    }

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
        return String.format("Nombre: %1s /// Litros: %2s /// Precio: $%3s", getNombre(),litros,Math.round(getPrecio()));
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
        return String.format("Nombre: %1s /// Contenido: %2s /// Precio: $%3s", getNombre(),contenido,Math.round(getPrecio()));
    }
}

class Fresco extends Producto {
    private String uVenta;

    public Fresco(String _nombre, String _uVenta, double _precio) {
        super(_nombre, _precio);
        uVenta = _uVenta;
    }

    public getUVenta() {
        return uVenta;
    }

    public String toString() {
        return String.format("Nombre: %1s /// Precio: %2s /// Unidad de Venta: $%3s", getNombre(),Math.round(getPrecio()),uVenta);
    }
}

public class Comercio {
    public static void main(String[] args) {
        Producto[] p = cargarProductos();

        for (int i=0;i<p.length;i++) {
            System.out.println(p[i]);
        }
    }

    public static Producto[] cargarProductos() {
        Producto[] p = new Producto[]{
            new Bebida("Coca-Cola Zero", 1.5, 20),
            new Bebida("Coca-Cola",1.5,18),
        };
        return p;
    }
}