package object_class;
// 은행계좌 클래스 (신한은행)			//멤버변수 접근제한자 적용 getter ,setter 생성
public class Account {
	// 멤버변수(필드)
	static final String BANKNAME = "신한은행"; // 정적 맴버 변수 -> 객체자체(원본 클래스)로 접근
	String accountNo;	// 계좌번호			인스턴스 맴버 변수 -> new 생성해서 인스턴스객체이름으로 접근
	String ownerName;	// 예금주이름			인스턴스 맴버 변수
	int balance;		// 잔액				인스턴스 맴버 변수
	
	// 기본생성자
	public Account() {

	}
	
	// 생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	
	// 예금 메소드
	void deposit(int amount) {
		balance += amount;
	}
	
	// 인출 메소드
	int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
}
