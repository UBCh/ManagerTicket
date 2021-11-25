package ru.netologi.repository;
import  ru.netologi.domain.Ticket;

public class RepositoryTicket {
    public Ticket [] ticket =new Ticket[0];

    public void save(Ticket ticket) {
        int length = this.ticket.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(ticket, 0, tmp, 0, this.ticket.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        this.ticket = tmp;
    }

    public Ticket[] findAll(String departureIATA, String arrivalIATA ) {
        final Ticket[] ticket = this.ticket;
        return ticket;
    }

    public boolean findById(int id) {
        for (Ticket ticket : ticket) {
            if (ticket.getId() == id) {break; return true;}
            return false;}
        }


    public void removeById(int id) {
       int length = ticket.length - 1;
        Ticket[] tmp = new Ticket[length];
        int index = 0;
        for (Ticket ticket : ticket) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        ticket = tmp;
    }



}
