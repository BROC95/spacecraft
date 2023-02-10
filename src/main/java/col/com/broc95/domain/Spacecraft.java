package col.com.broc95.domain;
import javax.persistence.*;

@Entity
@Table(name = "Nav")
public  class Spacecraft {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_spacecraft")
    public Long id;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "typeS")
    private String typeS;
 
    private String fuel;
    // private double potencia;
   
    public Spacecraft() {
        
    }
    public Spacecraft(String name, String typeS, String fuel) {
        this.name = name;
        this.fuel = fuel;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeS() {
        return typeS;
    }
    public void setTypeS(String typeS) {
        this.typeS = typeS;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


}
