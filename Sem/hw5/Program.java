package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");
        System.out.println("--------------------");

        // Уточнение бронирования
        bookingPresenter.onSpecifyReservationTable(9001);
        System.out.println("--------------------");
        bookingPresenter.onSpecifyReservationTable(9002);
        System.out.println("--------------------");

        // Отмена бронирования
        bookingPresenter.onCancelReservationTable(9003);
        System.out.println("--------------------");

        // Изменение бронирования
        bookingView.changeReservationTable(9001, new Date(), 104, "Станислав");
    }

}
