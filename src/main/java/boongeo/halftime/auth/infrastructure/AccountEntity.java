package boongeo.halftime.auth.infrastructure;

import boongeo.halftime.common.infrastructure.entity.BaseEntity;
import boongeo.halftime.user.infrastructure.entity.UserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String refreshToken;
	private String socialId;
	private String email;
	private String password;

	@OneToOne()
	@JoinColumn(name = "user_id")
	private UserEntity user;



}
