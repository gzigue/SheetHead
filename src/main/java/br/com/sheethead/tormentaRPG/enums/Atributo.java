package br.com.sheethead.tormentaRPG.enums;

public enum Atributo {

	FOR(0, "Força"),
	DES(1, "Destreza"),
	CON(2, "Constituição"),
	INT(3, "Inteligência"),
	SAB(4, "Sabedoria"),
	CAR(5, "Carisma");
	
	Integer cod;
	String nome;
	
	private Atributo(Integer cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	static public Atributo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (Atributo x : Atributo.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código do plano não existe");
	}
	
	static public Atributo toEnum(String nome) {
		if(nome == null) {
			return null;
		}
		for (Atributo x : Atributo.values()) {
			if(nome.equals(x.getNome())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código do plano não existe");
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}


