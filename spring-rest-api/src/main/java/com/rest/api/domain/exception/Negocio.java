package com.rest.api.domain.exception;

public class Negocio extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
//	public NegocioException(String messagem) {
//		super(message);
//	}
//7
	
	public Negocio(String message) {
		super(message);
	}
}
