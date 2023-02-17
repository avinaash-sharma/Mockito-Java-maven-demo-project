package com.sessions;

import java.time.LocalDate;

public class RentedBook {



    private com.sessions.Book book;
    private LocalDate rentedDate;

    public RentedBook(com.sessions.Book book) {

        this.book = book;
        this.rentedDate = LocalDate.now();
    }

    public LocalDate getRentedDate() {
        return this.rentedDate;
    }

    public com.sessions.Book getBook() {
        return book;
    }
}
