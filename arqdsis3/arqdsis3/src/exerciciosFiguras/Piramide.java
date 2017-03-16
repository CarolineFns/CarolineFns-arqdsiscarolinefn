package exerciciosFiguras;

public class Piramide extends Figura3D {
	private Quadrado quadrado;
	private Triangulo triangulo;

	public Piramide(Quadrado quadrado, Triangulo triangulo) {
		this.quadrado = quadrado;
		this.triangulo = triangulo;
	}

	@Override
	public double volume() {
		double volume = 0;

		volume = (quadrado.getBase() * triangulo.getAltura()) / 3;

		return volume;
	}

	@Override
	public String toString() {
		return "Piramide [quadrado=" + quadrado + ", triangulo=" + triangulo + "]";
	}
}
