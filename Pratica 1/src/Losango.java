
public class Losango extends Poligono {
	

	public Losango(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	@Override
	public double area() {
		return getBase()*getAltura();
	}
	
	@Override
	public double perimetro() {
	return 4 * getBase();
	}

}