package io.quarkus.it.rest.data.hibernate;

import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

/**
 * Jakarta Data static metamodel for {@link io.quarkus.it.rest.data.hibernate.Fruit}
 **/
@StaticMetamodel(Fruit.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _Fruit {

	
	/**
	 * @see #id
	 **/
	String ID = "id";
	
	/**
	 * @see #name
	 **/
	String NAME = "name";

	
	/**
	 * Static metamodel for attribute {@link Fruit#id}
	 **/
	SortableAttribute<Fruit> id = new SortableAttributeRecord<>(ID);
	
	/**
	 * Static metamodel for attribute {@link Fruit#name}
	 **/
	TextAttribute<Fruit> name = new TextAttributeRecord<>(NAME);

}

