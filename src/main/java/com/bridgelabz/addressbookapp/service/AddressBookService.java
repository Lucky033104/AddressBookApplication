package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

    private final List<AddressBookData> addressBookList = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public AddressBookData createEntry(AddressBookDTO dto) {
        AddressBookData data = new AddressBookData(idCounter++, dto.getName(), dto.getAddress(), dto.getCity(), dto.getPhoneNumber());
        addressBookList.add(data);
        return data;
    }

    @Override
    public List<AddressBookData> getAllEntries() {
        return addressBookList;
    }

    @Override
    public AddressBookData getEntryById(int id) {
        return addressBookList.stream()
                .filter(entry -> entry.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Entry not found"));
    }

    @Override
    public AddressBookData updateEntry(int id, AddressBookDTO dto) {
        AddressBookData data = getEntryById(id);
        data.setName(dto.getName());
        data.setAddress(dto.getAddress());
        data.setCity(dto.getCity());
        data.setPhoneNumber(dto.getPhoneNumber());
        return data;
    }

    @Override
    public void deleteEntry(int id) {
        AddressBookData data = getEntryById(id);
        addressBookList.remove(data);
    }
}
