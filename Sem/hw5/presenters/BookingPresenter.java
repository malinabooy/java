package Sem.hw5.presenters;

import Sem.hw5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResult(int reservationNo){
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        boolean isSuccess = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        if (isSuccess) {
            System.out.println("Бронирование успешно изменено.");
        } else {
            System.out.println("Не удалось изменить бронирование.");
        }
        showTables();
    }

    @Override
    public void onCancelReservationTable(int reservationNo) {
        boolean isSuccess = tableModel.cancelReservationTable(reservationNo);
        if (isSuccess) {
            System.out.println("Бронирование успешно отменено.");
        } else {
            System.out.println("Не удалось отменить бронирование.");
        }
        showTables();
    }

    @Override
    public void onSpecifyReservationTable(int reservationNo) {
        Table table = tableModel.getReservationTable(reservationNo);
        if (table != null) {
            System.out.println("Информация о бронировании:");
            System.out.println("Номер брони: " + reservationNo);
            System.out.println("Столик: " + table.getNo());
            System.out.println("Дата бронирования: " + table.getDate());
            System.out.println("Имя клиента: " + table.getName());
        } else {
            System.out.println("Бронь с номером #" + reservationNo + " не найдена.");
        }
    }
}
