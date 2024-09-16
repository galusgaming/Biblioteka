package models;

public class Books {
    private int id;
    private String title;
    private String author;
    private int year;
    private int categoryId;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Books() { }
    public Books(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString() {
        return "["+id+"] - "+title+" - "+author+" - "+year;
    }
}
