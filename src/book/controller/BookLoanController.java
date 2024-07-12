package book.controller;

import java.util.ArrayList;

import book.model.dto.Book;
import book.model.dto.Loan;
import book.service.BookLoanService;
import book.view.EndView;
import book.view.FailView;

public class BookLoanController {
	
	private static BookLoanController instance = new BookLoanController();
	
	private BookLoanController() {}
	
	public static BookLoanController getInstance() {
		return instance;
	}
	
	private static BookLoanService service = BookLoanService.getInstance();
	
	// insertBookLoan 책 대출
	public void insertBookLoan(Loan loan) {
		String bookTitle = loan.getLoanBook();
		Book book = service.getBookTitle(bookTitle); 
		
		// 책 재고 있으면 대출 가능
		if (book != null && book.getCount()>0) {
			try {
				service.insertBookLoan(loan);
				EndView.successMessage("대출에 성공했습니다");
			}
			catch (Exception e) {
				FailView.failViewMessage(e.getMessage()); //실패인 경우 예외로 end user 서비스
				e.printStackTrace();
			}
		} else {
			FailView.failViewMessage("재고가 없습니다");
		}
		
	}
	
	// insertBook 책 데이터 추가
	public void insertBook(Book book) {
		String bookName = book.getTitle();
		
		if (book != null && bookName.length() != 0) {
			try {
				service.insertBook(book);
				EndView.successMessage("책 정보 등록 성공했습니다.");
			}
			catch (Exception e) {
				FailView.failViewMessage(e.getMessage()); //실패인 경우 예외로 end user 서비스
				e.printStackTrace();
			}
		} else {
			FailView.failViewMessage("다시 입력해주세요.");
		}
		
	}
	
	// getBookAllList 모든 책 검색 호출
	public void getBookAllList() {
		EndView.bookListView(service.getBookAllList());
	}
	
	// getBookTitle 책 이름으로 검색 호출
	public void getBookTitle(String bookTitle) {
		
		Book b = service.getBookTitle(bookTitle);
		if (b != null) {
			EndView.bookView(b);
			
		} else {
			FailView.failViewMessage("해당하는 책이 없습니다.");
		}
	}
	
	// updateBookLoan 대출 연장
	public void updateBookLoan(int index, Loan loan) {
		int loanCount = loan.getLoanCount();
		
		// 1번만 연장 가능
		if (loan != null && loanCount < 1) {
			try {
				service.updateBookLoan(index, loan);
				EndView.successMessage("연장에 성공했습니다");
			}
			catch (Exception e) {
				FailView.failViewMessage(e.getMessage()); //실패인 경우 예외로 end user 서비스
				e.printStackTrace();
			}
		} else {
			FailView.failViewMessage("더이상 연장이 불가능 합니다");
		}
	}

}
