package org.sid.entities;

public class Client_pro extends Client{
protected String Radical;

public String getRadical() {
	return Radical;
}

public void setRadical(String radical) {
	Radical = radical;
}

@OnetoMany
@JoinColumn(name="id_chargement")
private List<Chargement> chargements = new ArrayList<>();

@OnetoMany
@JoinColumn(name="id_niveau")
private List<Niveau> niveau = new ArrayList<>();


public Client_pro() {
	super();
	// TODO Auto-generated constructor stub
}

}
