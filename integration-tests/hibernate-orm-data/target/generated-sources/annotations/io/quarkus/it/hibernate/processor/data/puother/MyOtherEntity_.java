package io.quarkus.it.hibernate.processor.data.puother;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link io.quarkus.it.hibernate.processor.data.puother.MyOtherEntity}
 **/
@StaticMetamodel(MyOtherEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyOtherEntity_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.hibernate.processor.data.puother.MyOtherEntity}
	 **/
	public static volatile EntityType<MyOtherEntity> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.processor.data.puother.MyOtherEntity#id}
	 **/
	public static volatile SingularAttribute<MyOtherEntity, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.processor.data.puother.MyOtherEntity#name}
	 **/
	public static volatile SingularAttribute<MyOtherEntity, String> name;

}

