package br.org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name= "tb_categorias")
public class Categoria {

	private static final String cascadeType = null;

	@Id // para identificar que é uma chave primária
	@GeneratedValue (strategy=GenerationType.IDENTITY) // mostrar que é auto encremente
	private long id;
	
	@NotBlank (message="Por favor digite algo, esse espaço não pode ficar em branco!")//igual not null, não permite espaço em branco
	private String categoria;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	private String descrição;
}
