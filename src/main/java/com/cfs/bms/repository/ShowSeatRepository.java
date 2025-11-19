package com.cfs.bms.repository;

import com.cfs.bms.model.Booking;
import com.cfs.bms.model.Show;
import com.cfs.bms.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {
      List<ShowSeat>findByShowId(Long movieId);

      List<ShowSeat>findByShowIdAndStatus(Long showId,String status);

}
