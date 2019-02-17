package br.eti.claudiney.model.api.ra.outbound.def;

import javax.resource.cci.Interaction;

public interface IModelService extends Interaction {

	@Override
	IModelConnection getConnection();
	
}
