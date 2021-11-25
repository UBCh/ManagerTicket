package ru.netologi.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import ru.netologi.domain.Ticket;
import ru.netologi.repository.RepositoryTicket;


class ManagerRepositoryTicketTest {

    ManagerRepositoryTicket manager = new ManagerRepositoryTicket();
    public Ticket ticket1 = new Ticket(1,1000,"DME","EKB",220);
    public Ticket ticket2 = new Ticket(2,1500, "DME","SPB", 120);
    public Ticket ticket3 = new Ticket(3,3000,"DME","HTA",160);

    @BeforeEach
    public void shouldSetUp() {
        manager.save(ticket1);
        manager.save(ticket2);
        manager.save(ticket3);
    }

    @Test
    void findAll() {
        Object expected = ticket1;
        Ticket[] actual= manager.findAll("DME","EKB");
        assertEquals(expected, actual); }


    @Test
    void searcyBy() {
        Ticket[] expected = {ticket3,ticket2,ticket1};
        Ticket[] actual= manager.searcyBy("DME");
        assertArrayEquals(expected, actual); }
    }
