package org.milan.sbrest;

import java.io.IOException;

import org.milan.sbrest.controller.FolderCreateController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFolderCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFolderCreationApplication.class, args);
		System.out.println("Main Class");
		FolderCreateController controller = new FolderCreateController();
		try {
			boolean finalResult = controller.createFolder("YES");
			System.out.println("Result-----" + finalResult);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
