package io.quarkus.it.data.hibernate;

import io.quarkus.data.hibernate.WithId_.AutoLong_;
import io.quarkus.it.data.hibernate.Person.Repository;
import io.quarkus.it.data.hibernate.Person_.Repository_;
import jakarta.annotation.Generated;
import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.hibernate.Session;

/**
 * Static metamodel for {@link io.quarkus.it.data.hibernate.Person}
 **/
@StaticMetamodel(Person.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Person_ extends AutoLong_ {

	/**
	 * Implements repository {@link io.quarkus.it.data.hibernate.Person.Repository}
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
	
	}
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";
	
	/**
	 * @see #age
	 **/
	public static final String AGE = "age";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.data.hibernate.Person}
	 **/
	public static volatile EntityType<Person> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.data.hibernate.Person#name}
	 **/
	public static volatile SingularAttribute<Person, String> name;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.data.hibernate.Person#age}
	 **/
	public static volatile SingularAttribute<Person, Integer> age;
	
	public static Repository repository() {
		return CDI.current().select(Repository.class).get();
	}
	
	public static Repository managedBlocking() {
		return CDI.current().select(Repository.class).get();
	}
	
	@Dependent
	@Generated("org.hibernate.processor.HibernateProcessor")
	public static class PanacheStatelessBlockingRepository_ implements io.quarkus.data.hibernate.stateless.blocking.BlockingRecordRepositoryBase<Person, java.lang.Long> {
	}
	
	public static PanacheStatelessBlockingRepository_ statelessBlocking() {
		return CDI.current().select(PanacheStatelessBlockingRepository_.class).get();
	}

}

