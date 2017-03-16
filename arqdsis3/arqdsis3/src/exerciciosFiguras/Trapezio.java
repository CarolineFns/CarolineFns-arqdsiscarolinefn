package exerciciosFiguras;

public class Trapezio extends Quadrilatero {
	@Override
	public String toString() {
		return "Trapezio [baseMaior=" + baseMaior + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	private double baseMaior, a, b, c, d;

	public Trapezio(double base, double altura, double baseMaior, double a, double b, double c, double d) {
		super(base, altura);
		setBaseMaior(baseMaior);
		setA(a);
		setB(b);
		setC(c);
		setD(d);
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

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	@Override
	public double area() {
		double area = 0;

		area = (getAltura() * (getBaseMaior() + getBase())) / 2;

		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;

		perimetro = (getA() * getB()) + (getB() * getC()) + (getC() * getD()) + (getD() * getA());

		return perimetro;
	}

}
