
import java.util.Date;

public class AUTEUR {
	private String num;
	private String nom;
	private String prenom;
	private String datenaissance;
	private String description;
	
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
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public AUTEUR(String num, String nom, String prenom, String datenaissance, String description) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.description = description;
	}
	public AUTEUR(String num, String nom, String prenom, String datenaissance) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}
	public void AFFICHERAUTEUR() {
		System.out.println("Nom de l'auteur : "+nom);
		System.out.println("Prenom de l'auteur : "+prenom);
		System.out.println("Date de naissance de l'auteur : "+datenaissance);
		System.out.println("Description de l'auteur : "+description);
	}
	
}