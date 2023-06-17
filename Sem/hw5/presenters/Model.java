package Sem.hw5.presenters;

import Sem.hw5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение списка всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);


    boolean changeReservationTable(int oldReservation, Date newReservationDate, int newTableNo, String newName);

    boolean cancelReservationTable(int reservationNo);

    Table getReservationTable(int reservationNo);


}
