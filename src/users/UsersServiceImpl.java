package users;

import jdbc.JdbcDAO;

import java.util.Scanner;

public class UsersServiceImpl implements UsersService {
    private JdbcDAO jdbcDAO = JdbcDAO.getInstance();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void join() {
        System.out.print("ID: ");
        String id = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        UsersDTO usersDTO = new UsersDTO(id, password, age);
        jdbcDAO.join(usersDTO);
    }

    @Override
    public void login() {
        System.out.print("ID: ");
        String id = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        jdbcDAO.login(id, password);
    }

    @Override
    public void showMovieList() {
        jdbcDAO.showMovieList();
    }

    @Override
    public void showTimeTable() {
        jdbcDAO.showTimeTable();
    }
}
