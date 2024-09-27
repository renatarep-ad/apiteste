package br.com.testeapi.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.testeapi.projeto.model.Usuario;
import br.com.testeapi.projeto.repository.IUsuario;

@Service 
public class UsuarioService {

	private IUsuario repository;

	public UsuarioService(IUsuario repository) {
		super();
		this.repository = repository;
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = (List<Usuario>) repository.findAll();
		return lista;
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}


	public Usuario editarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}

}
