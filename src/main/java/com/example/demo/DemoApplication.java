package com.example.demo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Paths;

import static com.google.zxing.BarcodeFormat.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	public static void main(String[] args) throws WriterException, IOException {
//		String data = "hello word";
//		String path = "C:/Users/TASFA/Documents/projet/java/demo/qr.jpg";
//		BitMatrix matrix = new MultiFormatWriter().encode(data, QR_CODE, 500, 500);
//		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
//
//	}
}
