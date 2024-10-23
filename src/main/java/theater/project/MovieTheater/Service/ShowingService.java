package theater.project.MovieTheater.Service;

import org.springframework.stereotype.Service;
import theater.project.MovieTheater.DataPersistent.Entity.Seat;
import theater.project.MovieTheater.DataPersistent.Entity.Showing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public interface ShowingService {
    Showing getShowingById(Long showingId);
    List<Showing> getAllShowings();

    List<Showing> getShowingsByDate(LocalDate date);
    List<Showing> getShowingsByDateAndTime(LocalDate date, LocalTime time);
    List<Showing> getShowingsByMovieId(Long movieId);
    List<Showing> getShowingsByMovieAndDate(Long movieId, LocalDate date);
    List<Showing> getShowingsByMovieIdAndTime(Long movieId, LocalTime time);
    List<Showing> getShowingsByMovieWithDateAndTime(Long movieId, LocalDate date, LocalTime time);


    // ADMIN
    Showing addNewShowing(Showing showing);
    Showing updateShowing(Long showingId, Showing updatedShowing);
    boolean deleteShowing(Long showingId);

    List<Showing> addMultipleNewShowings(List<Showing> showings);
    List<Showing> removeMultipleShowings(List<Showing> showings);

    boolean removeAllShowingsByMovieId(Long movieId);
    boolean removeAllShowingsByMovieName(String movieName);
    boolean removeAllShowingsByDate(LocalDate date);

    boolean showingExistsByShowingId(Long showingId);
    boolean showingExistsByMovieId(Long movieId);
    boolean showingExistsByMovieName(Long movieName);

    int getNumOfAvailableSeats(Long showingId);
    int getNumOfOccupiedSeats(Long showingId);
    int getNumOfDisabledSeats(Long showingId);

    List<Seat> getAvailableSeatsForShowing(Long showingId);
    List<Seat> getSelectedSeatsForShowing(Long showingId);
    List<Seat> getOccupiedSeatsForShowing(Long showingId);

    boolean isShowingSoldOut(Long showingId);
    boolean hasShowingCompleted(Long showingId);

}
