package cc.iluki.base.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHandlingController {

	@ResponseStatus(value=HttpStatus.CONFLICT,reason="Data integrity violation")
	//@ExceptionHandler(DataIntegrityViolationException.class)
	public void conflict(){
		
	}
}
