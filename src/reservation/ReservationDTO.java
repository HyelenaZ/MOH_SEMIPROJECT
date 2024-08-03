package reservation;

import lombok.Data;

@Data
public class ReservationDTO {
    public static class ShowtimeIdDTO {
        private int movieId;
        private int theaterId;
        private String timeString;

        public ShowtimeIdDTO(int movieId, int theaterId, String timeString) {
            this.movieId = movieId;
            this.theaterId = theaterId;
            this.timeString = timeString;
        }
    }
}
