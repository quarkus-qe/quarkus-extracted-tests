package io.quarkus.it.hibernate.processor.data.puother;

import io.quarkus.hibernate.orm.PersistenceUnit;
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
 * Implements Jakarta Data repository {@link io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class AuthenticatedMyOtherRepository_ implements AuthenticatedMyOtherRepository {

	
	/**
	 * @see #findByName(String)
	 **/
	static final String FIND_BY_NAME_String = "select e from MyOtherEntity e where e.name like :name";

	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public AuthenticatedMyOtherRepository_(@Nonnull @PersistenceUnit("other") StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	@Override
	public  <S extends MyOtherEntity> S insert(@Nonnull S entity) {
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
	public  <S extends MyOtherEntity> List<S> insertAll(@Nonnull List<S> entities) {
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
	public  <S extends MyOtherEntity> S update(@Nonnull S entity) {
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
	public  <S extends MyOtherEntity> List<S> updateAll(@Nonnull List<S> entities) {
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
	public  <S extends MyOtherEntity> S save(@Nonnull S entity) {
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
	public  <S extends MyOtherEntity> List<S> saveAll(@Nonnull List<S> entities) {
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
	public void delete(@Nonnull MyOtherEntity entity) {
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
	public void deleteAll(@Nonnull List<? extends MyOtherEntity> entities) {
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
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository#findByName(String)
	 **/
	@Override
	public List<MyOtherEntity> findByName(String name) {
		try {
			var _select = session.createSelectionQuery(FIND_BY_NAME_String, MyOtherEntity.class)
				.setParameter("name", name);
			return _select
				.getResultList();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyOtherEntity} by {@link MyOtherEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository#findById(Integer)
	 **/
	@Override
	public Optional<MyOtherEntity> findById(@Nonnull Integer id) {
		requireNonNull(id, "Null id");
		try {
			return ofNullable(session.get(MyOtherEntity.class, id));
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyOtherEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository#findAll()
	 **/
	@Override
	public Stream<MyOtherEntity> findAll() {
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyOtherEntity.class);
		var _entity = _query.from(MyOtherEntity.class);
		_query.where(
		);
		try {
			var _select = session.createSelectionQuery(_query);
			return _select
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyOtherEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository#findAll(PageRequest,Order)
	 **/
	@Override
	public Page<MyOtherEntity> findAll(@Nonnull PageRequest pageRequest, @Nonnull Order<MyOtherEntity> sortBy) {
		requireNonNull(pageRequest, "Null pageRequest");
		requireNonNull(sortBy, "Null sortBy");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyOtherEntity.class);
		var _entity = _query.from(MyOtherEntity.class);
		_query.where(
		);
		var _spec = SelectionSpecification.create(_query);
		for (var _sort : sortBy.sorts()) {
			_spec.sort(asc(MyOtherEntity.class, _sort.property())
						.reversedIf(_sort.isDescending())
						.ignoringCaseIf(_sort.ignoreCase()));
		}
		try {
			var _select = _spec.createQuery(session);
			long _totalResults = 
					pageRequest.requestTotal()
							? _select
									.getResultCount()
							: -1;
			var _results = _select
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
	 * Delete {@link MyOtherEntity} by {@link MyOtherEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.puother.AuthenticatedMyOtherRepository#deleteById(Integer)
	 **/
	@Override
	public void deleteById(@Nonnull Integer id) {
		requireNonNull(id, "Null id");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createCriteriaDelete(MyOtherEntity.class);
		var _entity = _query.from(MyOtherEntity.class);
		_query.where(
				_builder.equal(_entity.get(MyOtherEntity_.id), id)
		);
		try {
			session.createMutationQuery(_query).executeUpdate();
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

