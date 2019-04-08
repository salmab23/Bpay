package org.sid.entities;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Client_pro extends Client{
protected String Radical;

public String getRadical() {
	return Radical;
}

public void setRadical(String radical) {
	Radical = radical;
}

@OneToMany
@JoinColumn(name="id_chargement")
private List<Chargement> chargements = new ArrayList<>();

@OneToMany
@JoinColumn(name="id_niveau")
private List<Niveau> niveau = new ArrayList<>();


public Client_pro() {
	super();
	// TODO Auto-generated constructor stub
}

}
