package boongeo.halftime.auth.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import boongeo.halftime.auth.enums.Roles;
import boongeo.halftime.auth.service.port.AccountRolesRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AccountRolesRepositoryImpl implements AccountRolesRepository {

	private final AccountRolesJpaRepository accountRolesJpaRepository;

	@Override
	public List<Roles> findRolesByAccountId(Long accountId) {
		return accountRolesJpaRepository.findRolesByAccountId(accountId);
	}
}
