package io.quarkus.it.hibernate.processor.data.pusqlonly;

import io.quarkus.hibernate.orm.PersistenceUnit;
import io.quarkus.it.hibernate.processor.data.pusqlonly.MySqlOnlyRepository.MyUserDto;
import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.data.exceptions.DataException;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import java.util.Optional;
import org.hibernate.StatelessSession;

/**
 * Implements Jakarta Data repository {@link io.quarkus.it.hibernate.processor.data.pusqlonly.MySqlOnlyRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class MySqlOnlyRepository_ implements MySqlOnlyRepository {

	
	/**
	 * @see #insert(int,String,String)
	 **/
	static final String INSERT_int_String_String = "insert into myuser (id, username, role) VALUES (:id, :username, :role)";
	
	/**
	 * @see #findByUsername(String)
	 **/
	static final String FIND_BY_USERNAME_String = "select id, username, role from myuser where username = :username";

	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public MySqlOnlyRepository_(@Nonnull @PersistenceUnit("sqlonly") StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	/**
	 * Execute the query {@value #INSERT_int_String_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pusqlonly.MySqlOnlyRepository#insert(int,String,String)
	 **/
	@Override
	public void insert(int id, String username, String role) {
		try {
			var _select = session.createNativeQuery(INSERT_int_String_String)
				.setParameter("id", id)
				.setParameter("username", username)
				.setParameter("role", role);
			_select
				.executeUpdate();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Execute the query {@value #FIND_BY_USERNAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pusqlonly.MySqlOnlyRepository#findByUsername(String)
	 **/
	@Override
	public Optional<MyUserDto> findByUsername(String username) {
		try {
			var _select = session.createNativeQuery(FIND_BY_USERNAME_String, MyUserDto.class)
				.setParameter("username", username);
			return _select
				.uniqueResultOptional();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}

}

