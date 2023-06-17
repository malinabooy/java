package Sem.hw5.models;

import Sem.hw5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     * @return
     */

        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    public boolean changeReservationTable(int oldReservation, Date newReservationDate, int newTableNo, String newName) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    reservation.setDate(newReservationDate);
                    table.setNo(newTableNo);
                    reservation.setName(newName);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cancelReservationTable(int reservationNo) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationNo) {
                    table.getReservations().remove(reservation);
                    return true;
                }
            }
        }
        return false;
    }

    public Table getReservationTable(int reservationNo) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationNo) {
                    return table;
                }
            }
        }
        return null;
    }

}
