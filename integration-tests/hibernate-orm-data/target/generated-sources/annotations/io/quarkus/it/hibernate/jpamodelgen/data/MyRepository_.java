package io.quarkus.it.hibernate.jpamodelgen.data;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.data.Order;
import jakarta.data.exceptions.DataException;
import jakarta.data.exceptions.EmptyResultException;
import jakarta.data.exceptions.EntityExistsException;
import jakarta.data.exceptions.OptimisticLockingFailureException;
import jakarta.data.page.Page;
import jakarta.data.page.PageRequest;
import jakarta.data.page.impl.PageRecord;
import jakarta.inject.Inject;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.TransactionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static java.util.Optional.ofNullable;
import java.util.stream.Stream;
import org.hibernate.StaleStateException;
import org.hibernate.StatelessSession;
import org.hibernate.exception.ConstraintViolationException;
import static org.hibernate.query.Order.by;
import static org.hibernate.query.SortDirection.*;

@TransactionScoped
@Generated("org.hibernate.processor.HibernateProcessor")
public class MyRepository_ implements MyRepository {

	static final String FIND_BY_NAME_String = "select e from MyEntity e where e.name like :name";

	
	/**
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		try {
			return session.createSelectionQuery(FIND_BY_NAME_String, MyEntity.class)
				.setParameter("name", name)
				.getResultList();
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public void delete(@Nonnull MyEntity entity) {
		if (entity == null) throw new IllegalArgumentException("Null entity");
		try {
			session.delete(entity);
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public MyRepository_(@Nonnull StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#delete(String)
	 **/
	@Override
	public void delete(String name) {
		var _builder = session.getFactory().getCriteriaBuilder();
		var _query = _builder.createCriteriaDelete(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				name==null
					? _entity.get(MyEntity_.name).isNull()
					: _builder.equal(_entity.get(MyEntity_.name), name)
		);
		try {
			session.createMutationQuery(_query)
				.executeUpdate();
		}
		catch (NoResultException exception) {
			throw new EmptyResultException(exception.getMessage(), exception);
		}
		catch (NonUniqueResultException exception) {
			throw new jakarta.data.exceptions.NonUniqueResultException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#findAll()
	 **/
	@Override
	public Stream<MyEntity> findAll() {
		var _builder = session.getFactory().getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
		);
		try {
			return session.createSelectionQuery(_query)
				.getResultStream();
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public List updateAll(@Nonnull List entities) {
		if (entities == null) throw new IllegalArgumentException("Null entities");
		try {
			for (var _entity : entities) {
				session.update(_entity);
			}
			return entities;
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public MyEntity insert(@Nonnull MyEntity entity) {
		if (entity == null) throw new IllegalArgumentException("Null entity");
		try {
			session.insert(entity);
			return entity;
		}
		catch (ConstraintViolationException exception) {
			throw new EntityExistsException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public MyEntity save(@Nonnull MyEntity entity) {
		if (entity == null) throw new IllegalArgumentException("Null entity");
		try {
			if (session.getIdentifier(entity) == null)
				session.insert(entity);
			else
				session.upsert(entity);
			return entity;
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public List insertAll(@Nonnull List entities) {
		if (entities == null) throw new IllegalArgumentException("Null entities");
		try {
			for (var _entity : entities) {
				session.insert(_entity);
			}
			return entities;
		}
		catch (ConstraintViolationException exception) {
			throw new EntityExistsException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public List saveAll(@Nonnull List entities) {
		if (entities == null) throw new IllegalArgumentException("Null entities");
		try {
			for (var _entity : entities) {
				session.upsert(_entity);
			}
			return entities;
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#deleteById(Integer)
	 **/
	@Override
	public void deleteById(@Nonnull Integer id) {
		if (id == null) throw new IllegalArgumentException("Null id");
		var _builder = session.getFactory().getCriteriaBuilder();
		var _query = _builder.createCriteriaDelete(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				_builder.equal(_entity.get(MyEntity_.id), id)
		);
		try {
			session.createMutationQuery(_query)
				.executeUpdate();
		}
		catch (NoResultException exception) {
			throw new EmptyResultException(exception.getMessage(), exception);
		}
		catch (NonUniqueResultException exception) {
			throw new jakarta.data.exceptions.NonUniqueResultException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public void deleteAll(@Nonnull List<? extends MyEntity> entities) {
		if (entities == null) throw new IllegalArgumentException("Null entities");
		try {
			for (var _entity : entities) {
				session.delete(_entity);
			}
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#findAll(PageRequest,Order)
	 **/
	@Override
	public Page<MyEntity> findAll(PageRequest pageRequest, Order<MyEntity> sortBy) {
		var _builder = session.getFactory().getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
		);
		var _orders = new ArrayList<org.hibernate.query.Order<? super MyEntity>>();
		for (var _sort : sortBy.sorts()) {
			_orders.add(by(MyEntity.class, _sort.property(),
							_sort.isAscending() ? ASCENDING : DESCENDING,
							_sort.ignoreCase()));
		}
		try {
			long _totalResults = 
					pageRequest.requestTotal()
							? session.createSelectionQuery(_query)
									.getResultCount()
							: -1;
			var _results = session.createSelectionQuery(_query)
				.setFirstResult((int) (pageRequest.page()-1) * pageRequest.size())
				.setMaxResults(pageRequest.size())
				.setOrder(_orders)
				.getResultList();
			return new PageRecord(pageRequest, _results, _totalResults);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyRepository#findById(Integer)
	 **/
	@Override
	public Optional<MyEntity> findById(@Nonnull Integer id) {
		if (id == null) throw new IllegalArgumentException("Null id");
		try {
			return ofNullable(session.get(MyEntity.class, id));
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}
	
	@Override
	public MyEntity update(@Nonnull MyEntity entity) {
		if (entity == null) throw new IllegalArgumentException("Null entity");
		try {
			session.update(entity);
			return entity;
		}
		catch (StaleStateException exception) {
			throw new OptimisticLockingFailureException(exception.getMessage(), exception);
		}
		catch (PersistenceException exception) {
			throw new DataException(exception.getMessage(), exception);
		}
	}

}

