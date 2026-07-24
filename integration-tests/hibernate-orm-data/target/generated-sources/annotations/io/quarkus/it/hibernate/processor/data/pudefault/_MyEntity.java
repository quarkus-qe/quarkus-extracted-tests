package io.quarkus.it.hibernate.processor.data.pudefault;

import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

/**
 * Jakarta Data static metamodel for {@link io.quarkus.it.hibernate.processor.data.pudefault.MyEntity}
 **/
@StaticMetamodel(MyEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _MyEntity {

	
	/**
	 * @see #id
	 **/
	String ID = "id";
	
	/**
	 * @see #name
	 **/
	String NAME = "name";

	
	/**
	 * Static metamodel for attribute {@link MyEntity#id}
	 **/
	SortableAttribute<MyEntity> id = new SortableAttributeRecord<>(ID);
	
	/**
	 * Static metamodel for attribute {@link MyEntity#name}
	 **/
	TextAttribute<MyEntity> name = new TextAttributeRecord<>(NAME);

}

