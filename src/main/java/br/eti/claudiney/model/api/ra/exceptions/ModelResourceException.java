package br.eti.claudiney.model.api.ra.exceptions;

import javax.resource.ResourceException;

@SuppressWarnings("serial")
public class ModelResourceException extends ResourceException {

	public ModelResourceException() {
		super();
	}
	
	public ModelResourceException(String message) {
		super(message);
	}
	
	public ModelResourceException(Throwable throwable) {
		super(throwable);
	}
	
	public ModelResourceException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
