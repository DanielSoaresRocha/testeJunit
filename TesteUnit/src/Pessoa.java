import java.util.ArrayList;

public class Pessoa {
	String nome;
	String endereco;
	ArrayList<Venda> compras;
	
	public Pessoa() {
		
		compras = new ArrayList<>();
	}
	
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		compras = new ArrayList<>();
	}
	
	public ArrayList<Venda> getCompras() {
		return this.compras;
	}
	
	public void setCompras(ArrayList<Venda> compras) {
		this.compras = compras;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
