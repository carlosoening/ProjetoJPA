package vo;

public class Pais {
	private Integer id;
	private String nome;
	private String linguaPrincipal;
	private String continente;
	private Integer populacao;
	private Double dimensao;
	private String codigoDeDiscagem;
	private Estado[] estados;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLinguaPrincipal() {
		return linguaPrincipal;
	}
	public void setLinguaPrincipal(String linguaPrincipal) {
		this.linguaPrincipal = linguaPrincipal;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public Integer getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Integer população) {
		this.populacao = população;
	}
	public Double getDimensao() {
		return dimensao;
	}
	public void setDimensao(Double dimensao) {
		this.dimensao = dimensao;
	}
	public String getCodigoDeDiscagem() {
		return codigoDeDiscagem;
	}
	public void setCodigoDeDiscagem(String codigoDeDiscagem) {
		this.codigoDeDiscagem = codigoDeDiscagem;
	}
	public Estado[] getEstados() {
		return estados;
	}
	public void setEstados(Estado[] estados) {
		this.estados = estados;
	}
}
