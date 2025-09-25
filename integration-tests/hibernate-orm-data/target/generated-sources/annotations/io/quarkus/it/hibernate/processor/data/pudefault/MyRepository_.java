package io.quarkus.it.hibernate.processor.data.pudefault;

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
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.PersistenceException;
import java.util.List;
import static java.util.Objects.requireNonNull;
import java.util.Optional;
import static java.util.Optional.ofNullable;
import java.util.stream.Stream;
import org.hibernate.StaleStateException;
import org.hibernate.StatelessSession;
import org.hibernate.exception.ConstraintViolationException;
import static org.hibernate.query.Order.asc;
import static org.hibernate.query.SortDirection.*;
import org.hibernate.query.specification.SelectionSpecification;

/**
 * Implements Jakarta Data repository {@link io.quarkus.it.hibernate.processor.data.pudefault.MyRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class MyRepository_ implements MyRepository {

	
	/**
	 * @see #findByName(String)
	 **/
	static final String FIND_BY_NAME_String = "select e from MyEntity e where e.name like :name";

	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public MyRepository_(@Nonnull StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	@Override
	public  <S extends MyEntity> S insert(@Nonnull S entity) {
		requireNonNull(entity, "Null entity");
		try {
			session.insert(entity);
		}
		catch (ConstraintViolationException _ex) {
			throw new EntityExistsException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entity;
	}
	
	@Override
	public  <S extends MyEntity> List<S> insertAll(@Nonnull List<S> entities) {
		requireNonNull(entities, "Null entities");
		try {
			session.insertMultiple(entities);
		}
		catch (ConstraintViolationException _ex) {
			throw new EntityExistsException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entities;
	}
	
	@Override
	public  <S extends MyEntity> S update(@Nonnull S entity) {
		requireNonNull(entity, "Null entity");
		try {
			session.update(entity);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entity;
	}
	
	@Override
	public  <S extends MyEntity> List<S> updateAll(@Nonnull List<S> entities) {
		requireNonNull(entities, "Null entities");
		try {
			session.updateMultiple(entities);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entities;
	}
	
	@Override
	public  <S extends MyEntity> S save(@Nonnull S entity) {
		requireNonNull(entity, "Null entity");
		try {
			if (session.getIdentifier(entity) == null)
				session.insert(entity);
			else
				session.upsert(entity);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entity;
	}
	
	@Override
	public  <S extends MyEntity> List<S> saveAll(@Nonnull List<S> entities) {
		requireNonNull(entities, "Null entities");
		try {
			session.upsertMultiple(entities);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
		return entities;
	}
	
	@Override
	public void delete(@Nonnull MyEntity entity) {
		requireNonNull(entity, "Null entity");
		try {
			session.delete(entity);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	@Override
	public void deleteAll(@Nonnull List<? extends MyEntity> entities) {
		requireNonNull(entities, "Null entities");
		try {
			session.deleteMultiple(entities);
		}
		catch (StaleStateException _ex) {
			throw new OptimisticLockingFailureException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#findAll(Order)
	 **/
	@Override
	public Stream<MyEntity> findAll(@Nonnull Order<MyEntity> order) {
		requireNonNull(order, "Null order");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
		);
		var _spec = SelectionSpecification.create(_query);
		for (var _sort : order.sorts()) {
			_spec.sort(asc(MyEntity.class, _sort.property())
						.reversedIf(_sort.isDescending())
						.ignoringCaseIf(_sort.ignoreCase()));
		}
		try {
			return _spec.createQuery(session)
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		try {
			return session.createSelectionQuery(FIND_BY_NAME_String, MyEntity.class)
				.setParameter("name", name)
				.getResultList();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Delete {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#delete(String)
	 **/
	@Override
	public void delete(String name) {
		var _builder = session.getCriteriaBuilder();
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
		catch (NoResultException _ex) {
			throw new EmptyResultException(_ex.getMessage(), _ex);
		}
		catch (NonUniqueResultException _ex) {
			throw new jakarta.data.exceptions.NonUniqueResultException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#findById(Integer)
	 **/
	@Override
	public Optional<MyEntity> findById(@Nonnull Integer id) {
		requireNonNull(id, "Null id");
		try {
			return ofNullable(session.get(MyEntity.class, id));
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#findAll()
	 **/
	@Override
	public Stream<MyEntity> findAll() {
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
		);
		try {
			return session.createSelectionQuery(_query)
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#findAll(PageRequest,Order)
	 **/
	@Override
	public Page<MyEntity> findAll(@Nonnull PageRequest pageRequest, @Nonnull Order<MyEntity> sortBy) {
		requireNonNull(pageRequest, "Null pageRequest");
		requireNonNull(sortBy, "Null sortBy");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
		);
		var _spec = SelectionSpecification.create(_query);
		for (var _sort : sortBy.sorts()) {
			_spec.sort(asc(MyEntity.class, _sort.property())
						.reversedIf(_sort.isDescending())
						.ignoringCaseIf(_sort.ignoreCase()));
		}
		try {
			long _totalResults = 
					pageRequest.requestTotal()
							? _spec.createQuery(session)
									.getResultCount()
							: -1;
			var _results = _spec.createQuery(session)
				.setFirstResult((int) (pageRequest.page()-1) * pageRequest.size())
				.setMaxResults(pageRequest.size())
				.getResultList();
			return new PageRecord<>(pageRequest, _results, _totalResults);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Delete {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.MyRepository#deleteById(Integer)
	 **/
	@Override
	public void deleteById(@Nonnull Integer id) {
		requireNonNull(id, "Null id");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createCriteriaDelete(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				_builder.equal(_entity.get(MyEntity_.id), id)
		);
		try {
			session.createMutationQuery(_query)
				.executeUpdate();
		}
		catch (NoResultException _ex) {
			throw new EmptyResultException(_ex.getMessage(), _ex);
		}
		catch (NonUniqueResultException _ex) {
			throw new jakarta.data.exceptions.NonUniqueResultException(_ex.getMessage(), _ex);
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}

}

