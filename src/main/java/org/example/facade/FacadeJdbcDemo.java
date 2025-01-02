package org.example.facade;

import java.util.List;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("Table created");

        jdbcFacade.insertIntoTable();
        System.out.println("Data inserted");

        List<Address> addresses = jdbcFacade.getAddresses();
        for (Address address : addresses) {
            System.out.println(address.id() + " " + address.streetName() + " " + address.city());
        }
    }
}
