package io.quarkus.it.data.hibernate;

import io.quarkus.data.hibernate._WithId._AutoLong;
import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

/**
 * Jakarta Data static metamodel for {@link io.quarkus.it.data.hibernate.Person}
 **/
@StaticMetamodel(Person.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _Person extends _AutoLong {

	
	/**
	 * @see #name
	 **/
	String NAME = "name";
	
	/**
	 * @see #age
	 **/
	String AGE = "age";

	
	/**
	 * Static metamodel for attribute {@link Person#name}
	 **/
	TextAttribute<Person> name = new TextAttributeRecord<>(NAME);
	
	/**
	 * Static metamodel for attribute {@link Person#age}
	 **/
	SortableAttribute<Person> age = new SortableAttributeRecord<>(AGE);

}

