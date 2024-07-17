/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.reportes;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfString;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jefte
 */
public class PdfHandler {

    public static void pdf(int reporte) {
        // step 1: creation of a document-object
        Document document = new Document();

        switch (reporte) {
            case 1:
                JFileChooser jFileChoose = new JFileChooser();
                int opcion = jFileChoose.showSaveDialog(null);
                if (opcion == JFileChooser.APPROVE_OPTION) {
                    try {

                        final PdfWriter instance = PdfWriter.getInstance(document, new FileOutputStream(jFileChoose.getSelectedFile().getPath() + ".pdf"));

                        document.open();
                        instance.getInfo().put(PdfName.CREATOR, new PdfString(Document.getVersion()));

                        PdfPTable tb = new PdfPTable(3);

                        document.add(new Paragraph("Reporte Salud"));
                        tb.setHeaderRows(3);
                        
                        tb.addCell("Chequeo");
                        tb.addCell("Vacuna");
                        tb.addCell("Veterinario");
                        tb.addCell("Fecha");

                        document.add(tb);
                        JOptionPane.showMessageDialog(null, "Documento generado exitosamente!");
                        document.close();
                    } catch (DocumentException | IOException de) {
                        System.err.println(de.getMessage());
                    }
                }

        }

    }

}
