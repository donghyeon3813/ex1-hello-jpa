package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Address address;

    public Long getId() {

        return id;
    }

    public Address getAddress() {

        return address;
    }

    public AddressEntity(Address address) {

        this.address = address;
    }

    public AddressEntity() {

    }
    public AddressEntity(String city, String street, String zipcode) {
        this.address = new Address(city,street,zipcode);
    }
}
