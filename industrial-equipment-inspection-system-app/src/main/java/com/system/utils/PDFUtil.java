/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.system.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.*;


import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;

/**
 *
 * @author tapas
 */
public class PDFUtil {
    public static void generatePDF(Component component, String header, String reportName, ResultSet rs){
        try {
            String fileName = reportName+"_"+Utils.sdf.format(new Date())+".pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc,
                    new FileOutputStream("reports/"+fileName));
            doc.open();

            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24);
            Paragraph title = new Paragraph(header, titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);
            
            doc.add(new Paragraph("\n\n")); 
            
            PdfPTable table = new PdfPTable(rs.getMetaData().getColumnCount());
            addTableHeader(table, rs);
            addRows(table, rs);
            
            doc.add(table);
            doc.close();
            rs.close();
            openPDF(fileName);
//            Utils.showDialog(component, "PDF: "+fileName+" generated successfully...", null);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            Utils.showDialog(component, null, "Error while generating PDF :(");
        }
    }
    
    static void addTableHeader(PdfPTable table, ResultSet rs){
        try {
            int colCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                table.addCell(new PdfPCell(new Phrase(rs.getMetaData()
                        .getColumnName(i))));
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void addRows(PdfPTable table, ResultSet resultSet) throws Exception {
        while (resultSet.next()) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                table.addCell(new PdfPCell(new Phrase(resultSet.getString(columnIndex))));
            }
        }
    }

    private static void openPDF(String fileName) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Get the default system desktop
                Desktop desktop = Desktop.getDesktop();

                // Open the generated PDF file
                desktop.open(new java.io.File("reports/"+fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    
}
