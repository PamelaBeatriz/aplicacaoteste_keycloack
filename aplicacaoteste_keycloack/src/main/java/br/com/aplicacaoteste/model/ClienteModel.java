package br.com.aplicacaoteste.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="aplicacao_teste.cliente")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_cliente;

	@Column(name="nome")
	String nome;

	@Column(name="cpf_cnpj")
	String cpf_cnpj;

	@Column(name="rg")
	String rg;

	@Column(name="endereco")
	String endereco;

	@Column(name="bairro")
	String bairro;

	@Column(name="cidade")
	String cidade;

	@Column(name="estado")
	String estado;

	@Column(name="email")
	String email;
	
	@Column(name="telefone")
	String telefone;
	
	@Column(name="data_cadastro")
	@Temporal(TemporalType.TIMESTAMP)
	Date data_cadastro;

	public int getId_cliente() {
		return id_cliente; 
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}