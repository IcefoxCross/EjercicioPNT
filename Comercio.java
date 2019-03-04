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
        return String.format("Nombre: %s /// Precio: $%s", nombre,Math.round(precio));
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

    public getUVenta() {
        return uVenta;
    }

    public String toString() {
        return String.format("Nombre: %s /// Precio: $%s /// Unidad de Venta: %s", getNombre(),Math.round(getPrecio()),uVenta);
    }
}

public class Comercio {
    public static void main(String[] args) {
        Producto[] p = cargarProductos();

        for (Producto prod : p) {
            System.out.println(prod);
        }
        System.out.println("=============================");
        System.out.println(String.format("Producto más caro: %s", maxProducto(p).getNombre()));
        System.out.println(String.format("Producto más barato: %s", minProducto(p).getNombre()));
    }

    public static Producto[] cargarProductos() {
        Producto[] p = new Producto[]{
            new Bebida("Coca-Cola Zero", 1.5, 20),
            new Bebida("Coca-Cola",1.5,18),
            new Limpieza("Shampoo Sedal", "500ml", 19),
            new Fresco("Frutillas", "kilo", 64)
        };
        return p;
    }

    public static Producto minProducto(Producto[] p) {
        Producto min = new Producto("Ninguno", Double.MAX_VALUE);
        for (Producto prod : p) {
            if (prod.getPrecio() < min.getPrecio()) {
                min = prod;
            }
        }
        return min;
    }

    public static Producto maxProducto(Producto[] p) {
        Producto max = new Producto("Ninguno", 0.0);
        for (Producto prod : p) {
            if (prod.getPrecio() > max.getPrecio()) {
                max = prod;
            }
        }
        return max;
    }
}