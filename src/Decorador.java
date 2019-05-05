
	public abstract class Decorador implements Venta{
		private Venta venta;
		public Decorador(Venta venta) {
			setVenta(venta);
		}
		public Venta getVenta() {
			return venta;
		}
		public void setVenta(Venta venta) {
			this.venta=venta;
		}
		}

