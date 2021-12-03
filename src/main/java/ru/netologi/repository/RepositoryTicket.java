package ru.netologi.repository;

import ru.netologi.domain.Ticket;

import java.util.Arrays;


public class RepositoryTicket {
    public Ticket[] ticket = new Ticket[0];

    public void save(Ticket ticket) {
        int length = this.ticket.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(this.ticket, 0, tmp, 0, this.ticket.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        this.ticket = tmp;
    }

    public Ticket[] findAll(String departureIATA, String arrivalIATA) {
        int index = 0;
        Ticket[] tmp = new Ticket[ticket.length - 1];
        for (Ticket ticket : ticket) {
            if (ticket.getDepartureIATA() == departureIATA & ticket.getArrivalIATA() == arrivalIATA) {
                tmp[index] = ticket;
                index++;
            }
        }
        Ticket[] result = new Ticket[index];
        for (int i = 0; i < index; i++) if (tmp[i] != null) result[i] = tmp[i];
        ticket = result;
        return ticket;
    }


    public boolean findById(int id) {
        for (Ticket ticket : ticket) {
            if (ticket.getId() == id) {
                break;
            }

        }
        return false;
    }


    //public void removeById(id) {
    //int length = ticket.length - 1;
    //Ticket[] tmp = new Ticket[length];
    //int index = 0;
    //for (Ticket ticket : ticket) {
    //if (ticket.getId() != id) {
    //tmp[index] = ticket;
    // index++;
    // }
    //}
    //ticket = tmp;
    //}


}
