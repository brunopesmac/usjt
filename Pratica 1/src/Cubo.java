
public class Cubo extends Quadrado implements Volume{
	private double comprimento;
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getComprimento() {
		return comprimento;
	}
	public Cubo(double base, double altura, double comprimento) {
		super(base, altura);
		this.comprimento = comprimento;
	}
	@Override
	public double volume(){
		return getComprimento() * getBase() * getAltura();
	}
}
