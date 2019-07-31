package com.Dionisio.Dionisio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Dionisio.Dionisio.Domain.SEAT;

public interface SeatRepository extends JpaRepository<SEAT, Integer> {

}
