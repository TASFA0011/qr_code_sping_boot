package com.example.demo.utils;

import com.example.demo.model.CouponModel;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

import static com.google.zxing.BarcodeFormat.QR_CODE;

public class MyQrCode {

    public static  void generateQr(CouponModel couponModel) throws IOException, WriterException {
        String data = formatCouponToString(couponModel);

		String path = "C:/Users/TASFA/Documents/projet/java/demo/qr"+couponModel.getReference()+".jpg";
		BitMatrix matrix = new MultiFormatWriter().encode(data, QR_CODE, 500, 500);
		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
    }

    public static String formatCouponToString(CouponModel couponModel){
        String data = couponModel.getName()+ "," + couponModel.getQuantity()+ "," + couponModel.getReference();
        return data;
    }

    public static  String[] formatStringToCoupon(String data){
        return data.split(",");
    }
}
