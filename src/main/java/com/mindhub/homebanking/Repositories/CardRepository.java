package com.mindhub.homebanking.Repositories;

import com.mindhub.homebanking.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    Card findByNumber(String number);

}
