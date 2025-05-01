package io.quarkus.it.hibernate.jpamodelgen.data;

import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

@StaticMetamodel(MyEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _MyEntity {

	String NAME = "name";
	String ID = "id";

	
	/**
	 * @see MyEntity#name
	 **/
	TextAttribute<MyEntity> name = new TextAttributeRecord<>(NAME);
	
	/**
	 * @see MyEntity#id
	 **/
	SortableAttribute<MyEntity> id = new SortableAttributeRecord<>(ID);

}

