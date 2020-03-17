
public class PaisTeste {
	
	public static void main(String args[]) {
		PaisService service = new PaisService();
		Pais pais = new Pais();
		pais.setId(5);
		pais.setNome("Excluir");
		pais.setPopulacao(10);
		pais.setArea(20);
		service.criar(pais);
		service.carregar(pais);
		System.out.println(pais);
		service.excluir(5);
		System.out.println(pais);
		Pais x = new Pais();
		Pais z= new Pais();
		service.maiorP(x);
		System.out.println("Maior População: "+x.toString());
		service.menorA(z);
		System.out.println("Menor Area: "+z.toString());		
		Pais[] y =service.vetorTresPaises();
		for(Pais p:y ) {			
			System.out.println("Vetores: "+p.toString());			
		}
	}
}
