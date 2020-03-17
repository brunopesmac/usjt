
public class Triangulo extends Poligono {
	private double lado;
	
	public Triangulo(double base, double altura, double lado) {
		this.setBase(base);
		this.setAltura(altura);
		this.lado = lado;
		}
	public void setLado(double lado) {
	this.lado = lado;
	}
	public double getLado() {
	return lado;
	}
	public Triangulo(double lado) {
	this.lado = lado;
	}	
	@Override
	public double area() {
		return (getBase()*getAltura())/2;
	}
	@Override
	public double perimetro() {
	return getBase() + getAltura() + getLado();
	}

}