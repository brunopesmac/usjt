
import java.util.ArrayList;
import java.util.List;
public class Geometria {

	public static void main(String[] args) {
		List<Figura> figuras = new ArrayList <>();
		
		figuras.add(new Quadrado(5,5));
		figuras.add(new Retangulo(10,5));
		figuras.add(new Circulo(9.0));
		figuras.add(new Losango(7,8));
		figuras.add(new Triangulo(6,6,6));
		figuras.add(new Trapezio(6, 4, 5, 12));
		figuras.add(new Cubo(8, 8, 8));
		figuras.add(new Esfera(6));
		figuras.add(new Cilindro(7, 10));
		figuras.add(new Piramide(10, 10));
		
		for(Figura f: figuras) {
			System.out.println(f.area());
			System.out.println("Área de " + f + ": " + f.area());
			 if(f instanceof Diagonal) {
			 System.out.println("Diagonal de " + f + ": " +((Diagonal)f).diagonal());
			 }
			 if(f instanceof Volume) {
			 System.out.println("Volume de " + f + ": " +((Volume)f).volume());
			 }
			 System.out.println("Perímetro de " + f + ": " +f.perimetro() + "\n");
			}
	}
}