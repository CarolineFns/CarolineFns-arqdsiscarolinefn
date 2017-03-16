package exerciciosFiguras;

public class Triangulo extends Poligono {
	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	private double a, b, c;

	public Triangulo(double base, double altura, double a, double b, double c) {
		super(base, altura);
		setA(a);
		setB(b);
		setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
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

		perimetro = ((getA() * getB()) + (getB() * getC()) + (getC() * getA()));

		return perimetro;
	}

}
