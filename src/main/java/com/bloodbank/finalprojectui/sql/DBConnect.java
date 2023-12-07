package com.bloodbank.finalprojectui.sql;

import com.bloodbank.finalprojectui.BloodBankApplication;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DBConnect {
    Connection con;

    public DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://csdb.brockport.edu/fal23_cis422_msaad1",
                    "msaad1", "123");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet fetch(String sqlQuery) throws SQLException {
        PreparedStatement stat = con.prepareStatement(sqlQuery);
        return stat.executeQuery();
    }

    public void post(String sqlQuery) throws SQLException {
        PreparedStatement stat = con.prepareStatement(sqlQuery);
        stat.executeUpdate();
    }

    public int getTableLength(String tableName) throws SQLException {
        String countQuery = "SELECT COUNT(*) FROM " + tableName;
        ResultSet queryRes = BloodBankApplication.getDatabase().fetch(countQuery);
        int result = 0;
        while (queryRes.next()) {
            result = queryRes.getInt("COUNT(*)");
        }
        return result;
    }

    public String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
