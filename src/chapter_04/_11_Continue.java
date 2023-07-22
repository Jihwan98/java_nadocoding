package chapter_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 17번 노쇼
        for (int i = 1; i <= 50; i++) {
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 넘어갑니다.");
                continue;
            }
            System.out.println(i + "번 손님, 치킨 나왔습니다.");
            sold++; // 판매 처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("--------------------");

        // While 문
        sold = 0;
        int index = 0;
        while (index < 50) {
            index++;
            if (index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 넘어갑니다.");
                continue;
            }
            System.out.println(index + "번 손님, 치킨 나왔습니다.");
            sold++; // 판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
