package chapter_06;

public class _Quiz_06 {
    // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오

    // 개인정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용

    // 이름 : 2번째 글자
    // 주민등록번호 : 9번째 글자
    // 전화번호 : 10번째 글자
    public static String getHiddenData(String s, int index){
        String result = s.substring(0, index);
        for (int i = 0; i < s.length() - index; i++) {
            result += "*";
        }
        return result;
    }
    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
