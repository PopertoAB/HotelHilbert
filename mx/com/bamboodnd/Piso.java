package mx.com.bamboodnd;

public class Piso {
	private int ocupantes = 0;
	private int uOcupante = 0;

	public int getOcupantes() {
		return ocupantes;
	}

	public void aumentarOcupantes(int uOcupante) {
		ocupantes++;
		this.uOcupante = uOcupante;
	}

	public int getUltimoOcupante() {
		return uOcupante;
	}

	public String toString() {
		return Integer.toString(uOcupante) + " " + Integer.toString(ocupantes);
	}

}
