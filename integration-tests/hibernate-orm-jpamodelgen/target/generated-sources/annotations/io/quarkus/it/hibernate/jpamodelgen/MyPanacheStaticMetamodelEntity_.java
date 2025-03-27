package io.quarkus.it.hibernate.jpamodelgen;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MyPanacheStaticMetamodelEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class MyPanacheStaticMetamodelEntity_ extends io.quarkus.hibernate.orm.panache.PanacheEntity_ {

	public static final String NAME = "name";

	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.MyPanacheStaticMetamodelEntity#name
	 **/
	public static volatile SingularAttribute<MyPanacheStaticMetamodelEntity, String> name;
	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.MyPanacheStaticMetamodelEntity
	 **/
	public static volatile EntityType<MyPanacheStaticMetamodelEntity> class_;

}

