/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.reportes;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfString;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jefte
 */
public class PdfHandler {
    public static void pdf(){
    // step 1: creation of a document-object
        Document document = new Document();
        try {
            final PdfWriter instance = PdfWriter.getInstance(document, new FileOutputStream("./prueba.pdf"));

            document.open();
            instance.getInfo().put(PdfName.CREATOR, new PdfString(Document.getVersion()));

            document.add(new Paragraph("Alex culon"));
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }

        System.out.println("Documento generado");
        document.close();
    }

}
