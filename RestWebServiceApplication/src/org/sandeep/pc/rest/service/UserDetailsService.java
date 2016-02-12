package org.sandeep.pc.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sandeep.pc.rest.exception.DataNotFoundException;
import org.sandeep.pc.rest.model.UserDetails;

public class UserDetailsService {

	Map<Long, UserDetails> list;

	public UserDetailsService() {
		list = new HashMap<>();
		list.put(1l, new UserDetails(101, "firstName1", "lastName1"));
		list.put(2l, new UserDetails(102, "firstName2", "lastName2"));

	}

	public List<UserDetails> getUserDetails() {
		return new ArrayList<UserDetails>(list.values());
	}

	public UserDetails getUserDetails(long id) {
		UserDetails userDetails = list.get(id);
		if (userDetails == null){
			throw new DataNotFoundException("Errror Data not found");
		}
			return userDetails;
	}
}
