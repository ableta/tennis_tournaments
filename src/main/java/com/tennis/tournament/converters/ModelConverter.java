package com.tennis.tournament.converters;

public interface ModelConverter<T, E> {

	public T convertFromModelToEntity(E e);
	
	public E convertFromEntityToModel(T e);
}
