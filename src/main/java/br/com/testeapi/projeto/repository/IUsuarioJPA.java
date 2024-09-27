package br.com.testeapi.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import br.com.testeapi.projeto.model.Usuario;

@NoRepositoryBean
@Repository
public interface IUsuarioJPA extends CrudRepository <Usuario, Integer> {
}
