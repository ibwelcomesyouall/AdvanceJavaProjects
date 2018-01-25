package org.indranil.learning.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.indranil.learning.messenger.model.Message;
import org.indranil.learning.messenger.model.Profile;

public class DatabaseClass {

	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getAllMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getAllProfiles(){
		return profiles;
	}
}
