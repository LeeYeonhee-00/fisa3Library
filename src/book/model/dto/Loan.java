package book.model.dto;
/*
 * Loan 대출
 * - loanBook 도서 이름
 * - loanPerson 고객 이름
 * - loanCount 대출 횟수
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
public class Loan {
	private int loanCount;
	private String loanBook;
	private String loanPerson;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("대출 횟수 : ");
		builder.append(loanCount);
		builder.append("도서명 : ");
		builder.append(loanBook);
		builder.append("고객명 : ");
		builder.append(loanPerson);
		return builder.toString();
	}

}
