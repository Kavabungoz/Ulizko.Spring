package model;

import java.util.List;

/*
    Продавец в билетном киоске
*/

public class Stallholder {
    private String name;
    private List<Ticket> listOfTickets;

    public Stallholder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(List<Ticket> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }

    @Override
    public String toString() {
        return "Stallholder{" +
                "name='" + name + '\'' +
                ", listOfTickets=" + listOfTickets +
                '}';
    }
}
