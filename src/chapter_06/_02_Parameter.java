package chapter_06;

public class _02_Parameter {
    public static int power(int number){
        return number * number;
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        System.out.println(power(2));
    }
}
