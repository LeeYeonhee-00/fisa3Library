package book.model.dto;
/*
 * User 고객
 * - userName 닉네임
 * - age 나이
 * - gender 성별
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
public class User {
	private String userName;
	private int age;
	private String gender;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("고객명 : ");
		builder.append(userName);
		builder.append("나이 : ");
		builder.append(age);
		builder.append("성별 : ");
		builder.append(gender);
		return builder.toString();
	}


}
