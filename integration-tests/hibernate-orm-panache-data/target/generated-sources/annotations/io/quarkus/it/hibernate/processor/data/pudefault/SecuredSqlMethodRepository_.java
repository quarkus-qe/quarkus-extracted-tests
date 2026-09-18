package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import java.util.List;
import org.hibernate.Session;

/**
 * Implements repository {@link io.quarkus.it.hibernate.processor.data.pudefault.SecuredSqlMethodRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class SecuredSqlMethodRepository_ implements SecuredSqlMethodRepository {

	
	/**
	 * @see #findByName(String)
	 **/
	static final String FIND_BY_NAME_String = "SELECT * FROM MyEntity WHERE name = :name";

	
	protected final @Nonnull Session session;
	
	@Inject
	public SecuredSqlMethodRepository_(@Nonnull Session session) {
		this.session = session;
	}
	
	public @Nonnull Session getSession() {
		return session;
	}
	
	/**
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredSqlMethodRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		var _select = session.createNativeQuery(FIND_BY_NAME_String, MyEntity.class)
				.setParameter("name", name);
		return _select
				.getResultList();
	}

}

