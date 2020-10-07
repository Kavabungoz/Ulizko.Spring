package dao;

import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketDaoImpl implements TicketDAO {
    protected List<Ticket> elements;

    public TicketDaoImpl(List<Ticket> elements) {
        this.elements = elements;
    }

    @Override
    public void save(Ticket ticket) {
        elements.add(ticket);
    }

    @Override
    public Ticket getById(Long id) {
        for (Ticket t : elements) {
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }

    @Override
    public void update(Ticket ticket) {
        elements.set(elements.indexOf(ticket),ticket);
    }

    @Override
    public void delete(Ticket ticket) {
        elements.remove(ticket);
    }
}
