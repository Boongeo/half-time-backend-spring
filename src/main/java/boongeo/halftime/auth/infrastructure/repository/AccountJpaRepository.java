package boongeo.halftime.auth.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boongeo.halftime.auth.infrastructure.entity.AccountEntity;

public interface AccountJpaRepository extends JpaRepository<AccountEntity, Long> {
	AccountEntity findByEmail(String email);
}
