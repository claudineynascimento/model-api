package br.eti.claudiney.model.api.ra.outbound.def;

import javax.resource.cci.ConnectionFactory;
import javax.resource.cci.ConnectionSpec;

import br.eti.claudiney.model.api.ra.def.IModelResourceAdapterMetaData;
import br.eti.claudiney.model.api.ra.exceptions.ModelResourceException;

public interface IModelConnectionFactory extends ConnectionFactory {

	@Override
	IModelConnection getConnection() throws ModelResourceException;
	
	@Override
	IModelConnection getConnection(ConnectionSpec spec) throws ModelResourceException;
	
	@Override
	IModelResourceAdapterMetaData getMetaData() throws ModelResourceException;
	
}
