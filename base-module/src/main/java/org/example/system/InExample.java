package org.example.system;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while (true) {
            if (keyCode != 13 && keyCode != 10) {   // Enter 키를 읽지 않았을 경우에만 실행
                if (keyCode == 49) {    // 1 입력
                    speed++;
                } else if (keyCode == 50) { // 2 입력
                    speed--;
                } else if (keyCode == 51) { // 3 입력
                    break;
                }

                System.out.println("------------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("------------------------");
                System.out.println("현재 속도=" + speed);
                System.out.print("선택: ");
            }

            // 키를 하나씩 읽음
            keyCode = System.in.read();
        }

        System.out.println("프로그램 종료");
    }
}
