package classes.classes.DAO;


public class produtos {
	
	
	private int idproduto;
	private String nomeproduto;
	private int quantidade;
	private double valor;
	listascompras listascompras;
	
	
	public int getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public listascompras getListascompras() {
		return listascompras;
	}
	public void setListascompras(listascompras listascompras) {
		this.listascompras = listascompras;
	}
	
	
	
	
	public produtos(){
		
	}
	public produtos(int idproduto, String nomeproduto, int quantidade,
			double valor, classes.classes.DAO.listascompras listascompras) {
		super();
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.listascompras = listascompras;
	}
	
	
	
	

}
