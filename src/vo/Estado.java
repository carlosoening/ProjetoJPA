package vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.internal.NotNull;

@Entity
public class Estado {
	@Id
	@GeneratedValue
	@Column(name = "estd_id")
	private Integer id;
	
	@Column(name = "estd_nmestado")
	private String nome;
	
	@Column(name = "estd_cduf")
	private String uf;
	
	@Column(name = "estd_qtdpopulacao")
	private Integer populacao;
	
	@Column(name = "estd_nndimensao")
	private Double dimensao;
	
	@Column(name = "estd_qtdCidades")
	private Integer qtdCidades;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn()
	@NotNull
	private Pais pais;
	
	public Estado(Integer id) {
		this.id = id;
	}
	
	public Estado() {
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
