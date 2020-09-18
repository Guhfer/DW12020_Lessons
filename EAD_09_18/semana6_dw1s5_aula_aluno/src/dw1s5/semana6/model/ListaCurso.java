package dw1s5.semana6.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cursos")

@XmlAccessorType(XmlAccessType.NONE)

public class ListaCurso {

	@XmlElement(name="curso")
	private List<Curso> cursos;
	
	public List<Curso> getCursos() {
		return cursos;
	}
}
