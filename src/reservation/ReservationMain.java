package reservation;

import jdbc.JdbcDAO;

import java.util.Scanner;

public class ReservationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JdbcDAO jdbcDAO = JdbcDAO.getInstance();

        System.out.print("영화 ID를 입력하세요: ");
        int movieId = scanner.nextInt();

        System.out.print("극장 ID를 입력하세요: ");
        int theaterId = scanner.nextInt();

        System.out.print("상영 시간을 입력하세요 (HH24:MI 형식): ");
        String timeString = scanner.next();

        int showtimeId = jdbcDAO.getShowtimeId(movieId, theaterId, timeString);

        if (showtimeId != -1) {
            jdbcDAO.showSeatsTable(showtimeId);
        } else {
            System.out.println("해당 조건에 맞는 상영 시간을 찾을 수 없습니다.");
        }
    }
}
