package vo;

public class Estado {
	private Integer id;
	private String nome;
	private String uf;
	private Integer populacao;
	private Double dimensao;
	private Integer qtdCidades;
	private Pais pais;
	
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
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if(uf != null) {
		uf.toUpperCase();
		}
		this.uf = uf;
	}
	public Integer getPopulacao() {
		return populacao;
	}
	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}
	public Double getDimensao() {
		return dimensao;
	}
	public void setDimensao(Double dimensao) {
		this.dimensao = dimensao;
	}
	public Integer getQtdCidades() {
		return qtdCidades;
	}
	public void setQtdCidades(Integer qtdCidades) {
		this.qtdCidades = qtdCidades;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
