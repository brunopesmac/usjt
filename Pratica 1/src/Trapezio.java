public class Trapezio extends Poligono {
	double baseM;
	double lado;
	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}
	public double getBaseM() {
		return baseM;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public Trapezio(double base, double altura, double lado, double baseM) {
		this.setBase(base);
		this.setAltura(altura);
		this.baseM = baseM;
		this.lado = lado;
	}
	@Override
	public double area() {
		return (((getBase() + getBaseM()) * getAltura())/2);
	}
	@Override
	public double perimetro() {
		return (2 * getLado() + getBase() + getBaseM());
	}
}
