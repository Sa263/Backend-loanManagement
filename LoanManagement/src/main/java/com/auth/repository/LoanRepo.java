package com.auth.repository;

import com.auth.model.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LoanRepo extends JpaRepository<LoanDetails, Long> {

//    @Query("Select * from LoanDetails where fname=fname")
//    Optional<LoanDetails> findByFname(String fname);


//    @Query(" Select l From LoanDetails l  where l.fname=fname")
    List<LoanDetails> findByFname(String fname);

//    @Query(" Select l From LoanDetails l  where l.lname=lname")
    List<LoanDetails> findByLname(String lname);

//    Optional<LoanDetails> findByFname(String fname);
//
//    Optional<LoanDetails> findByLname(String lname);
}
