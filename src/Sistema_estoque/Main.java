package Sistema_estoque;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Cadastrar_produto c1 = new Cadastrar_produto();
		
		c1.cadastrarProduto(p1);
	   
		System.out.println("ID:"+ p1.getId());
		System.out.println("Descrição:"+ p1.getDescricao());
		System.out.println("Estoque Minimo:"+ p1.getEstoqueMinimo());
		System.out.println("Estoque:"+ p1.getUnidade());

	}

}
