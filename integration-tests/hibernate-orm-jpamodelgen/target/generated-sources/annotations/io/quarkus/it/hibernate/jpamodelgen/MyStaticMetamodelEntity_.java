package io.quarkus.it.hibernate.jpamodelgen;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity}
 **/
@StaticMetamodel(MyStaticMetamodelEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyStaticMetamodelEntity_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity}
	 **/
	public static volatile EntityType<MyStaticMetamodelEntity> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity#id}
	 **/
	public static volatile SingularAttribute<MyStaticMetamodelEntity, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity#name}
	 **/
	public static volatile SingularAttribute<MyStaticMetamodelEntity, String> name;

}

