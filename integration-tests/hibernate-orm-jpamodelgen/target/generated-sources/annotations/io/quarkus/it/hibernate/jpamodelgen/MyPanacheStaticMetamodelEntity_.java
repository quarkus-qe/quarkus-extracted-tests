package io.quarkus.it.hibernate.jpamodelgen;

import io.quarkus.hibernate.orm.panache.PanacheEntity_;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link io.quarkus.it.hibernate.jpamodelgen.MyPanacheStaticMetamodelEntity}
 **/
@StaticMetamodel(MyPanacheStaticMetamodelEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyPanacheStaticMetamodelEntity_ extends PanacheEntity_ {

	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";

	
	/**
	 * Static metamodel type for {@link io.quarkus.it.hibernate.jpamodelgen.MyPanacheStaticMetamodelEntity}
	 **/
	public static volatile EntityType<MyPanacheStaticMetamodelEntity> class_;
	
	/**
	 * Static metamodel for attribute {@link io.quarkus.it.hibernate.jpamodelgen.MyPanacheStaticMetamodelEntity#name}
	 **/
	public static volatile SingularAttribute<MyPanacheStaticMetamodelEntity, String> name;

}

