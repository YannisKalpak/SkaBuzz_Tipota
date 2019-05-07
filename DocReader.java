import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class DocReader{

	public static void readDocFile(String fileName) {

		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			HWPFDocument doc = new HWPFDocument(fis);

			WordExtractor we = new WordExtractor(doc);

			String[] paragraphs = we.getParagraphText();

			for (String para : paragraphs) {
				System.out.println(para.toString());
			   
				we.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readDocxFile(String fileName) {

		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();

			for (XWPFParagraph para : paragraphs) {
				System.out.println(para.getText());
			  
				document.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 public static void main(String[] args) {

		readDocxFile("C:\\Users\\User\\Documents\\Εργασιες ΠΑΜΑΚ\\Ομαδικη Εργασια Τεχνολια Λογισμικου\\Test.docx");

		readDocFile("C:\\Users\\User\\Documents\\Εργασιες ΠΑΜΑΚ\\Ομαδικη Εργασια Τεχνολια Λογισμικου\\Test.doc");
        
	 }	   
}
