package io.quarkus.it.rest.data.hibernate;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link io.quarkus.it.rest.data.hibernate.Fruit}
 **/
@StaticMetamodel(Fruit.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Fruit_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.rest.data.hibernate.Fruit}
	 **/
	public static volatile EntityType<Fruit> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.rest.data.hibernate.Fruit#id}
	 **/
	public static volatile SingularAttribute<Fruit, Long> id;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.rest.data.hibernate.Fruit#name}
	 **/
	public static volatile SingularAttribute<Fruit, String> name;

}

