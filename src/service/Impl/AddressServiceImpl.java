package service.Impl;

import model.Address;
import service.AddressService;

import java.util.Scanner;

public class AddressServiceImpl implements AddressService {

    @Override
    public void input(Address address) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        address.setId(id);
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        address.setStreet(street);
        System.out.print("Enter city:");
        String cty = scanner.nextLine();
        address.setCity(cty);
    }

    @Override
    public void into(Address address) {
        System.out.print(" Id: "+address.getId());
        System.out.print(" Street: "+address.getStreet());
        System.out.print(" City: "+address.getCity());
    }
}
