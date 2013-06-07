package com.ocr.demo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.asprise.util.ocr.OCR;

public class OCRTest {
    public static void main(String[] args) throws IOException {
    	
    	System.out.println("OPTICAL CHARACTOR RECOGNITION FOR ICUAS");
    	//System.out.println(System.getProperty("java.library.path"));
    	
        BufferedImage image = ImageIO.read(new File("ecg.jpg"));
        BufferedImage ecgimage,spo2image;
        ecgimage = image.getSubimage(212,3,36,27);
        spo2image=image.getSubimage(215, 52, 31, 26);
        String ecg = new OCR().recognizeCharacters(ecgimage);
        String sp02= new OCR().recognizeCharacters(spo2image);
        //ecg.substring(20);
        System.out.println("\n::PULSE RATE::"+ecg.substring(196)+"bpm" +
        		" \n------------------------ " +
        		"\n::SPO2::"+sp02.substring(196)+"%" +
        		"\n----------------------");
    }
}
