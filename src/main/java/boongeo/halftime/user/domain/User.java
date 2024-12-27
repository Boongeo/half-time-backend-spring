package boongeo.halftime.user.domain;

import boongeo.halftime.auth.domain.Account;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

	private Long id;
	private String profileImage;
	private String nickname;
	private Account account;
}
