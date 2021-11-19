package ru.netologi.manager;
import ru.netologi.domain.Ticket;
import  ru.netologi.repository.RepositoryTicket;

import java.util.Arrays;


public class ManagerRepositoryTicket {

    public RepositoryTicket repository = new RepositoryTicket();

    public Ticket ticket= new Ticket();

    public ManagerRepositoryTicket() {
    }


    public ManagerRepositoryTicket(RepositoryTicket repository) {
        this.repository = repository;
    }

    public void save(Ticket ticket) {
        repository.save(ticket);
    }

    public Ticket[] findAll( String departureIATA,String arrivalIATA ) {
        return repository.findAll();
    }

    public Ticket[] searcyBy(String text) {
        Ticket[] result = new Ticket[0];
        Ticket[] tmp = new Ticket [result.length + 1];
        for (Ticket ticket: repository.findAll()) {
            tmp[tmp.length - 1] = ticket;
                result = tmp;
            Arrays.sort(result);
            } return result;
        }


    }

