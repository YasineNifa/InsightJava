package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\databases\\"+DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try{
            Connection connect = DriverManager.getConnection(CONNECTION_STRING);

            Statement statement = connect.createStatement();
            //connect.setAutoCommit(false); by default it is true
            //insertContact(statement, "Yassine", 0645463737, "jqdcbkjd@hgavdjha.com");

            statement.execute("Drop table if exists " + TABLE_CONTACTS);
            statement.execute("Create table if not exists " + TABLE_CONTACTS +" ("+ COLUMN_NAME+ " Text, "+ COLUMN_PHONE+ " integer,"+COLUMN_EMAIL+ " text)");
            statement.execute("Insert into "+TABLE_CONTACTS+ " values ('Yassine',0656666675,'yasine.nifa@gmail.com')");
            statement.execute("Insert into "+TABLE_CONTACTS+ " values ('Amine',0656663475,'amine.nifa@gmail.com')");
            statement.execute("Insert into "+TABLE_CONTACTS+ " values ('Kamilia',0123666675,'kamilia.nifa@gmail.com')");
            statement.execute("Insert into "+TABLE_CONTACTS+ " values ('Lamnouar',0456666675,'lam.nifa@gmail.com')");
            statement.execute("Update "+TABLE_CONTACTS+ " set "+COLUMN_PHONE+ " = 098765456 where "+COLUMN_NAME+ " = 'Yassine'");
            //statement.execute("delete from "+TABLE_CONTACTS+ " where "+COLUMN_NAME+ " = 'Yassine'");
            // we can replace these two lines
            // /
            //statement.execute("select * from "+TABLE_CONTACTS);
            //ResultSet res = statement.getResultSet();

            ResultSet res = statement.executeQuery("Select * from "+TABLE_CONTACTS);
            while(res.next()){
                System.out.println( res.getString(COLUMN_NAME)+ " "+
                                    res.getString(COLUMN_PHONE)+ " "+
                                    res.getString(COLUMN_EMAIL)
                );
            }
            res.close();


            statement.close();
            connect.close();
        }
        catch(SQLException e){
            System.out.println("Something went wrong "+ e.getMessage());
            e.printStackTrace();
        }
    }
    // Good practice :
    private static void insertContact(Statement statement, String name, int phone, String email) {

        try{
            statement.execute("Insert into "+ TABLE_CONTACTS +
                    " values (+"+name +","+phone+","+email+")");
        }
        catch (SQLException e){
            System.out.println("Something went wrong "+ e.getMessage());
            e.printStackTrace();
        }


    }
}
