package com.spring.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourseNotFoundException extends RuntimeException {
	 	
		public ResourseNotFoundException(String Massage) {
				super(Massage);
		}
		
		public ResourseNotFoundException(String massage,Throwable throwable) {
					super(massage,throwable);
		}
}
