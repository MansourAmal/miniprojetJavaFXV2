package application;

import java.util.Date;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private Date datePrisePermis;
	private Date dateNaissance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatePrisePermis() {
		return datePrisePermis;
	}
	public void setDatePrisePermis(Date datePrisePermis) {
		this.datePrisePermis = datePrisePermis;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", datePrisePermis=" + datePrisePermis
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	public Client(int id, String nom, String prenom, Date datePrisePermis, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datePrisePermis = datePrisePermis;
		this.dateNaissance = dateNaissance;
	}
	

}
