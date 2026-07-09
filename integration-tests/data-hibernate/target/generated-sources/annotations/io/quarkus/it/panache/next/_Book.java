package io.quarkus.it.panache.next;

import io.quarkus.hibernate.panache._WithId;
import jakarta.annotation.Generated;
import jakarta.data.metamodel.SortableAttribute;
import jakarta.data.metamodel.StaticMetamodel;
import jakarta.data.metamodel.TextAttribute;
import jakarta.data.metamodel.impl.SortableAttributeRecord;
import jakarta.data.metamodel.impl.TextAttributeRecord;

/**
 * Jakarta Data static metamodel for {@link io.quarkus.it.panache.next.Book}
 **/
@StaticMetamodel(Book.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public interface _Book extends _WithId {

	
	/**
	 * @see #title
	 **/
	String TITLE = "title";
	
	/**
	 * @see #author
	 **/
	String AUTHOR = "author";
	
	/**
	 * @see #pages
	 **/
	String PAGES = "pages";

	
	/**
	 * Static metamodel for attribute {@link Book#title}
	 **/
	TextAttribute<Book> title = new TextAttributeRecord<>(TITLE);
	
	/**
	 * Static metamodel for attribute {@link Book#author}
	 **/
	TextAttribute<Book> author = new TextAttributeRecord<>(AUTHOR);
	
	/**
	 * Static metamodel for attribute {@link Book#pages}
	 **/
	SortableAttribute<Book> pages = new SortableAttributeRecord<>(PAGES);

}

