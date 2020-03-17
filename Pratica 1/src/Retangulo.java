
public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo(double base, double altura) {
		super.setBase(base);
		super.setAltura(altura);
	}
	@Override
	public double diagonal() {
		return	Math.sqrt(Math.pow(getBase(), 2)+Math.pow(getAltura(), 2));
	}
	
	@Override
	public double perimetro() {
	return (getBase()*2+getAltura()*2);
	}
	
	@Override
	public double area() {
		return getBase()*getAltura();
	}

}