public class Navegador extends Decorador{
    public Navegador(Venta venta){
        super(venta);
    }

    public String getDescripcion() {
        return getVenta().getDescripcion()+" +Navegador";
    }
    public int getPrecio() {
        return getVenta().getPrecio()+500;
    }
}