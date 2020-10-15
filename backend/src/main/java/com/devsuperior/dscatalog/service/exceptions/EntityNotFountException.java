package com.devsuperior.dscatalog.service.exceptions;

public class EntityNotFountException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public EntityNotFountException(String msg) {
		super(msg);
	}

}
