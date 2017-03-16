package exerciciosFiguras;

public class Losango extends Quadrilatero {

	@Override
	public String toString() {
		return "Losango []";
	}

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		double area = 0;

		area = (getBase() * getAltura()) / 2;

		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;

		perimetro = 4 * getBase();

		return perimetro;
	}
}
