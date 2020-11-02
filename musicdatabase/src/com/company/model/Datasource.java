package com.company.model;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    //C:\Users\yasin\IdeaProjects\musicdatabase
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\yasin\\IdeaProjects\\musicdatabase\\"+DB_NAME;
    public static final String TABLE_ALBUMS = "albums";
    public static final String Column_ALBUM_ID = "_id";
    public static final String Column_ALBUM_name = "name";
    public static final String Column_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String Column_ARTIST_ID = "_id";
    public static final String Column_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String Column_SONG_ID = "_id";
    public static final String Column_SONG_TITLE = "title";
    public static final String Column_SONG_ALBUM = "album";

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;



    private Connection conn;

    public boolean open(){
        try{
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }
        catch(SQLException e){
            System.out.println("Could not connect to the database "+ DB_NAME);
            e.printStackTrace();
            return false;
        }
    }
    public void close(){
        try{
            if (conn!=null){
                conn.close();
            }
        }
        catch (SQLException e){
            System.out.println("Could not close the connection "+e.getMessage());
            e.printStackTrace();
        }
    }
    public List<Artist> queryArtists(int sortedby){
        //Statement statement = null;
        //ResultSet res = null;
        // to close Statement and Resset implecitly after finishing with the try/catch claus
        StringBuffer sb = new StringBuffer("Select * from "+ TABLE_ARTISTS);
        if (sortedby != ORDER_BY_NONE){
            sb.append(" order by "+ Column_ARTIST_NAME+ " Collate nocase ");
            if (sortedby == ORDER_BY_DESC){
                sb.append("DESC");
            }
            else if (sortedby == ORDER_BY_ASC){
                sb.append("ASC");
            }
        }

        try(Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(sb.toString())){
            //statement = conn.createStatement();
            //res = statement.executeQuery("select * from "+TABLE_ARTISTS);
            List<Artist> artists = new ArrayList<>();
            while (res.next()){
                Artist ar = new Artist();
                ar.setId(res.getInt("_id")) ;
                ar.setName(res.getString("name"));
                artists.add(ar);
            }
            return artists;
        }
        catch (SQLException e){
            System.out.println("Query failed : " + e.getMessage());
            e.printStackTrace();
            return null;
        }
//        finally {
//            try{
//                if (res != null){
//                    res.close();
//                }
//            }
//            catch( SQLException e){
//                System.out.println("Can not close the resultset " + e.getMessage());
//            }
//
//
//            try{
//                if (statement != null) {
//                    statement.close();
//                }
//            }
//            catch (SQLException e){
//                System.out.println("Can not close the statement " + e.getMessage());
//                e.printStackTrace();
//            }
//        }
    }
    public List<String> queryAlbumsForArtist(String artistName, int sortedby){

        String query =" select "+ TABLE_ALBUMS+"."+Column_ALBUM_name + " AS name from "+ TABLE_ALBUMS+ " INNER JOIN "+TABLE_ARTISTS+" ON "+ TABLE_ARTISTS+"."+Column_ARTIST_ID+ " = "+ TABLE_ALBUMS+"."+Column_ALBUM_ARTIST+ " WHERE "+ TABLE_ARTISTS+"."+Column_ARTIST_NAME +" = \""+ artistName+ "\"";
        StringBuilder sd = new StringBuilder(query);
        if (sortedby != ORDER_BY_NONE){
            sd.append(" ORDER BY "+ Column_ALBUM_name+ " collate nocase");
            if (sortedby == ORDER_BY_ASC){
                sd.append(" ASC");
            }
            else if (sortedby == ORDER_BY_DESC){
                sd.append(" DESC");
            }
        }
        System.out.println(sd.toString());
        try(Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery(sd.toString())) {
            List<String> list_albums = new ArrayList<>();
            while(res.next()){
                list_albums.add(res.getString("name"));
            }
            return list_albums;

        }
        catch (SQLException e){
            System.out.println();
            return null;
        }

    }

}
