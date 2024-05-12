package application;

import java.util.Date;

public class Resa {
	private int id;
	private Date dateDebut;
	private Date dateFin;
	private Double tarif;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}
	public Resa(int id, Date dateDebut, Date dateFin, Double tarif) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tarif = tarif;
	}
	@Override
	public String toString() {
		return "Resa [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", tarif=" + tarif + "]";
	}
	
	
}
