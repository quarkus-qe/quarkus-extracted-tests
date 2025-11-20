package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link io.quarkus.it.hibernate.processor.data.pudefault.MyEntity}
 **/
@StaticMetamodel(MyEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyEntity_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.hibernate.processor.data.pudefault.MyEntity}
	 **/
	public static volatile EntityType<MyEntity> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.processor.data.pudefault.MyEntity#id}
	 **/
	public static volatile SingularAttribute<MyEntity, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.processor.data.pudefault.MyEntity#name}
	 **/
	public static volatile SingularAttribute<MyEntity, String> name;

}

