package vo;

public class Cidade {
	private Integer id;
	private String nome;
	private Integer populacao;
	
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	private Double dimensao;
	private Estado estado;
}
