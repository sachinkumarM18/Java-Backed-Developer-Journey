package com.irctc.pnr.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PNRController {

	@GetMapping("/checkPNR") // Action Name
	@ResponseBody
	public String checkPNR() {
		System.out.println("PNR COntroller.....");
		return "PNR Check Done";
	}
	
	@GetMapping("/validateCaptcha") // Action Name
	@ResponseBody
	public String captch() {
		System.out.println("PNR COntroller().captcha ....");
		return "Captcha Validation done";
	}
}
