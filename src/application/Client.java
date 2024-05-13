package application;


public class Client {
	private int idC;
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	public int getId() {
		return idC;
	}
	public void setId(int id) {
		this.idC = id;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Client(int id, String nom, String prenom, String tel, String adresse) {
		super();
		this.idC = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
	}
	

}
