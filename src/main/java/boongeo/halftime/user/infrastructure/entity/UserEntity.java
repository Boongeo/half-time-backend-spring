package boongeo.halftime.user.infrastructure.entity;

import boongeo.halftime.auth.infrastructure.entity.AccountEntity;
import boongeo.halftime.common.infrastructure.entity.BaseEntity;
import boongeo.halftime.user.domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends BaseEntity {

	@Id
	private Long id;
	private String profileImage;

	@Column(unique = true)
	private String nickname;

	@OneToOne(mappedBy = "user")
	private AccountEntity account;

	public User toModel() {
		return User.builder()
			.id(id)
			.profileImage(profileImage)
			.nickname(nickname)
			.account(account.toModel())
			.build();
	}


}
