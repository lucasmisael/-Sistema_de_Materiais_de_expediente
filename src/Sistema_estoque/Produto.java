package Sistema_estoque;

public class Produto {
	private int id;
	private String descricao;
	private String unidade;
	private int estoqueMinimo;
	
	
/*	public Produto(int id, String descricao, String unidade, int estoqueMinimo){
		this.id = id;
		this.descricao = descricao;
		this.unidade = unidade;
		this.estoqueMinimo = estoqueMinimo;
	}*/
	
	//Metodos mutantes
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	
	
	
	
	

}
