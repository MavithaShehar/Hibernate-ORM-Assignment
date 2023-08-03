package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    private String authorId;
    private String name;
    private String country;
    private String contactNo;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Author(String authorId, String name, String country, String contactNo) {
        this.authorId = authorId;
        this.name = name;
        this.country = country;
        this.contactNo = contactNo;
    }

    public Author() {
    }


}
