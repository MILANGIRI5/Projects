/**
 * 
 */
package org.milan.sbrest.writer;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Milan
 *
 */
public class TextFileWriter {

	private String reconcilFileName = null;
	private final String FILE_PREFIX_NAME = "CF_AH_LetterRecon_";
	private final String FILE_EXTN = ".txt";
	String dateTimeValue = dateAndTime();

	// Getting the date and time for the file name
	public String dateAndTime() {
		System.out.println("Calling dateAndTime method");
		String dateAndTime;
		// getting the local date and time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Local Date and time " + dtf.format(now));
		dateAndTime = dtf.format(now);
		return dateAndTime;
	}

	// creating the reconcil file
	public boolean createTextFile() {
		boolean result = false;
		try {
			reconcilFileName = FILE_PREFIX_NAME + dateTimeValue + FILE_EXTN;
			System.out.println("Final Name " + reconcilFileName);
			File file = new File("OutputFolder/" + reconcilFileName);
			FileWriter fileWriter = new FileWriter(file, false); // True = Append to file, false = Overwrite
//			int i = 1;
//			StudentVO studentVO = new StudentVO();
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Id ");
//			studentVO.setId(scanner.nextInt());
//			System.out.println("Name ");
//			studentVO.setName(scanner.next());
//			System.out.println("Salary ");
//			studentVO.setSalary(scanner.nextInt());
//			fileWriter.write("\t");
//			while (i <= 3) {
//				fileWriter.write(studentVO.getId());
//				fileWriter.write("\t");
//				fileWriter.write(studentVO.getName());
//				fileWriter.write("\t");
//				fileWriter.write(studentVO.getSalary());
//				fileWriter.write("\r\n");
//				i++;
//			}
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
}
