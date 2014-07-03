package modele;

import java.util.Set;

import javax.persistence.*;


@Entity
@SequenceGenerator(name="id",sequenceName="geek_seq")
public class ModeleGeek {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
    @Column(name="ID")
	private int id;
    
    @Column(name="NOM")
    private String nom;

    @Column(name="PRENOM")
    private String prenom;
    
    @Column(name="MAIL")
    private String mail;
    
    @Column(name="GRAVATAR")
    private String urlGravatar;
    
    @ManyToMany
    @JoinTable(name = "GEEK_INTERET",
               joinColumns = @JoinColumn(name = "IDGEEK"),
               inverseJoinColumns = @JoinColumn(name = "IDINTERET"))
    private Set<ModeleInteret> interets;

	public ModeleGeek(int id, String nom, String prenom, String mail,String urlGravatar) 
	{

		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.urlGravatar = urlGravatar;
	}
    
    
}
