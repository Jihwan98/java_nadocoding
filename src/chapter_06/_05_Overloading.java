package chapter_06;

public class _05_Overloading {
    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(String strNumber) {
        int num = Integer.parseInt(strNumber);
        return num * num;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나

        System.out.println(getPower(4));
        System.out.println(getPower("4"));
    }
}
