package com.Dionisio.Dionisio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Dionisio.Dionisio.Domain.MOVIE;

public interface MovieRepository extends JpaRepository<MOVIE, Integer> {

}
