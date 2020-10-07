package service;

import dao.TicketDaoImpl;
import model.Ticket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceTicketImpl implements ServiceTicket {
    private static final Logger log = LogManager.getLogger(ServiceTicketImpl.class.getName());
    private TicketDaoImpl ticketDaoImpl;

    public ServiceTicketImpl(TicketDaoImpl ticketDaoImpl) {
        this.ticketDaoImpl = ticketDaoImpl;
    }

    @Override
    public void addTicket(Ticket ticket) {
        log.info("Билет продан и занесён в систему учёта!");
        ticketDaoImpl.save(ticket);
    }

    @Override
    public void getTicket(Ticket ticket) {
        log.info("Вы запросили показать историю продажи билета " + ticket.getId());
        ticketDaoImpl.getById(ticket.getId());
    }

    @Override
    public void updateTicket(Ticket ticket) {
        log.info("Редактирование билета в системе учёта!");
        ticketDaoImpl.update(ticket);
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        log.info("Билет был удалён из системы учёта!");
        ticketDaoImpl.delete(ticket);
    }
}
