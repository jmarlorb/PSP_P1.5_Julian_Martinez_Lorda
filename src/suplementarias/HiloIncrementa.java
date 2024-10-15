package suplementarias;

public class HiloIncrementa extends Thread {
	public static int contador = 0;
	public void run() {
		for (int i = 0; i<4 && HiloIncrementa.contador<10;i++) {
		synchronized(HiloIncrementa.class) {contador++;
		System.out.println("Valor: "+contador);}
		}
	}
}
