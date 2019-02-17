package br.eti.claudiney.model.api.ra.outbound.def;

import javax.resource.cci.Connection;

import br.eti.claudiney.model.api.ra.exceptions.ModelResourceException;

public interface IModelConnection extends Connection {

	IModelConnectionMetaData getMetaData() throws ModelResourceException;
	
	@Override
	IModelService createInteraction() throws ModelResourceException;
	
	IModelService createService() throws ModelResourceException; 
	
	@Override
	IModelLocalTransaction getLocalTransaction() throws ModelResourceException;
	
	@Override
	IModelResultSetInfo getResultSetInfo() throws ModelResourceException;
	
	@Override
	void close() throws ModelResourceException;
	
}
