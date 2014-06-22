package mx.com.bamboodnd;

import java.util.LinkedList;

public class Imprimir {
	public static void main(String[] args) {

		LinkedList<Piso> pisos = new LinkedList<Piso>();

		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			// Variable para checar que entro en un cuarto
			boolean entro = false;
			// Primero se checa que quepa en algún piso
			System.out.println("----" + Integer.toString(pisos.size()));
			for (Piso p : pisos) {

				int cp = (int) Math.sqrt(p.getUltimoOcupante() + i);
				System.out.println(Integer.toString(p.getUltimoOcupante() + i)
						+ " " + Integer.toString(cp));
				if (((int) Math.pow(cp, 2)) == (p.getUltimoOcupante() + i)) {
					System.out.println("Es cuadrado perfecto");
					entro = true;
					p.aumentarOcupantes(i);
					break;
				}
			}
			// Si no entro se le da su propio piso
			if (!entro) {
				Piso p = new Piso();
				p.aumentarOcupantes(i);
				pisos.add(p);
			}
		}

		System.out.println("Hay " + Integer.toString(pisos.size())
				+ " pisos al final");
		System.out.println("--------");
		for (int i = 0; i < pisos.size(); i++) {
			if (pisos.get(i).getUltimoOcupante() == Integer.parseInt(args[0])) {
				System.out.println("El sujeto " + Integer.parseInt(args[0])
						+ " esta en el piso " + Integer.toString(i + 1)
						+ " en la habitacion " + pisos.get(i).getOcupantes());
			}
		}
	}
}