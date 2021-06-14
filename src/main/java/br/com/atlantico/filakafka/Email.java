package br.com.atlantico.filakafka;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Email implements Serializable {

	private static final long serialVersionUID = 1643914936070238842L;

	private String conteudo;

	private String destinatario;

	public Email() {
		super();
	}

	public Email(String conteudo, String destinatario) {
		super();
		this.conteudo = conteudo;
		this.destinatario = destinatario;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public int hashCode() {
		var prime = 31;
		var result = 1;
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
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
		Email other = (Email) obj;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		return true;
	}

}
