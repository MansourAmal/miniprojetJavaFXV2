package application;

import java.util.Date;

public class Resa {
	private int id;
	private int idC;
	private int idV;
	private Date date_debut;
	private Date date_fin;
	private Double total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public int getIdV() {
		return idV;
	}
	public void setIdV(int idV) {
		this.idV = idV;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Resa(int id, int idC, int idV, Date date_debut, Date date_fin, Double total) {
		super();
		this.id = id;
		this.idC = idC;
		this.idV = idV;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.total = total;
	}
	
	
}
