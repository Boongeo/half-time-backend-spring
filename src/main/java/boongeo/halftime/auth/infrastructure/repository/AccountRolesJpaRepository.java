package boongeo.halftime.auth.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import boongeo.halftime.auth.enums.Roles;
import boongeo.halftime.auth.infrastructure.entity.AccountRolesEntity;

public interface AccountRolesJpaRepository extends JpaRepository<AccountRolesEntity, Long> {

	@Query("SELECT ar.role FROM AccountRolesEntity ar WHERE ar.account.id = :accountId")
	List<Roles> findRolesByAccountId(@Param("accountId") Long accountId);

}
