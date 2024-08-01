package main;

import java.util.Scanner;
import member.MemberService;

public class Main {
    public void menu() {
        Scanner scan = new Scanner(System.in);
        MemberService service = new MemberService();
        int num;

        while (true) {
            System.out.println("\n**********************");
            System.out.println("                        ");
            System.out.println("      CINE RESERVE      ");
            System.out.println("                        ");
            System.out.println("\n**********************");
            System.out.println("    1. 회원가입");
            System.out.println("    2. 로그인");
            System.out.println("    3. 영화 목록 보기");
            System.out.println("    4. 상영 시간표 보기");
            System.out.println("    5. 좌석 예약하기");
            System.out.println("    6. 예약 확인/취소");
            System.out.println("    7. 종료");
            System.out.println("\n**********************");
            System.out.println("    번호 : ");
            num = scan.nextInt();

            if (num == 7) break;

            switch (num) {
                case 1: service.register(); break;
                case 2: service.login(); break;
//                case 3: service.showMovieList(); break;
//                case 4: service.showShowtimes(); break;
//                case 5: service.makeReservation(); break;
//                case 6: service.manageReservation(); break;

            }//while();
        }//menu();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
        System.out.println("프로그램을 종료합니다.");
    }
}
