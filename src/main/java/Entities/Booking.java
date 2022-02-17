package Entities;

public class Booking {
    private int id_booking;
    private int idHotel_booking;
    private int idClient_booking;
    private String paiement_booking;
    private  String date_booking;

    public Booking() {
    }

    public Booking(int id_booking, int idHotel_booking, int idClient_booking, String paiement_booking, String date_booking) {
        this.id_booking = id_booking;
        this.idHotel_booking = idHotel_booking;
        this.idClient_booking = idClient_booking;
        this.paiement_booking = paiement_booking;
        this.date_booking = date_booking;
    }

    public Booking(int idHotel_booking, int idClient_booking, String paiement_booking, String date_booking) {
        this.idHotel_booking = idHotel_booking;
        this.idClient_booking = idClient_booking;
        this.paiement_booking = paiement_booking;
        this.date_booking = date_booking;
    }

    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public int getIdHotel_booking() {
        return idHotel_booking;
    }

    public void setIdHotel_booking(int idHotel_booking) {
        this.idHotel_booking = idHotel_booking;
    }

    public int getIdClient_booking() {
        return idClient_booking;
    }

    public void setIdClient_booking(int idClient_booking) {
        this.idClient_booking = idClient_booking;
    }

    public String getPaiement_booking() {
        return paiement_booking;
    }

    public void setPaiement_booking(String paiement_booking) {
        this.paiement_booking = paiement_booking;
    }

    public String getDate_booking() {
        return date_booking;
    }

    public void setDate_booking(String date_booking) {
        this.date_booking = date_booking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id_booking=" + id_booking +
                ", idHotel_booking=" + idHotel_booking +
                ", idClient_booking=" + idClient_booking +
                ", paiement_booking='" + paiement_booking + '\'' +
                ", date_booking='" + date_booking + '\'' +
                '}';
    }
}
