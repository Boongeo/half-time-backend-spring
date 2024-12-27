package boongeo.halftime.auth.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import boongeo.halftime.auth.domain.Account;
import boongeo.halftime.auth.enums.Roles;
import lombok.Getter;

public class CustomUserDetails implements UserDetails {
	@Getter
	private final Long userId;
	private final String email;
	private final String password;
	private final List<Roles> roles;

	public CustomUserDetails(Account account, List<Roles> roles) {
		this.userId = account.getUser().getId();
		this.email = account.getEmail();
		this.password = account.getPassword();
		this.roles = roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles.stream()
			.map(role -> new SimpleGrantedAuthority("ROLE_" + role.name())) // "ROLE_" 접두사 추가
			.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}
}
