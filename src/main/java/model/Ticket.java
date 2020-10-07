package model;

import java.util.List;

/*
    Билет
*/

public class Ticket {
    private String dateOfSale;
    private Long id;
    private List<Rollercoaster> listOfAttractions; /* в списке пока только 1 аттракцион */

    public Ticket() {
    }

    public List<Rollercoaster> getListOfAttractions() {
        return listOfAttractions;
    }

    public void setListOfAttractions(List<Rollercoaster> listOfAttractions) {
        this.listOfAttractions = listOfAttractions;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "dateOfSale=" + dateOfSale +
                ", id=" + id +
                ", listOfAttractions=" + listOfAttractions +
                '}';
    }
}
