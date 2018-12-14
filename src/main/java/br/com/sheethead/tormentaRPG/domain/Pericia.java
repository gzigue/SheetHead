package br.com.sheethead.tormentaRPG.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sheethead.tormentaRPG.enums.Atributo;

@Entity
public class Pericia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Integer atributo;
	private Integer atributoAlternativo = null;
	private boolean penalidadeDeArmadura;
	private boolean somenteTreinado;
	private Integer graduacao;
	private Integer modificador;
	private Integer outros;
	private Integer total;
	
	public Pericia() {
	}
	
	public Pericia(Integer id, String nome, Atributo atributo, boolean penalidadeDeArmadura,
			boolean somenteTreinado) {
		super();
		this.id = id;
		this.nome = nome;
		this.atributo = atributo.getCod();
		this.penalidadeDeArmadura = penalidadeDeArmadura;
		this.somenteTreinado = somenteTreinado;
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

	public Integer getAtributo() {
		return atributo;
	}

	public void setAtributo(Integer atributo) {
		this.atributo = atributo;
	}

	public Integer getAtributoAlternativo() {
		return atributoAlternativo;
	}

	public void setAtributoAlternativo(Integer atributoAlternativo) {
		this.atributoAlternativo = atributoAlternativo;
	}

	public boolean getPenalidadeDeArmadura() {
		return penalidadeDeArmadura;
	}

	public void setPenalidadeDeArmadura(boolean penalidadeDeArmadura) {
		this.penalidadeDeArmadura = penalidadeDeArmadura;
	}

	public boolean isSomenteTreinado() {
		return somenteTreinado;
	}

	public void setSomenteTreinado(boolean somenteTreinado) {
		this.somenteTreinado = somenteTreinado;
	}

	public Integer getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(Integer graduacao) {
		this.graduacao = graduacao;
	}

	public Integer getModificador() {
		return modificador;
	}

	public void setModificador(Integer modificador) {
		this.modificador = modificador;
	}

	public Integer getOutros() {
		return outros;
	}

	public void setOutros(Integer outros) {
		this.outros = outros;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pericia other = (Pericia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
