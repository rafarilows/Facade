public class Combo {
	
	private Burguer burguer;
	private Sobremesa sobremesa;
	private Bebida bebida;
	
	public void criarCombo(int tipo) {
		if (tipo == 1) {
			this.burguer = new Burguer(2, "cheddar", 50.00);
			this.bebida = new Bebida(100, "agua", 50.00);
		} else if(tipo == 2) {
			this.burguer = new Burguer(2, "cheddar", 50.00);
			this.bebida = new Bebida(100, "agua", 50.00);
			this.sobremesa = new Sobremesa("medio", "torta", 50.00);
		}
	}
	
	@Override
	public String toString() {
		String string = "";
		
		if (burguer != null) {
			string += burguer + "\n"; 
		}
		if (bebida != null) {
			string += bebida + "\n";
		}
		if (sobremesa != null) {
			string += sobremesa + "\n";
		}
		return string;
	}
	
}
