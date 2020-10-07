package service;

import model.Ticket;

public interface ServiceTicket {

    public void addTicket(Ticket ticket);
    public void getTicket(Ticket ticket);
    public void updateTicket(Ticket ticket);
    public void deleteTicket(Ticket ticket);
}
