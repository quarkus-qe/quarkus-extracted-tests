package io.quarkus.it.hibernate.processor.data.puother;

import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

/**
 * Jakarta Data static metamodel for {@link io.quarkus.it.hibernate.processor.data.puother.MyOtherEntity}
 **/
@StaticMetamodel(MyOtherEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _MyOtherEntity {

	
	/**
	 * @see #id
	 **/
	String ID = "id";
	
	/**
	 * @see #name
	 **/
	String NAME = "name";

	
	/**
	 * Static metamodel for attribute {@link MyOtherEntity#id}
	 **/
	SortableAttribute<MyOtherEntity> id = new SortableAttributeRecord<>(ID);
	
	/**
	 * Static metamodel for attribute {@link MyOtherEntity#name}
	 **/
	TextAttribute<MyOtherEntity> name = new TextAttributeRecord<>(NAME);

}

