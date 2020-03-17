
public class Circulo extends Figura {
	private double raio;
	
	public Circulo (Double raio) {
		this.raio=raio;
	}
	@Override
	public double area() {
		return Math.PI *Math.pow(this.raio,2);
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double perimetro() {
	return (Math.PI*raio*2);
	}

}