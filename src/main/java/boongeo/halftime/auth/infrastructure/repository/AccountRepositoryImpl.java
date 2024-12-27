package boongeo.halftime.auth.infrastructure.repository;

import org.springframework.stereotype.Repository;

import boongeo.halftime.auth.domain.Account;
import boongeo.halftime.auth.service.port.AccountRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

	private final AccountJpaRepository accountJpaRepository;

	@Override
	public Account findByEmail(String email) {
		return accountJpaRepository.findByEmail(email).toModel();
	}
}
