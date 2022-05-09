package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws SQLException {
        List<EBook> eBookList = QueryEBook.SelectAll();

        EBook eBook1 = new EBook(1008,"ConnecJava","unknow",88.88f,88);

        for(EBook eBook:eBookList){
            System.out.println( eBook.toString());
        }

        QueryEBook.CreateNewEbook(eBook1);
        List<EBook> eBookList1 = QueryEBook.SelectAll();
        for(EBook eBook:eBookList1){
            System.out.println( eBook.toString());
        }

        QueryEBook.DeleteEbockByID(1008);

    }
}
