package boongeo.halftime.auth.service.port;

import java.util.List;

import boongeo.halftime.auth.enums.Roles;

public interface AccountRolesRepository {
	List<Roles> findRolesByAccountId(Long accountId);
}
