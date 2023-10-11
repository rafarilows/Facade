
public class Bebida extends Produto{

	private int ml;
	
	public Bebida(int ml, String descricao, double preco) {
		super(descricao, preco);
		this.ml = ml;
	}
	public int getMl() {
		return ml;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + ml + "ml";
	}
}
