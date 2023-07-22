package chapter_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // 대소문자 구별 : false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구별 x : true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (잠조 비교)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // false (참조 비교)
    }
}
