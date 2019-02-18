package br.eti.claudiney.model.api.ra.outbound.beans;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({ "unchecked", "serial" })
public class ModelConnectionSpec implements Serializable {

	private Map<String, Serializable> attributes =
			new LinkedHashMap<>();
	
	public void setAttribute(String attribute, Serializable value) {
		attributes.put(attribute, value);
	}
	
	public <T extends Serializable> T getAttribute(String attribute) {
		return (T) attributes.get(attribute);
	}
	
	public Set<String> attributes() {
		
		Set<String> attrs = new LinkedHashSet<>();
		
		Set<Map.Entry<String, Serializable>> entries = attributes.entrySet();
		
		for(Map.Entry<String, Serializable> entry: entries) {
			attrs.add(entry.getKey());
		}
		
		return attrs;
		
	}
	
}
