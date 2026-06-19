/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class IssueRecord {

    private int issueId;
    private int userId;
    private int bookId;
    private int days;

    public IssueRecord(int issueId,
                       int userId,
                       int bookId,
                       int days) {

        this.issueId = issueId;
        this.userId = userId;
        this.bookId = bookId;
        this.days = days;
    }

    public int getIssueId() {
        return issueId;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getDays() {
        return days;
    }
}
