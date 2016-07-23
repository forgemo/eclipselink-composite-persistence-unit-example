package de.elbatya.multidb;


import javax.persistence.*;

/**
 * Created by elbatya on 23.07.16.
 */
@Entity
@Table(name = "Persons")
public class Person {

    private Long id;
    private String name;
    private ContactDetails contactDetails;

    public Person() {
    }

    public Person(Long id, String name, ContactDetails contactDetails) {
        this.id = id;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "email")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
