package org.geduino.ros.core.naming.model;

import org.geduino.ros.core.naming.exception.RosNamingRuntimeException;

public class PrivateName extends Name implements UnresolvedName {

	private static final long serialVersionUID = 1L;

	public PrivateName(String privateName) {
		super(privateName);
	}
	
	@Override
	protected void validate(String string) {
		
		if (!Name.isPrivate(string)) {
			
			// Throw exception
			throw new RosNamingRuntimeException("invalid private name: " + string);
			
		}
		
	}

	@Override
	public Name resolve(ResolvedName resolvedName) {

		// Get resolved name syntax
		String nameSyntax = resolvedName.getName().name.concat(
				resolvedName.isRoot() ? "" : "/")
				.concat(this.name.substring(1));

		// Create resolved name
		Name name = Name.parseName(nameSyntax);

		return name;

	}

}
