/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.reportes;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import redpoll.chequeos.GestionChequeo;
import redpoll.produccion.GestionProduccion;
import redpoll.produccion.Produccion;

/**
 *
 * @author jefte
 */
//Clase para generar el pdf de chequeos
public class PdfProduccion extends PdfHandler {

    public void pdf() {

        Document document = new Document();

        JFileChooser jFileChoose = new JFileChooser();
        int opcion = jFileChoose.showSaveDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {

                final PdfWriter instance = PdfWriter.getInstance(document, new FileOutputStream(jFileChoose.getSelectedFile().getPath() + ".pdf"));
                //Se genera el documento
                document.open();
                //Cargamos la imagen en esta ruta de aca
                Image png = Image.getInstance("src/redpoll/reportes/img.png");
                png.setAlt("Logo redpoll");
                png.setWidthPercentage(3);
                //Creamos el encabezado
                Font fontTitle = new Font(Font.TIMES_ROMAN, 18, Font.BOLD);
                Paragraph title = new Paragraph("Reporte Produccion", fontTitle);
                title.setAlignment(Element.ALIGN_CENTER);
                png.setAlignment(Element.ALIGN_CENTER);
                document.add(png);
                document.add(title);

                document.add(new Paragraph(" "));

                //Creamos la tabla y sus filas
                PdfPTable tb = new PdfPTable(4);
                tb.setHeaderRows(GestionChequeo.getInstance().getInfoChequeo().size());
                //Ponemos la fuente Times Roman pal header
                Font fontHeader = new Font(Font.TIMES_ROMAN, 12, Font.BOLD);
                PdfPCell celda;

                //Se define la columna chequeo y sus props
                celda = new PdfPCell(new Phrase("ID Animal", fontHeader));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setBackgroundColor(Color.LIGHT_GRAY);
                tb.addCell(celda);
                //Se define la columna Vacuna y sus props
                celda = new PdfPCell(new Phrase("Produccion Total", fontHeader));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setBackgroundColor(Color.LIGHT_GRAY);
                tb.addCell(celda);
                //Se define la columna Veterinario y sus props
                celda = new PdfPCell(new Phrase("Fecha", fontHeader));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setBackgroundColor(Color.LIGHT_GRAY);
                tb.addCell(celda);

  
                //Se traen los datos y se unen en una sola tabla
                for (Produccion produccion : GestionProduccion.getInstance().getProducciones().values()) {
                    tb.addCell("a");
                    tb.addCell(String.valueOf(produccion.getTotal()));
                    tb.addCell(String.valueOf(produccion.getFecha()));
                    
                }

                //Se agrega la tabla al documento
                document.add(tb);
                //Y finalmente se guarda el archivo y se notifica al usuario
                document.close();
                JOptionPane.showMessageDialog(null, "Documento generado exitosamente!", "Exito!", JOptionPane.INFORMATION_MESSAGE);

            } catch (DocumentException | IOException de) {
                 //Arroja una exepcion en caso de que algo falle
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al generar el pdf. \n" + de.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
