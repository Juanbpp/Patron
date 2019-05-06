public class Diesel extends Decorador{
    public Diesel(Venta venta){
        super(venta);
    }

    public String getDescripcion() {
        return getVenta().getDescripcion()+" +Motor diesel";
    }
    public int getPrecio() {
        return getVenta().getPrecio()+1500;
    }
}