# Fisa3 mini project

## 도서 대출 서비스
## 이정욱, 이정민, 이유나, 이연희

### book.controller
BookLoanController
- getBookAllList 모든 책 검색 호출 -> 이정욱
- getBookTitle 책 이름으로 검색 호출 -> 이정민 (공통)
- getUserHistory 고객 내역 검색 (사용자 이름으로 도서 대출 내역 조회) -> 이유나
- updateBookLoan 대출 연장 -> 이연희
- insertBookLoan 책 대출 -> 공통
- insertBook 책 데이터 추가 -> 공통
- deleteBookLoan 책 반납

### book.model.dto
Book 도서
- title 제목
- author 저자
- count 재고

Loan 대출
- loanCount 대출 횟수
- loanBook 도서 이름
- loanPerson 고객 이름

User 고객
- userName 닉네임
- age 나이
- gender 성별

### book.service
BookLoanService
- getBookAllList 모든 책 검색 
- getBookTitle 책 제목으로 검색 
- getUserHistory 고객 내역 검색
- updateBookLoan 대출 연장
- insertBookLoan 책 대출
- deleteBookLoan 책 반납
- insertBook 책 데이터 추가
