package chapter_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 키 : 115cm, 121cm
        int height = 121;
        String result = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + result + "합니다.");
    }
}
