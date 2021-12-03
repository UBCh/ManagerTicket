package ru.netologi.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import ru.netologi.domain.Ticket;
import ru.netologi.repository.RepositoryTicket;


class ManagerRepositoryTicketTest {

    ManagerRepositoryTicket manager = new ManagerRepositoryTicket();
    public Ticket ticket1 = new Ticket(1, 5000, "DME", "EKB", 220);
    public Ticket ticket2 = new Ticket(2, 4000, "EKB", "SPB", 120);
    public Ticket ticket3 = new Ticket(3, 1500, "EKB", "SPB", 160);
    public Ticket ticket4 = new Ticket(4, 3000, "EKB", "SPB", 160);
    public Ticket ticket5 = new Ticket(5, 6500, "EKB", "SPB", 160);


    @BeforeEach
    public void shouldSetUp() {
        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
        manager.save(ticket4);
        manager.save(ticket5);
    }

    @Test
    void shouldSearcyBy() {
        Ticket[] expected = {ticket1};
        Ticket[] actual = manager.searcyBy("DME", "EKB");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearcyByToo() {
        Ticket[] expected = {ticket3, ticket4, ticket2, ticket5};
        Ticket[] actual = manager.searcyBy("EKB", "SPB");
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouidSearcyByNul() {
        Ticket[] expected = {};
        Ticket[] actual = manager.searcyBy("DME", "SPB");
        assertArrayEquals(expected, actual);
    }
}
