public class Comercio {
    public static void main(String[] args) {
        Producto[] p = cargarProductos();

        for (Producto prod : p) {
            System.out.println(prod);
        }
        System.out.println("=============================");
        System.out.println(String.format("Producto mas caro: %s", maxProducto(p).getNombre()));
        System.out.println(String.format("Producto mas barato: %s", minProducto(p).getNombre()));
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
        Producto m = new Producto("Ninguno", Double.MAX_VALUE);
        for (Producto prod : p) {
            if (prod.getPrecio() < m.getPrecio()) {
                m = prod;
            }
        }
        return m;
    }

    public static Producto maxProducto(Producto[] p) {
        Producto m = new Producto("Ninguno", 0.0);
        for (Producto prod : p) {
            if (prod.mayorQue(m)) {
                m = prod;
            }
        }
        return m;
    }
}