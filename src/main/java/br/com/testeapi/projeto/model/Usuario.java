package br.com.testeapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "login", length = 50, nullable = false)
	private String login;
	
	@NotBlank (message = "Campo Nome é obrigatório.")
	@Column(name = "nome_completo", length = 200, nullable = false)
	@Size(min=3, message = "O nome deve possuir, no mínimo, 3 caracteres.")
	private String nome;

	@NotBlank (message = "Campo E-mail é obrigatório.")
	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@NotBlank (message = "Campo Senha é obrigatório.")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = false)
	private String senha;

	@NotBlank (message = "Campo Telefone é obrigatório.")
	@Column(name = "telefone", length = 15, nullable = true)
	private String telefone;


	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


}
