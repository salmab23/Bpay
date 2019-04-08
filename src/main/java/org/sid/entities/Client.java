package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Client implements Serializable {
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
protected String Numero; 
	protected String RS;
	protected String Rc;
	protected String Email;
	protected String Mdp;
	protected String Mom;
	protected String Prenom;
	protected boolean Etat;
	protected Niveau niveau;
	protected Collection <Facture> Factures_emis;
	public Client(String numero) {
		super();
		Numero = numero;
	}
	protected Collection <Facture> Factures_recus;
	protected Collection <Trasfert> transferts;
	protected String getNumero() {
	return Numero;
}
public void setNumero(String numero) {
	Numero = numero;
}
public String getRS() {
	return RS;
}
public void setRS(String rS) {
	RS = rS;
}
public String getRc() {
	return Rc;
}
public void setRc(String rc) {
	Rc = rc;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getMdp() {
	return Mdp;
}
public void setMdp(String mdp) {
	Mdp = mdp;
}
public String getMom() {
	return Mom;
}
public void setMom(String mom) {
	Mom = mom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public boolean isEtat() {
	return Etat;
}
public void setEtat(boolean etat) {
	Etat = etat;
}
public Niveau getNiveau() {
	return niveau;
}
public void setNiveau(Niveau niveau) {
	this.niveau = niveau;
}
public Collection<Facture> getFactures_emis() {
	return Factures_emis;
}
public void setFactures_emis(Collection<Facture> factures_emis) {
	Factures_emis = factures_emis;
}
public Collection<Facture> getFactures_recus() {
	return Factures_recus;
}
public void setFactures_recus(Collection<Facture> factures_recus) {
	Factures_recus = factures_recus;
}



}