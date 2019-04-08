package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Facture implements Serializable {
	@Id  @GeneratedValue
	private Long id_facture ;
	private String descr ;
	private Date datef ;
	private int montantf ;
	private String num_femetteur ;
	private String num_frecepteur ;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(String decr, Date datef, int montantf, String num_femetteur, String num_frecepteur) {
		super();
		this.descr = decr;
		this.datef = datef;
		this.montantf = montantf;
		this.num_femetteur = num_femetteur;
		this.num_frecepteur = num_frecepteur;
	}
	public Long getId_facture() {
		return id_facture;
	}
	public void setId_facture(Long id_facture) {
		this.id_facture = id_facture;
	}
	public String getDecr() {
		return descr;
	}
	public void setDecr(String decr) {
		this.descr = decr;
	}
	public Date getDatef() {
		return datef;
	}
	public void setDatef(Date datef) {
		this.datef = datef;
	}
	public int getMontantf() {
		return montantf;
	}
	public void setMontantf(int montantf) {
		this.montantf = montantf;
	}
	public String getNum_femetteur() {
		return num_femetteur;
	}
	public void setNum_femetteur(String num_femetteur) {
		this.num_femetteur = num_femetteur;
	}
	public String getNum_frecepteur() {
		return num_frecepteur;
	}
	public void setNum_frecepteur(String num_frecepteur) {
		this.num_frecepteur = num_frecepteur;
	}
	


}
