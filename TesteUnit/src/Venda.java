
public class Venda {
	String nome;
	int valor;
	
	public Venda() {
		
	}
	
	public Venda(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
