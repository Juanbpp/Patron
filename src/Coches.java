
public abstract class Coches {
	 public static void main(String[] args) {

	        Venta auto = new Audi();
	        auto = new Radio(auto);
	        auto = new Gasolina(auto);
	        
	        System.out.println(auto.getDescripcion());
	        System.out.println("Su precio es: " + auto.getPrecio()+"€.");

	        Venta auto1= new Mercedes();
	        auto1 = new AireAcondicionado(auto1);
	        auto1 = new Diesel(auto1);
	        auto1 = new Navegador(auto1);
	        
	        System.out.println("");
	        System.out.println(auto1.getDescripcion());
	        System.out.println("Su precio es: " + auto1.getPrecio()+"€.");

	        Venta auto2= new Volskwagen();
	        auto2 = new Gasolina(auto2);
	        
	        System.out.println("");
	        System.out.println(auto2.getDescripcion());
	        System.out.println("Su precio es: " + auto2.getPrecio()+"€.");

	}
}

