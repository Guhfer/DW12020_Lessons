package dw1s5.semana6.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.NONE)

public class Curso {

	@XmlElement(name="codigo")
	private int codigo;
	
	@XmlElement(name="nome")
	private String nome;
	
	@XmlElement(name="inicio")
	private int inicio;
	
	@XmlElementWrapper(name="disciplinas")
	@XmlElement(name="disciplina")
	private List<Disciplina> disciplinas;
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getInicio() {
		return inicio;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
}
