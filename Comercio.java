class Producto {
    private String nombre;
    private float precio;

    public Producto(String _nombre, float _precio) {
        nombre = _nombre;
        precio = _precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String toString() {
        return "Nombre: "+nombre+" /// Precio: $"+Math.round(precio);
    }
}

public class Comercio {
    public static void main(String[] args) {
        Producto[] p = cargarProductos();

        System.out.println(p[0]);
    }

    public static Producto[] cargarProductos() {
        Producto[] p = new Producto[]{
            new Producto("Frutillas", 64)
        };
        return p;
    }
}