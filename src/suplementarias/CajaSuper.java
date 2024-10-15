package suplementarias;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class CajaSuper extends Thread {

	private ArrayList<Cliente> queue;
	private File f;
	private String nombreCaja;
	public CajaSuper(String nombreCaja,ArrayList<Cliente> queue, File f) {
		super();
		this.queue = queue;
		this.f = f;
		this.nombreCaja = nombreCaja;
	}
	
	public void run() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
			Cliente c;
			String aux;
			while (true) {
				synchronized(queue){
					if (queue.isEmpty()) break;
					c = queue.remove(0);}
				for (int i = 1; i<=c.getCantidadProductos(); i++) {
					aux = this.nombreCaja+": El producto " + i + " del cliente " + c.getId()+ " ha pasado por caja.";				
					synchronized(f) {
						bw.write(aux);
						bw.newLine();
					}
				}
				synchronized(f) {
					bw.write(this.nombreCaja+": El cliente " + c.getId()+ " ha sido atendido");
					bw.newLine();
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
