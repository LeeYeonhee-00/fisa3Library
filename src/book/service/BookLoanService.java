package book.service;

import java.util.ArrayList;

import book.model.dto.Book;
import book.model.dto.Loan;

public class BookLoanService {
	
	private static BookLoanService instance = new BookLoanService();
	private BookLoanService() {}
	public static BookLoanService getInstance() {
		return instance;
	}
	
	// 진행 중인 Loan 저장
	private ArrayList<Loan> loanList = new ArrayList<Loan>();

	// 보유하고 있는 Book 저장
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	/*
	 * getBookTitle 책 제목으로 검색
	 * parameter - String bookTitle
	 * return - Book
	 */
	public Book getBookTitle(String bookTitle) {
		for (Book book : bookList) {
			if (book != null && book.getTitle().equals(bookTitle)) {
				return book;
			}
		}
		return null;
	}
	
	/*
	 * insertBookLoan 책 대출
	 * parameter - Loan loan
	 * return - void
	 */
	public void insertBookLoan(Loan loan) throws Exception {
		
		// 대출 내역 확인 생략~
		loanList.add(loan);
	}
	
	/*
	 * insertBook 책 데이터 추가
	 * parameter - String bookTitle, String userName
	 * return - void
	 */
	public void insertBook(Book book) throws Exception {
		
		// 책 존재 여부 확인 생략~
		bookList.add(book);
	}
	
	/*
	 * getBookAllList 모든 책 검색 
	 * parameter - void
	 * return - ArrayList<Book>
	 */
	public ArrayList<Book> getBookAllList() {
		return bookList;
	}
	
	/*
	 * getUserHistory 고객 내역 검색
	 * parameter - String loanPerson
	 * return - ArrayList<Loan>
	 */
	public ArrayList<Loan> getUserHistory(String loanPerson) {
		
		ArrayList<Loan> loans = new ArrayList<Loan> ();
		
		for (Loan loan : loanList) {
			if (loan != null && loan.getLoanPerson().equals(loanPerson)) {
				loans.add(loan);
			}
		}
		return loans;
	}
	
	/*
	 * updateBookLoan 대출 연장
	 * parameter - Loan loan
	 * return - void
	 */
	public void updateBookLoan(int index, Loan loan) throws Exception {
		int count = loan.getLoanCount();
		loan.setLoanCount(count++); 
		loanList.set(index, loan);
	}

	/*
	 * deleteBookLoan 책 반납
	 * parameter - Loan loan
	 * return - void
	 */
	public boolean deleteBookLoan(Loan loan) {
		
		for (Loan l : loanList) {
			if (l != null && l.getLoanBook().equals(loan.getLoanBook())) {
				loanList.remove(loan);				
				return true;
			}
		}
		return false;
		
	}
	
}
