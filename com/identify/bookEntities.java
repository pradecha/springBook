package com.identify;
public class bookEntities {

    int boodId;
    String bookName;
    String bookDescriptions;
    
    public int getBoodId() {
        return boodId;
    }
    public void setBoodId(int boodId) {
        this.boodId = boodId; 
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookDescriptions() {
        return bookDescriptions;
    }
    public void setBookDescriptions(String bookDescriptions) {
        this.bookDescriptions = bookDescriptions;
    }
    public bookEntities(int boodId, String bookName, String bookDescriptions) {
        this.boodId = boodId;
        this.bookName = bookName;
        this.bookDescriptions = bookDescriptions;
    }
    @Override
    public String toString() {
        return "bookEntities [boodId=" + boodId + ", bookName=" + bookName + ", bookDescriptions=" + bookDescriptions
                + "]";
    }

    
    
}
