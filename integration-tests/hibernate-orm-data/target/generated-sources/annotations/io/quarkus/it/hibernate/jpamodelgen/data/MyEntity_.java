package io.quarkus.it.hibernate.jpamodelgen.data;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MyEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyEntity_ {

	public static final String NAME = "name";
	public static final String ID = "id";

	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyEntity#name
	 **/
	public static volatile SingularAttribute<MyEntity, String> name;
	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyEntity#id
	 **/
	public static volatile SingularAttribute<MyEntity, Integer> id;
	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.data.MyEntity
	 **/
	public static volatile EntityType<MyEntity> class_;

}

