package io.quarkus.it.hibernate.jpamodelgen;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MyStaticMetamodelEntity.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class MyStaticMetamodelEntity_ {

	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity#name
	 **/
	public static volatile SingularAttribute<MyStaticMetamodelEntity, String> name;
	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity#id
	 **/
	public static volatile SingularAttribute<MyStaticMetamodelEntity, Integer> id;
	
	/**
	 * @see io.quarkus.it.hibernate.jpamodelgen.MyStaticMetamodelEntity
	 **/
	public static volatile EntityType<MyStaticMetamodelEntity> class_;

	public static final String NAME = "name";
	public static final String ID = "id";

}

