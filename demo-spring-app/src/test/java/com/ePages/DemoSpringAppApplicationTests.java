package com.ePages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ePages.DemoSpringAppApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoSpringAppApplication.class)
@WebAppConfiguration
public class DemoSpringAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
