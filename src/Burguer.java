
public class Burguer extends Produto{

	private int gramas;
	
	public Burguer(int gramas, String descricao, double preco) {
		super(descricao, preco);
		this.gramas = gramas;
			}
	public int getGramas() {
		return gramas;
	}
	
	@Override
	public String toString(){
		return super.toString() + " " + gramas + "g";
	}
}

