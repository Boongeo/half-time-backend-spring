package boongeo.halftime.auth.service.port;

import boongeo.halftime.auth.domain.Account;

public interface AccountRepository {

	Account findByEmail(String email);
}
