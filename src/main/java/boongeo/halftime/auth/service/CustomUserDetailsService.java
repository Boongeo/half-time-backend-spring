package boongeo.halftime.auth.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import boongeo.halftime.auth.domain.Account;
import boongeo.halftime.auth.enums.Roles;
import boongeo.halftime.auth.security.CustomUserDetails;
import boongeo.halftime.auth.service.port.AccountRepository;
import boongeo.halftime.auth.service.port.AccountRolesRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private final AccountRepository accountRepository;
	private final AccountRolesRepository accountRolesRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Account byEmail = accountRepository.findByEmail(email);
		List<Roles> rolesByAccountId = accountRolesRepository.findRolesByAccountId(byEmail.getId());
		return new CustomUserDetails(byEmail, rolesByAccountId);
	}
}
