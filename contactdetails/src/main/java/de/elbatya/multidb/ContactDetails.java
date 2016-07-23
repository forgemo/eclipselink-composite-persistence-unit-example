package de.elbatya.multidb;

import javax.persistence.*;

/**
 * Created by elbatya on 23.07.16.
 */
@Entity
@Table(name = "ContactDetails")
public class ContactDetails {

    private Long id;
    private String email;
    private String phone;

    public ContactDetails() {
    }

    public ContactDetails(Long id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
