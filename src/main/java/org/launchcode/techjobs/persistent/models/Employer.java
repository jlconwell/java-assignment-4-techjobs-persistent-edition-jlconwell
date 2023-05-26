package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Size(min=3, message="Location field requires a minimum of three characters.")
    @NotBlank
    private String location;

    public Employer () {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
