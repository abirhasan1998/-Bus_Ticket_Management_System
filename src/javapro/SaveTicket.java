package javapro;

import java.sql.*;
import javax.swing.JOptionPane;

public class SaveTicket {

    Connection conn = null;
    String pn, ppn, jd, des, at, cn, bn, sn, fee;

    public void ticket(String pn, String ppn, String jd, String des, String at, String cn, String bn, String sn, String fee) throws SQLException {

        this.pn = pn;
        this.ppn = ppn;
        this.jd = jd;
        this.des = des;
        this.at = at;
        this.cn = cn;
        this.bn = bn;
        this.sn = sn;
        this.fee = fee;
        try {
            Connection conn = DBConnection.ConnectDb();
            String query = "INSERT INTO `ticket`(`person_name`, `person_phn`, `journey_date`, `destination`, `arrival_time`, `counter_name`, `bus_no`, `seat_no`, `fee`) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pt = conn.prepareStatement(query);
            pt.setString(1, pn);
            pt.setString(2, ppn);
            pt.setString(3, jd);
            pt.setString(4, des);
            pt.setString(5, at);
            pt.setString(6, cn);
            pt.setString(7, bn);
            pt.setString(8, sn);
            pt.setString(9, fee);
            pt.execute();
            JOptionPane.showMessageDialog(null, "Data Saved");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"Error!");
        }

    }
}
