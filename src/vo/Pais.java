package vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais {
	@Id
	@GeneratedValue
	@Column(name = "pais_id")
	private Integer id;
	
	@Column(name = "pais_nmpais")
	private String nome;
	
	@Column(name = "pais_nmlinguaprincipal")
	private String linguaPrincipal;
	
	@Column(name = "pais_nmcontinente")
	private String continente;
	
	@Column(name = "pais_qtdpopulacao")
	private Integer populacao;
	
	@Column(name = "pais_nndimensao")
	private Double dimensao;
	
	@Column(name = "pais_codigodediscagem")
	private String codigoDeDiscagem;
	
	@OneToMany(mappedBy = "pais")
	private List<Estado> estados;
	
	public Pais(Integer id) {
		this.id = id;
	}
	public Pais() {
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
	public List<Estado> getEstados() {
		return estados;
	}
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
}
