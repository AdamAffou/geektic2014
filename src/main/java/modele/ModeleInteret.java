package modele;

import java.util.Set;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="id",sequenceName="geek_seq")
public class ModeleInteret {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
    @Column(name="ID")
	private int id;

	@Column(name="NOM")
	private String nom;
	
	@Column(name="DESCRIPTION")
	private String description;

	@ManyToMany(mappedBy = "interets")
    private Set<ModeleGeek> Geeks;
	
	  
	public ModeleInteret(int id, String nom, String description) 
	{
			this.id = id;
			this.nom = nom;
			this.description = description;
	}
}
