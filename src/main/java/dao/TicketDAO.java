package dao;

import model.Ticket;

/*
    CRUD для билетов
*/

public interface TicketDAO {

    void save(Ticket ticket);

    Ticket getById(Long id);

    void update(Ticket ticket);

    void delete(Ticket ticket);

}
