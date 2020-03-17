
public class Quadrado extends Poligono implements Diagonal {
	
	public Quadrado (double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	@Override
	public double diagonal() {
		return getAltura()*Math.sqrt(2);
	}
	
	@Override
	public double area() {
		if(getAltura()==getBase()) {
		return getBase()*getBase();
		}else return 0;
	}
	
	@Override
	public double perimetro() {
		if(getAltura()==getBase()) {
			return getBase()*4;
			}else return 0;
	}
}
