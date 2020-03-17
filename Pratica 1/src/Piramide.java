
public class Piramide extends Quadrado implements Volume{
	public Piramide(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double volume() {
		return ((getBase() * getBase() * getAltura())/3);
	}
}