package book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Book 도서
 * - title 제목
 * - author 저자
 * - count 재고
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// @ToString
public class Book {
	private String title;
	private String author;
	private int count;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도서명 : ");
		builder.append(title);
		builder.append(", 도서 저자 : ");
		builder.append(author);
		builder.append(", 재고 : ");
		builder.append(count);
		return builder.toString();
	}
}
