public class Radio extends Decorador{
    public Radio(Venta venta){
        super(venta);
    }

    public String getDescripcion() {
        return getVenta().getDescripcion()+" +Radio con Mp3";
    }
    public int getPrecio() {
        return getVenta().getPrecio()+1500;
    }
}