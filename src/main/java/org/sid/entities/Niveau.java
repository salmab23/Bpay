package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Niveau implements Serializable{
	@Id  @GeneratedValue
	private Long id_niveau;
	
	
	@OneToMany(mappedBy="niveau")
	private Collection <Client> Clients;
	@OneToMany(mappedBy="N") 
	private Collection <Service> service;
	
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(Long id_niveau) {
		this.id_niveau = id_niveau;
	}
	
	
}
