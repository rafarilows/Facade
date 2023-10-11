
public class Sobremesa extends Produto{

	private String tamanho;
	
	public Sobremesa(String tamanho, String descricao, double preco) {
		super(descricao, preco);
		this.tamanho = tamanho;
	}
	public String getTamanho() {
		return tamanho;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " +  tamanho;
	}
}

	
