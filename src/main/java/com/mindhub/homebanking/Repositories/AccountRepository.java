package com.mindhub.homebanking.Repositories;

import com.mindhub.homebanking.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByNumber (String number);

}
