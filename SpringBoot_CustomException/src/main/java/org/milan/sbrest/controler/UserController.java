package org.milan.sbrest.controler;

import org.milan.sbrest.exception.InvalidUserException;
import org.milan.sbrest.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/checkuser/{id}")
	public ResponseEntity<UserVO> getUserDetails(@PathVariable("id") int id) throws InvalidUserException {

		logger.info("info Check");
		logger.warn("warn Check");
		logger.error("error Check");
		logger.debug("debug Check");
		System.out.println("Entered Id is - " + id);
		if (id == 1 || id == 12 || id == 18) {
			UserVO userVO = new UserVO(798760, "Milan");
			return new ResponseEntity<UserVO>(userVO, HttpStatus.OK);
		} else {
			throw new InvalidUserException("Invalid User id : " + id);
		}
	}
}
