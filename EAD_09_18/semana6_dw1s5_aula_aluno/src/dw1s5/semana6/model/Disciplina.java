package dw1s5.semana6.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)

public class Disciplina {

	@XmlElement(name="nome")
	private String nome;
	
	@XmlElement(name="sigla")
	private String sigla;
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
}
