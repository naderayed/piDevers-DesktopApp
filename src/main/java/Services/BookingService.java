package Services;

import Entities.Booking;
import Tools.MaConnexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.List;
import java.util.Queue;

public class BookingService implements IService<Booking>{
    Connection cnx = MaConnexion.getInstance().getCnx();
    @Override
    public void ajouter(Booking booking) {
        String query="INSERT INTO BOOKING(idHotel_booking,idClient_booking" +
                ",paiement_booking,date_booking) VALUES(?,?,?,?)";
        try {
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setInt(1,booking.getIdHotel_booking());
            ste.setInt(2,booking.getIdClient_booking());
            ste.setString(3,booking.getPaiement_booking());
            ste.setString(4,booking.getDate_booking());
            ste.executeUpdate();
            System.out.println("Booking Added Successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public ObservableList<Booking> afficher() {
        ObservableList<Booking> listBooking = FXCollections.observableArrayList();
        String query = "SELECT * FROM BOOKING";
        try {
            Statement ste =cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()){
                Booking booking = new Booking();
                booking.setId_booking(rs.getInt("id_booking"));
                booking.setIdHotel_booking(rs.getInt("idHotel_booking"));
                booking.setIdClient_booking(rs.getInt("idClient_booking"));
                booking.setPaiement_booking(rs.getString("paiement_booking"));
                booking.setDate_booking(rs.getString("date_booking"));
                listBooking.add(booking);

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return listBooking;
    }

    @Override
    public void modifier(Booking booking) {
        String query ="UPDATE BOOKING SET idHotel_booking = "+ booking.getIdHotel_booking() + ", idClient_booking= "
                +booking.getIdHotel_booking()+", paiement_booking= '" + booking.getPaiement_booking()+"',date_booking=" +
                " '"+booking.getDate_booking()+"' WHERE id_booking = "+booking.getId_booking();
        try {
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Booking Modified Successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void supprimer(Booking booking) {
        String query ="DELETE FROM BOOKING WHERE id_booking = " + booking.getId_booking() + "";
        try {
            Statement ste =cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Booking Deleted Successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
