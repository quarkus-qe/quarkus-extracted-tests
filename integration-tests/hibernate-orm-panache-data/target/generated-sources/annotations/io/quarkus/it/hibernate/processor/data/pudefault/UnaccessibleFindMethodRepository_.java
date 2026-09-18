package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import java.util.List;
import org.hibernate.Session;

/**
 * Implements repository {@link io.quarkus.it.hibernate.processor.data.pudefault.UnaccessibleFindMethodRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class UnaccessibleFindMethodRepository_ implements UnaccessibleFindMethodRepository {


	
	protected final @Nonnull Session session;
	
	@Inject
	public UnaccessibleFindMethodRepository_(@Nonnull Session session) {
		this.session = session;
	}
	
	public @Nonnull Session getSession() {
		return session;
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.UnaccessibleFindMethodRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				name==null
					? _entity.get(MyEntity_.name).isNull()
					: _builder.equal(_entity.get(MyEntity_.name), name)
		);
		var _select = session.createSelectionQuery(_query);
		return _select
				.getResultList();
	}

}

