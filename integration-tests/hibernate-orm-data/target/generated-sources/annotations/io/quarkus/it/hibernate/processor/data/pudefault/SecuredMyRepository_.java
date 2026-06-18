package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.data.Order;
import jakarta.data.Sort;
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
 * Implements Jakarta Data repository {@link io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class SecuredMyRepository_ implements SecuredMyRepository {

	
	/**
	 * @see #findByName(String)
	 **/
	static final String FIND_BY_NAME_String = "select e from MyEntity e where e.name like :name";

	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public SecuredMyRepository_(@Nonnull StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	@Override
	public void insertRootRole(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void insertAdminRole(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void insertDenyAll(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void insertAuthenticated(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void rename1(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void rename2(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void renameAll1And2(@Nonnull List<MyEntity> entities) {
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
	}
	
	@Override
	public void renameAll2And3(@Nonnull List<MyEntity> entities) {
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
	}
	
	@Override
	public void renameOverloaded(@Nonnull List<MyEntity> entities) {
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
	}
	
	@Override
	public void renameOverloaded(@Nonnull MyEntity entity) {
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
	}
	
	@Override
	public void insertAll1(@Nonnull List<MyEntity> entities) {
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
	}
	
	@Override
	public void insertAll2(@Nonnull List<MyEntity> entities) {
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
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAllForDonald(Order)
	 **/
	@Override
	public Stream<MyEntity> findAllForDonald(@Nonnull Order<MyEntity> order) {
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
			var _select = _spec.createQuery(session);
			return _select
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAllForDonald(String,Sort)
	 **/
	@Override
	public Stream<MyEntity> findAllForDonald(String name, @Nonnull Sort<MyEntity> sort) {
		requireNonNull(sort, "Null sort");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				name==null
					? _entity.get(MyEntity_.name).isNull()
					: _builder.like(_entity.get(MyEntity_.name), name)
		);
		var _spec = SelectionSpecification.create(_query);
		_spec.sort(asc(MyEntity.class, sort.property())
						.reversedIf(sort.isDescending())
						.ignoringCaseIf(sort.ignoreCase()));
		try {
			var _select = _spec.createQuery(session);
			return _select
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAllForDonald(Sort,String)
	 **/
	@Override
	public Stream<MyEntity> findAllForDonald(@Nonnull Sort<MyEntity> order, String name) {
		requireNonNull(order, "Null order");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
		_query.where(
				name==null
					? _entity.get(MyEntity_.name).isNull()
					: _builder.like(_entity.get(MyEntity_.name), name)
		);
		var _spec = SelectionSpecification.create(_query);
		_spec.sort(asc(MyEntity.class, order.property())
						.reversedIf(order.isDescending())
						.ignoringCaseIf(order.ignoreCase()));
		try {
			var _select = _spec.createQuery(session);
			return _select
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAllForGeorge(Order)
	 **/
	@Override
	public Stream<MyEntity> findAllForGeorge(@Nonnull Order<MyEntity> order) {
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
			var _select = _spec.createQuery(session);
			return _select
				.getResultStream();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Execute the query {@value #FIND_BY_NAME_String}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findByName(String)
	 **/
	@Override
	public List<MyEntity> findByName(String name) {
		try {
			var _select = session.createSelectionQuery(FIND_BY_NAME_String, MyEntity.class)
				.setParameter("name", name);
			return _select
				.getResultList();
		}
		catch (PersistenceException _ex) {
			throw new DataException(_ex.getMessage(), _ex);
		}
	}
	
	/**
	 * Delete {@link MyEntity} by {@link MyEntity#name name}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#delete(String)
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
	
	/**
	 * Find {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findById(Integer)
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
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAll()
	 **/
	@Override
	public Stream<MyEntity> findAll() {
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(MyEntity.class);
		var _entity = _query.from(MyEntity.class);
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
	 * Find {@link MyEntity}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#findAll(PageRequest,Order)
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
	 * Delete {@link MyEntity} by {@link MyEntity#id id}.
	 *
	 * @see io.quarkus.it.hibernate.processor.data.pudefault.SecuredMyRepository#deleteById(Integer)
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

