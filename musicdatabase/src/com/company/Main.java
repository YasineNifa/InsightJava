package com.company;

import com.company.model.Artist;
import com.company.model.Datasource;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestException {
    public static void main(java.lang.String[] args) {
        // Insert code to start the application here.
        int i = 3;
        int j = 0;
        try {
            System.out.println("résultat = " + (i / j));
        }catch (ArithmeticException e) {
        }
        catch (Exception e) {
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //List<Artist> artists = null;
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can not open datasource");
            return;
        }


//        List<Artist> artists = datasource.queryArtists(2);
//
//        if (artists == null){
//            System.out.println("No artists");
//            return;
//        }
//        for (Artist artist : artists){
//            System.out.println("ID = "+artist.getId() + " ,Name :"+artist.getName());
//        }
//        datasource.close();
        List<String> list_albums = datasource.queryAlbumsForArtist("Iron Maiden", 1);


        if (list_albums == null){
            System.out.println("No albums");
            return;
        }
        for (String s : list_albums){
            System.out.println(s);
        }
        datasource.close();

    }
}
