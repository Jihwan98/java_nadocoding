package chapter_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // "901231-1234567" : 901231-1 까지 출력
        String s = "901231-1234567";
        System.out.println(s.substring(0, s.indexOf('-') + 2));
    }
}
