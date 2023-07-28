

package edu.poly.shopp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.shopp.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
	
}
