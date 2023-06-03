package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


class TicketManagerTest {

    @Test
    public void testPrice() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Ростов", "Москва", 12000, 15, 17);
        Ticket ticket2 = new Ticket("Уфа", "Ростов", 10000, 12, 15);
        Ticket ticket3 = new Ticket("Ростов", "Москва", 11000, 12, 16);
        Ticket ticket4 = new Ticket("Воронеж", "Ростов", 17000, 15, 18);
        Ticket ticket5 = new Ticket("Ростов", "Москва", 14000, 11, 16);
        Ticket ticket6 = new Ticket("Н.Новгород", "Ростов", 12000, 9, 13);
        Ticket ticket7 = new Ticket("Ростов", "Москва", 15000, 12, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket3, ticket1, ticket5, ticket7};
        Ticket[] actual = manager.search("Ростов", "Мосвка");

        Assertions.assertArrayEquals(expected, actual);
    }
        @Test
        public void testTime() {


            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("Ростов", "Москва", 12_000, 15, 17);
            Ticket ticket2 = new Ticket("Уфа", "Ростов", 10_000, 12, 15);
            Ticket ticket3 = new Ticket("Ростов", "Москва", 11_000, 12, 16);
            Ticket ticket4 = new Ticket("Воронеж", "Ростов", 17_000, 15, 18);
            Ticket ticket5 = new Ticket("Ростов", "Москва", 14_000, 11, 16);
            Ticket ticket6 = new Ticket("Н.Новгород", "Ростов", 12_000, 9, 13);
            Ticket ticket7 = new Ticket("Ростов", "Москва", 15_000, 12, 15);

            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] expected = {ticket1, ticket7, ticket3, ticket5};
            Ticket[] actual = manager.search("Ростов", "Мосвка", comparator);

            Assertions.assertArrayEquals(expected, actual);
        }
    }
