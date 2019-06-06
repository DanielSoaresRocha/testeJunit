import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class testUnit {
	
	@Test
	public void teste1() throws Excessao {
		//testar se a venda foi criada
		ClasseTeste c = new ClasseTeste();
		c.criarVenda("Cama", 2000);
		
		assertEquals(c.venda.getValor(),2000);
		
	}
	
	
	@Test
	public void teste2() throws Excessao {
		//testar se a venda foi criada
		ClasseTeste c = new ClasseTeste();
		c.criarVenda("Cama", 2000);
		
		assertEquals(c.venda.getNome(),"Cama");
	}
	
	@Test
	public void teste2_0() throws Excessao {
		//testar se a venda foi criada
		ClasseTeste c = new ClasseTeste();
		
		assertThrows(Excessao.class, () -> c.criarVenda("Cama", 0));
	}
	
	@Test
	public void teste2_1() throws Excessao {
		//testar se a venda foi criada
		ClasseTeste c = new ClasseTeste();
		
		assertThrows(Excessao.class, () -> c.criarVenda("Cama", Integer.MAX_VALUE));
	}
	
	
	@Test
	public void teste3() throws Excessao {
		//testar se a o cliente foi criado
		ClasseTeste c = new ClasseTeste();
		c.criarCliente("Lucas", "rua da inconfidencia");
		
		assertEquals(c.pessoa.getNome(),"Lucas");
	}
	
	@Test
	public void teste4() throws Excessao {
		//testar se a o cliente foi criado
		ClasseTeste c = new ClasseTeste();
		c.criarCliente("Lucas", "rua da inconfidencia");
		
		assertEquals(c.pessoa.getEndereco(),"rua da inconfidencia");
	}
	
	@Test
	public void teste4_0() throws Excessao {
		//Passando nome menor do que o esperado
		ClasseTeste c = new ClasseTeste();
		
		assertThrows(Excessao.class, () -> c.criarCliente("L", "rua da inconfidencia"));
	}
	
	@Test
	public void teste4_1() throws Excessao {
		//Passando nome menor do que o esperado
		ClasseTeste c = new ClasseTeste();
		
		assertThrows(Excessao.class, () -> c.criarCliente("Lucas", "r"));
	}
	
	@Test
	public void teste5() throws Exception {
		//testar realizar venda
		Venda v = new Venda("Mesa", 500);
		Pessoa p = new Pessoa("Daniel","Rua capitão bastos");
		
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertEquals(c.realizarVenda(v, p), p);
	}
	
	@Test
	public void teste5_0() throws Exception {
		//passando valor = 0
		Venda v = new Venda("Mesa", 0);
		Pessoa p = new Pessoa("Daniel","Rua capitão bastos");
		
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertThrows(Excessao.class, () -> c.realizarVenda(v, p));
	}
	
	@Test
	public void teste6() throws Exception {
		//testando passando null como parâmetro
		Venda v = new Venda("Mesa", 500);
		Pessoa p = null;
		
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertEquals(c.realizarVenda(v, p), null);
	}
	
	@Test
	public void teste7() throws Exception {
		//testar realizar venda
		Venda v = null;
		Pessoa p = new Pessoa("Daniel","Rua capitão bastos");
		
		System.out.println("venda = "+ v + " pessoa = "+ p.getNome());
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertEquals(c.realizarVenda(v, p), null);
	}
	
	@Test
	public void teste8() throws Exception {
		//iniciando nome menor que o suficiente
		Venda v = new Venda("",500);
		Pessoa p = new Pessoa("Daniel","Rua capitão bastos");
		
		System.out.println("venda = "+ v + " pessoa = "+ p.getNome());
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertThrows(Excessao.class, () -> c.realizarVenda(v, p));
	}
	
	@Test
	public void teste9() throws Exception {
		//iniciando nome menor que o suficiente
		Venda v = new Venda("Mesa", 500);
		Pessoa p = new Pessoa("","Rua capitão bastos");
		
		System.out.println("venda = "+ v + " pessoa = "+ p.getNome());
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertThrows(Excessao.class, () -> c.realizarVenda(v, p));
	}
	
	@Test
	public void teste10() throws Exception {
		//iniciando nome menor que o suficiente
		Venda v = new Venda("Mesa", 500);
		Pessoa p = new Pessoa("Gustavo","s");
		
		System.out.println("venda = "+ v + " pessoa = "+ p.getNome());
		ClasseTeste c = new ClasseTeste();
		//c.realizarVenda(v, p);
		
		assertThrows(Excessao.class, () -> c.realizarVenda(v, p));
	}
	
	@Test
	public void teste11() throws Exception {
		//Adicionando ao ArrayList de pessoa
		Venda p1 = new Venda("cama", 2000);
		Venda p2 = new Venda("mesa", 500);
		Venda p3 = new Venda("lençol", 150);
		
		Pessoa p = new Pessoa("Daniel", "rua tal");
		
		ArrayList<Venda> listaCompras = new ArrayList<>();
		listaCompras.add(p1);
		listaCompras.add(p2);
		listaCompras.add(p3);
		
		
		ClasseTeste c = new ClasseTeste();
		
		assertEquals(c.adicionarCompras(p, listaCompras), p.getCompras());
		
	}
	
	@Test
	public void teste10_0() throws Exception {
		//Adicionando ArrayList vazio
		
		ArrayList<Venda> listaCompras = null;
		
		ClasseTeste c = new ClasseTeste();
		
		Pessoa p = new Pessoa("Daniel", "rua tal");
		
		assertEquals(c.adicionarCompras(p, listaCompras), null);
		
	}
	
	
}
