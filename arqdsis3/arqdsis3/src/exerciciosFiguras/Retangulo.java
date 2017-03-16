package exerciciosFiguras;

public class Retangulo extends Quadrilatero implements Diagonal {

	@Override
	public String toString() {
		return "Retangulo []";
	}

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calculaDiagonal() {
		double diagonal = 0;

		diagonal = Math.sqrt((Math.pow(getBase(), 2)) + (Math.pow(getAltura(), 2)));

		return diagonal;
	}

	@Override
	public double area() {
		double area = 0;

		area = getBase() * getAltura();
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;

		perimetro = 2 * (getBase() + getAltura());

		return perimetro;
	}
}
