package br.com.queiroz.processadorxml.models;

import java.io.Serializable;
import java.util.Objects;

public class Arquivo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String nomeFisicoArquivo;
	
	public Arquivo() {}

	public Arquivo(Long id, String nomeFisicoArquivo) {
		this.id = id;
		this.nomeFisicoArquivo = nomeFisicoArquivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFisicoArquivo() {
		return nomeFisicoArquivo;
	}

	public void setNomeFisicoArquivo(String nomeFisicoArquivo) {
		this.nomeFisicoArquivo = nomeFisicoArquivo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquivo other = (Arquivo) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
