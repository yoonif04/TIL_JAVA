import java.util.*;
public class FlowEx11 {

	public static void main(String[] args) {
		System.out.print("주민번호를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("2000년 이전 출생 남자");
				break;
			case '3':
				System.out.println("2000년 이후 출생 남자");
				
			}
			break;
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("2000년 이전 출생 여자");
				break;
			case '4':
				System.out.println("2000년 이후 출생 여자");
				break;
			}
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호");
				
		}
		

	}

}
