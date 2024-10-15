package suplementarias;

public class Cliente {

	private String id;
	private int cantidadProductos;
	
	public Cliente(String id, int cantidadProductos) {
		super();
		this.id = id;
		if (cantidadProductos<0 || cantidadProductos >5) {
			System.out.println("ERROR: La cantidad de productos es erronéa. Debe estar entre 0 y 5, ambos inclusive.");
			
		} else this.cantidadProductos = cantidadProductos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cantidadProductos=" + cantidadProductos + "]";
	}
	
	
}
