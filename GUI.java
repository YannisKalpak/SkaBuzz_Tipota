import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFDocument;



public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	
	private JList<String> listView;
	private static DefaultListModel<String> model;

    private List<String> Text;
	
	  
	
	  public GUI(){ 
		  
		  panel = new JPanel();
		  listView = new JList<String>();
		  model = new DefaultListModel<String>(); 
		  
		  
		   listView.setModel(model);
		 
		  
		    this.setContentPane(panel);
	  
		    this.setLocationRelativeTo(null);
		    this.pack();
		    
		    this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		    this.setSize(700,400);
		    this.setVisible(true);
			this.setTitle("Input");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
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
			

}