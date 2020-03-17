
public class Cilindro extends Circulo implements Volume{
	private double altura;
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	@Override
	public double volume() {
		return Math.PI * Math.pow(getRaio(), 3) * getAltura();
	}
}
