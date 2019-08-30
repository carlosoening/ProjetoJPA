package vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {
	@Id()
	@GeneratedValue
	@Column(name = "cide_id")
	private Integer id;
	
	@Column(name = "cide_nmcidade")
	private String nome;
	
	@Column(name = "cide_qtdpupulacao")
	private Integer populacao;
	
	@Column(name = "cide_nndimensao")
	private Double dimensao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Estado estado;
	
	public Cidade(Integer id) {
		this.id = id;
	}
	
	public Cidade() {
	}
	
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
}
