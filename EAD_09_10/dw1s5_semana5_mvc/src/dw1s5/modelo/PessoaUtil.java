package dw1s5.modelo;

import java.util.ArrayList;
import java.util.List;

public class PessoaUtil {

	public List<Pessoa> getPessoas(String pessoas) {
		List<Pessoa> lista = new ArrayList<>();
		if(pessoas.length() > 0) {
			String linhas[] = pessoas.split("\n");
			for(int i = 0; i < linhas.length; i++) {
				System.out.println("entrou no for");
				String dados[] = linhas[i].split("\\s*;\\s*");
				if(dados.length == 3) {
					String nome = dados[0];
					String cpf = dados[1];
					String email = dados[2];
					Pessoa p = new Pessoa(nome, cpf, email);
					lista.add(p);
				}
			}
		}
		return lista;
	}
}
