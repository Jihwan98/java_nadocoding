package chapter_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 1; // 1등
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2, 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        // 중고 상품의 등급에 따른 가격 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + " 등급 제품의 가격 : " + price + "원");
        // 1 등급 : 10000원
        // 2 등급 : 9000원
    }
}
