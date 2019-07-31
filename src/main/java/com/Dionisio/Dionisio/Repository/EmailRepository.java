package com.Dionisio.Dionisio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Dionisio.Dionisio.Domain.EMAIL;

public interface EmailRepository extends JpaRepository<EMAIL, String>{

}
