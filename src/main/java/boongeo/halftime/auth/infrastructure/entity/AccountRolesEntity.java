package boongeo.halftime.auth.infrastructure.entity;

import boongeo.halftime.auth.enums.Roles;
import boongeo.halftime.common.infrastructure.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_roles")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountRolesEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private AccountEntity account;

	@Enumerated(EnumType.STRING)
	private Roles role;
}
