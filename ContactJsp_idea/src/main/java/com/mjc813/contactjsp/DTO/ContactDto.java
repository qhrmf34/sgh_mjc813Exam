package com.mjc813.contactjsp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto implements IContact {
    private Integer id;
    private String name;
    private String phoneNumber;
    private String zipNumber;
    private String email;




    @Override
    public String getContactFullInfo() {
        StringBuilder contact = new StringBuilder();
        contact.append("Id: ").append(id).append("\n");
        contact.append("Name: ").append(name).append("\n");
        contact.append("Phone: ").append(phoneNumber).append("\n");
        contact.append("ZipNum: ").append(zipNumber).append("\n");
        contact.append("Email: ").append(email).append("\n");
        return contact.toString();
    }
}
