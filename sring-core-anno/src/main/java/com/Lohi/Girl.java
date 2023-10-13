package com.Lohi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gi")
public class Girl {

	
	@Autowired
	IceCream ic;
}
