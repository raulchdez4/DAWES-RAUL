package com.raul.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaControler {
	
	@RequestMapping(value="hola")
	public String Hola() {
		return "saludo";
	}

}
