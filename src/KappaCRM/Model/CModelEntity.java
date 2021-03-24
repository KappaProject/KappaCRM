package KappaCRM.Model;

import java.util.Date;

public class CModelEntity {

	private long id;
	private long fk_type;
	private String nom;
	private String prenom;
	private String civilite;
	private String adresse;
	private String numero;
	private Date date_anniversaire;
	private Date date_mort;
	
	
	public CModelEntity() {
		setId(0);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFk_type() {
		return fk_type;
	}
	public void setFk_type(long fk_type) {
		this.fk_type = fk_type;
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
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getDate_anniversaire() {
		return date_anniversaire;
	}
	public void setDate_anniversaire(Date date_anniversaire) {
		this.date_anniversaire = date_anniversaire;
	}
	public Date getDate_mort() {
		return date_mort;
	}
	public void setDate_mort(Date date_mort) {
		this.date_mort = date_mort;
	}

}
