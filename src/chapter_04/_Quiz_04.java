package chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
        final int FARE_PER_HOUR = 4000; // 시간당 4000원
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        // 일반 5시간 : 20000원
        // 경차 5시간 : 10000원
        // 장애인 10시간 : 15000원
        String type;
        int time;
        double fare;
        type = "장애인";
        time = 10;

        fare = time * FARE_PER_HOUR;
        fare = fare > 30000 ? 30000 : fare; // 일일 최대 요금
        fare = type != "일반 차량" ? fare / 2 : fare; // 할인

        System.out.println(type + " " + time + "시간 주차 시 " + (int) fare + " 원");


    }
}
