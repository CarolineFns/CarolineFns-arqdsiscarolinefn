package exerciciosFiguras;

public class Cubo extends Figura3D {
	private Quadrado quadrado;

	public Cubo(Quadrado quadrado) {
		this.quadrado = quadrado;
	}

	@Override
	public double volume() {
		double volume = 0;

		volume = Math.pow(quadrado.getAltura(), 3);

		return volume;
	}

	@Override
	public String toString() {
		return "Cubo [quadrado=" + quadrado + "]";
	}
}
