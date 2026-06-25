package io.quarkus.it.panache.next;

import io.quarkus.hibernate.panache.WithId_;
import io.quarkus.it.panache.next.Book.Repository;
import io.quarkus.it.panache.next.Book_.Repository_;
import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.List;
import org.hibernate.Session;

/**
 * Static metamodel for {@link io.quarkus.it.panache.next.Book}
 **/
@StaticMetamodel(Book.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Book_ extends WithId_ {

	/**
	 * Implements repository {@link io.quarkus.it.panache.next.Book.Repository}
	 **/
	@Dependent
	@Generated("org.hibernate.processor.HibernateProcessor")
	public static class Repository_ implements Repository {
	
	
		
		protected final @Nonnull Session session;
		
		@Inject
		public Repository_(@Nonnull Session session) {
			this.session = session;
		}
		
		public @Nonnull Session getSession() {
			return session;
		}
		
		/**
		 * Find {@link Book} by {@link Book#author author}.
		 *
		 * @see io.quarkus.it.panache.next.Book.Repository#findByAuthor(String)
		 **/
		@Override
		public List<Book> findByAuthor(String author) {
			var _builder = session.getCriteriaBuilder();
			var _query = _builder.createQuery(Book.class);
			var _entity = _query.from(Book.class);
			_query.where(
					author==null
						? _entity.get(Book_.author).isNull()
						: _builder.equal(_entity.get(Book_.author), author)
			);
			var _select = session.createSelectionQuery(_query);
			return _select
					.getResultList();
		}
		
		/**
		 * Find {@link Book} by {@link Book#title title}.
		 *
		 * @see io.quarkus.it.panache.next.Book.Repository#findByTitle(String)
		 **/
		@Override
		public Book findByTitle(String title) {
			var _builder = session.getCriteriaBuilder();
			var _query = _builder.createQuery(Book.class);
			var _entity = _query.from(Book.class);
			_query.where(
					title==null
						? _entity.get(Book_.title).isNull()
						: _builder.equal(_entity.get(Book_.title), title)
			);
			var _select = session.createSelectionQuery(_query);
			return _select
					.getSingleResult();
		}
	
	}
	
	/**
	 * @see #title
	 **/
	public static final String TITLE = "title";
	
	/**
	 * @see #author
	 **/
	public static final String AUTHOR = "author";
	
	/**
	 * @see #pages
	 **/
	public static final String PAGES = "pages";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.panache.next.Book}
	 **/
	public static volatile EntityType<Book> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.panache.next.Book#title}
	 **/
	public static volatile SingularAttribute<Book, String> title;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.panache.next.Book#author}
	 **/
	public static volatile SingularAttribute<Book, String> author;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.panache.next.Book#pages}
	 **/
	public static volatile SingularAttribute<Book, Integer> pages;
	
	public static Repository repository() {
		return CDI.current().select(Repository.class).get();
	}
	
	public static Repository managedBlocking() {
		return CDI.current().select(Repository.class).get();
	}
	
	@Dependent
	@Generated("org.hibernate.processor.HibernateProcessor")
	public static class PanacheStatelessBlockingRepository_ implements io.quarkus.hibernate.panache.stateless.blocking.PanacheStatelessBlockingRepositoryBase<Book, java.lang.Long> {
	}
	
	public static PanacheStatelessBlockingRepository_ statelessBlocking() {
		return CDI.current().select(PanacheStatelessBlockingRepository_.class).get();
	}

}

