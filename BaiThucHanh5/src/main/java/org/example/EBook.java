package org.example;

public class EBook {
    private int id;
    private String title;
    private String author;
    private float price;
    private int qty;

    public EBook() {
    }

    public EBook(int id, String title, String author, float price, int qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return  "id=" + id +'\'' +
                "title= " + title + '\'' +
                "author= " + author + '\'' +
                "price= " + price +'\'' +
                "qty= " + qty ;
    }
}
