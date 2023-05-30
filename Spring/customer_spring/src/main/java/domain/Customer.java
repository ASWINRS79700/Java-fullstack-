package domain;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
    @Id
     @GeneratedValue
     @Column(name="id")
    int id;

    @Column(name="name")
    String name;
    @Embedded
    @AttributeOverrides({
            @AssociationOverride(name="street", column=@Column(name = "street_home")),
            @AssociationOverride(name="district", column=@Column(name = "district_home")),
            @AssociationOverride(name="streetNumber", column=@Column(name = "district_home"))
    })
    Address homeAddress;

    Customer(){}

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
