public class AireAcondicionado extends Decorador {
    public AireAcondicionado(Venta venta){
        super(venta);
    }

    public String getDescripcion() {
        return getVenta().getDescripcion()+" +Aire Acondicionado";
    }
    public int getPrecio() {
        return getVenta().getPrecio()+1500;
    }
}