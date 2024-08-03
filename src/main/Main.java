package main;

import reservation.ReservationService;
import reservation.ReservationServiceImpl;
import users.UsersService;
import users.UsersServiceImpl;

public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        UsersService userService = new UsersServiceImpl();
        MainServiceImpl mainService = new MainServiceImpl(userService);
        mainService.execute();
    }
=======
  public static void main(String[] args) {
    System.out.println("Booking a movie ticket");
  }
>>>>>>> e4012e58a5aab744775e2af1ecd76f0eb54cab3e
}
