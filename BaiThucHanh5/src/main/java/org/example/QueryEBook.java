package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryEBook {
    public static List<EBook> SelectAll() throws SQLException {
        List<EBook> eBookList = new ArrayList<>();
        Connection connection = JDBC.Connection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
        while (resultSet.next()){
            EBook eBook = new EBook(resultSet.getInt("id")
                                    ,resultSet.getString("title")
                                    ,resultSet.getString("author")
                                    ,resultSet.getFloat("price")
                                    ,resultSet.getInt("qty"));
            eBookList.add(eBook);
        }
        connection.close();
        return eBookList;
    }

    public static void CreateNewEbook(EBook eBook) throws SQLException {
        Connection connection = JDBC.Connection();
        String query = "insert into books values (?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,eBook.getId());
        preparedStatement.setString(2,eBook.getTitle());
        preparedStatement.setString(3,eBook.getAuthor());
        preparedStatement.setFloat(4,eBook.getPrice());
        preparedStatement.setInt(5,eBook.getQty());

        int effectedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("Add new Ebook successfully !");
        connection.close();
    }

    public static void DeleteEbockByID(int id) throws SQLException {
        Connection connection = JDBC.Connection();
        String query = "DELETE FROM books where `id` = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        int effectedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("successfully delete ebooks with id = "+id);
        connection.close();
    }



}
