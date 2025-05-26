package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    AddressBookData createEntry(AddressBookDTO dto);
    List<AddressBookData> getAllEntries();
    AddressBookData getEntryById(int id);
    AddressBookData updateEntry(int id, AddressBookDTO dto);
    void deleteEntry(int id);
}
