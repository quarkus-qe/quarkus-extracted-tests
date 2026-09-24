package io.quarkus.it.rest.data.hibernate;

import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.data.Order;
import jakarta.data.exceptions.DataException;
import jakarta.data.page.Page;
import jakarta.data.page.PageRequest;
import jakarta.data.page.impl.PageRecord;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import static java.util.Objects.requireNonNull;
import org.hibernate.StatelessSession;
import static org.hibernate.query.Order.asc;
import static org.hibernate.query.SortDirection.*;
import org.hibernate.query.specification.SelectionSpecification;

/**
 * Implements Jakarta Data repository {@link io.quarkus.it.rest.data.hibernate.FruitRepository}
 **/
@Dependent
@Generated("org.hibernate.processor.HibernateProcessor")
public class FruitRepository_ implements FruitRepository {


	
	protected @Nonnull StatelessSession session;
	
	@Inject
	public FruitRepository_(@Nonnull StatelessSession session) {
		this.session = session;
	}
	
	public @Nonnull StatelessSession session() {
		return session;
	}
	
	/**
	 * Find {@link Fruit}.
	 *
	 * @see io.quarkus.it.rest.data.hibernate.FruitRepository#findAll(PageRequest,Order)
	 **/
	@Override
	public Page<Fruit> findAll(@Nonnull PageRequest pageRequest, @Nonnull Order<Fruit> order) {
		requireNonNull(pageRequest, "Null pageRequest");
		requireNonNull(order, "Null order");
		var _builder = session.getCriteriaBuilder();
		var _query = _builder.createQuery(Fruit.class);
		var _entity = _query.from(Fruit.class);
		_query.where(
		);
		var _spec = SelectionSpecification.create(_query);
		for (var _sort : order.sorts()) {
			_spec.sort(asc(Fruit.class, _sort.property())
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

}

