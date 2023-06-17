package Sem.hw5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Table {

    private static int counter = 100;

    private final Collection<Reservation> reservations = new ArrayList<>();
    private final int no;
    private Date date;
    private String name;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }

    public int setNo(int newTableNo) {
        return getNo();
    }
}
