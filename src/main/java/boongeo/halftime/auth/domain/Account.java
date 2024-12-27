package boongeo.halftime.auth.domain;

import boongeo.halftime.common.infrastructure.entity.BaseEntity;
import boongeo.halftime.user.domain.User;

public class Account extends BaseEntity {

	private Long id;
	private String refreshToken;
	private String socialId;
	private String email;
	private String password;
	private User user;



}
