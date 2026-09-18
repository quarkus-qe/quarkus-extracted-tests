package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import java.util.List;
import org.hibernate.Session;

/**
 * Implements repository {@link io.quarkus.it.hibernate.processor.data.pudefault.SecuredHqlMethodRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class SecuredHqlMethodRepository_ implements SecuredHqlMethodRepository {

	
	/**
	 * @see #findByName(String)
	 **/
	static final String FIND_BY_NAME_String = "from MyEntity WHERE name = :name";

	
	protected final @Nonnull Session session;
	
	@Inject
	public SecuredHqlMethodRepository_(@Nonnull Session session) {
		this.session = session;
	}
	
	public @Nonnull Session getSession() {
		return session;
	}
	
	/**
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredHqlMethodRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		var _select = session.createSelectionQuery(FIND_BY_NAME_String, MyEntity.class)
				.setParameter("name", name);
		return _select
				.getResultList();
	}

}

