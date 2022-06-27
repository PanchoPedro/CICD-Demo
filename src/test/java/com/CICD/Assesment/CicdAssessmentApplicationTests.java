package com.CICD.Assesment;

import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ExtendedModelMap;


import com.CICD.Assesment.controller.CICDController;

@SpringBootTest
class CicdAssessmentApplicationTests {
	

	@Test
	void contextontrollerTest() {
		CICDController junit = new CICDController();
		String result = junit.cicd(new ExtendedModelMap());
		assertEquals("welcome1",result);
	}

}
