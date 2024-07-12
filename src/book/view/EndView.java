package book.view;

import java.util.ArrayList;

import book.model.dto.Book;

public class EndView {
	
	// 모든 책 리스트 출력
	public static void bookListView(ArrayList<Book> bookList) {
		
		int index = 1;
		for(Book b : bookList) {
			if(b != null) {
				System.out.println(b.toString());
			}
		}
	}
	
	// 책 정보 출력
	public static void bookView(Book book) {
		System.out.println(book.toString());
	}
	
	public static void successMessage(String message) {
		System.out.println(message);
	}

}
