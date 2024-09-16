package models;

import java.util.LinkedList;
import java.util.List;

public class Loans {
    private int id;
    private String book;
    private int bookId;
    private int userId;
    private String user;
    private String loanDate;
    private String returnDate;
    public int getId() {
        return id;
    }
    public String getbook() {
        return book;
    }
    public int getUserId() {
        return userId;
    }
    public String getLoanDate() {
        return loanDate;
    }
    public String getReturnDate() {
        return returnDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public Loans() { }
    public Loans(int id, int bookid, int userId, String loanDate, String returnDate) {
        Biblioteka b = new Biblioteka();
        List<Books> books = b.selectBooks();
        List<Users> users = b.selectUsers();
        if (bookid < 0 || bookid >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid bookid: " + bookid);
        }
        if (userId < 0 || userId >= users.size()) {
            throw new IndexOutOfBoundsException("Invalid userId: " + userId);
        }

        this.id = id;
        this.bookId = bookid;
        this.book = books.get(bookid).getTitle();
        this.userId = userId;
        this.user = users.get(userId).getFirstName() + " " + users.get(userId).getLastName();
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    @Override
    public String toString() {
        return "["+id+"] - "+book+" - "+user+" - "+loanDate+" - "+returnDate;
    }
}
