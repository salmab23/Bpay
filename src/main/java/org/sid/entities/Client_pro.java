package org.sid.entities;

import java.util.Collection;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Client_pro extends Client{
protected String Radical;

@OneToMany
@JoinColumn(name="Client_pro")
private Collection<Chargement> chargements;

//Test push
public String getRadical() {
	return Radical;
}

public void setRadical(String radical) {
	Radical = radical;
}




public Client_pro() {
	super();
	// TODO Auto-generated constructor stub
}

}
