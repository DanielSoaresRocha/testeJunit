import java.util.ArrayList;

public class ClasseTeste {
	Pessoa pessoa;
	Venda venda;
	ArrayList<Pessoa> clientes = new ArrayList<>();
	
	
	public Pessoa realizarVenda(Venda v, Pessoa p) throws Exception {
		if(v == null || p == null) {
			return null;
		}else if(v.nome.length() < 1 || p.getNome().length() < 1 || p.getEndereco().length() < 5) {
			throw new Excessao();
		}else if(v.valor < 1) {
			throw new Excessao();
		}
		p.compras.add(v);
		
		
		return p;
	}
	
	public ArrayList<Venda> adicionarCompras(Pessoa p, ArrayList<Venda> a) throws Excessao {
		if(a == null) {
			return null;
		}
		p.setCompras(a);
		
		clientes.add(p);
		
		return p.getCompras();
	}
	
	public void criarVenda(String nome, int valor) throws Excessao {
		if(valor < 1) {
			throw new Excessao();
		}else if(valor >= Integer.MAX_VALUE) {
			throw new Excessao();
		}
		
		venda = new Venda();
		venda.setNome(nome);
		venda.setValor(valor);
		
	}
	
	public void criarCliente(String nome, String endereco) throws Excessao{
		if(nome.length() < 2 || endereco.length() <2) {
			throw new Excessao();
		}
		pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setEndereco(endereco);
		
	}
	
}
