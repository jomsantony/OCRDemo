package com.ocr.demo;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.asprise.util.ocr.OCR;
import com.asprise.util.ui.JImageFileChooser;

public class OCRTest {
    public static void main(String[] args) throws IOException {
        
 
    
    	JFileChooser fc = new JImageFileChooser();
    		
    	fc.addChoosableFileFilter(JImageFileChooser.getImageFileFilter());
    	int returnVal = fc.showDialog(null,"ICUAS-OCR DETECTION ");
    	 File file = null;  
            if (returnVal == JFileChooser.APPROVE_OPTION)  
    	     {
            	
            	file = fc.getSelectedFile(); 
    	        BufferedImage image = ImageIO.read(file);
    	        	       
		        //BufferedImage ecgimage,spo2image;
		        //ecgimage = image.getSubimage(212,3,36,27);
		        //spo2image=image.getSubimage(215, 52, 31, 26);
		        //String ecg = new OCR().recognizeCharacters(ecgimage);
		        //String spO2= new OCR().recognizeCharacters(spo2image);
    	        
    	        String result=new OCR().recognizeCharacters(image);
    	        
    	        
    	        
    	        
    	        
    	        
    	        
    	        
		        
		       
		       /* System.out.println("\n::PULSE RATE::"+ecg.substring(196)+"bpm" +
		        		" \n------------------------ " +
		        		"\n::SPO2::"+spO2.substring(196)+"%" +
		        		"\n----------------------");*/
		    	       
    	        
		       /* JFrame frame = new JFrame("OCR-RESULTS");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(500, 500);
		        JLabel emptyLabel = new JLabel("OCR RESULTS");
		        JTextField ocrtext=new JTextField("results are::::PULSE RATE::"+ecg.substring(196)+"bpm" +
		        		" \n------------------------ " +
		        		"\n::SPO2::"+sp02.substring(196)+"%" +
		        		"\n----------------------");
		        emptyLabel.setPreferredSize(new Dimension(175, 100));
		        frame.getContentPane().add(emptyLabel, BorderLayout.NORTH);
		        frame.getContentPane().add(ocrtext, BorderLayout.CENTER);
		                //Display the window.
		        frame.pack();
		        frame.setVisible(true);  */
        
        
		        JFrame frame = new JFrame("ICUAS-OCR DETECTION");  
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        //JLabel ocrLabel = new JLabel("OCR RESULTS");
		        JLabel ocrResultLbl=new JLabel("RESULTS");
		        //JLabel ocrPulseLabel = new JLabel("PUSERATE");
		        //JLabel ocrSPLabel = new JLabel("SPO2");
		        
		        JTextArea ocrResultText=new JTextArea(result.substring(196)+"bpm");
		        
		        //JTextField ocrPulseText=new JTextField(ecg.substring(196)+"bpm");
		        //JTextField ocrSPText=new JTextField(spO2.substring(196)+"%");
		        	
		        
		        JPanel panel = new JPanel();  
		        ImageIcon imgOCR = new ImageIcon(image); 
		        JLabel imgLbl=new JLabel(imgOCR);
		        imgLbl.setSize(300,300);
		        panel.add(imgLbl);
		        panel.add(ocrResultLbl);
		        panel.add(ocrResultText);
		        //panel.add(ocrLabel);
		        //panel.add(ocrPulseLabel);
		        //panel.add(ocrPulseText);
		        //panel.add(ocrSPLabel);
		        //panel.add(ocrSPText);
		        frame.getContentPane().add(panel);  
		        frame.setSize(300, 300);  
		        frame.setVisible(true);  
    	        
    	 }
    	        
     }
}
