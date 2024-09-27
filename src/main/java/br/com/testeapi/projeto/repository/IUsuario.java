package br.com.testeapi.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.testeapi.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
