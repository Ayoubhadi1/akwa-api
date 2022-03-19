package com.akwaapi.akwaapi.Entities;


public enum ERole {
	ROLE_USER,
    ROLE_AGENT,
    ROLE_ADMIN ;
	
	public static String[] names() {
	    ERole[] erole = values();
	    String[] names = new String[erole.length];

	    for (int i = 0; i < erole.length; i++) {
	        names[i] = erole[i].name();
	    }

	    return names;
	}
}
