package com.developairs.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="BOOK")
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "BOOK_ID", unique = true, nullable = false)
	private Long id;

	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="ISBN", nullable=false)
	private long isbn;
	
	@NotEmpty
	@Column(name="AUTHOR", nullable=false)
	private String author;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		int result;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + ((isbn+"") != "" ? (isbn+"").hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private Set<User> fans = new HashSet<User>(0);
	
	public Set<User> getFans() {
		return this.fans;
	}

	public void setFans(Set<User> fans) {
		this.fans = fans;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
