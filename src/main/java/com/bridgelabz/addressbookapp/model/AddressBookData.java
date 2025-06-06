package com.bridgelabz.addressbookapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookData {
    private int id;
    private String name;
    private String address;
    private String city;
    private String phoneNumber;
}
