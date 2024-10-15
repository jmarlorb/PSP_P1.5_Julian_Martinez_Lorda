package main;

import java.io.File;
import java.util.ArrayList;

import suplementarias.CajaSuper;
import suplementarias.Cliente;

public class E3_JML {

	public static void main(String[] args) {
		Cliente c;
		ArrayList<Cliente> queue = new ArrayList<Cliente>();
		String filePath = System.getProperty("user.dir")+System.getProperty("file.separator")+"super.log";
		File f = new File(filePath);
		int cantidadClientes = 20;//(int)((Math.random()*(21))+1);
		int cantidadProductos;
		for (int i = 0; i < cantidadClientes; i++) {
			cantidadProductos = (int)(Math.random()*5);
			cantidadProductos++;
			c = new Cliente("CLI-"+(i+1),cantidadProductos);
			queue.add(c);
		}
		CajaSuper cs1 = new CajaSuper("CAJA 1",queue,f);
		CajaSuper cs2 = new CajaSuper("CAJA 2",queue,f);
		
		cs1.start();
		cs2.start();

	}

}
