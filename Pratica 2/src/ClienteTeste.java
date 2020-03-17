
public class ClienteTeste {
public static void main(String [] args) {
	ClienteService cli = new ClienteService();
	Cliente c = new Cliente();
	for(int i=1;i<40;i++) {
	c.setId(i);
	cli.carregar(c);
	System.out.println(c);
	}
}
}
