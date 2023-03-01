public class Main {
    public static void main(String[] args) {
        double precio = 125.99;
        double porcentajeIVA = 21.0;

        double precioConIVA = calcularPrecioConIVA(precio, porcentajeIVA);

        System.out.println("Precio con IVA incluido: " + precioConIVA);
    }
    public static double calcularPrecioConIVA(double precio, double porcentajeIVA){
        double precioConIVA = precio + (precio * porcentajeIVA / 100);
        return precioConIVA;
    }
}
