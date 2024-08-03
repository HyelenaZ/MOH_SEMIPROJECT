package reservation;

import jdbc.JdbcDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final JdbcDAO jdbcDAO;

    @Override
    public void showSeatsTable(int showTimeId) {
        jdbcDAO.showSeatsTable(showTimeId);
    }
}
