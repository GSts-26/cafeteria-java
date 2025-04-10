package Reportes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;

public class metodoTxt {

    public void exportarTabla(JTable tabla, String ruta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            TableModel modelo = tabla.getModel();

            for (int i = 0; i < modelo.getColumnCount(); i++) {
                bw.write(modelo.getColumnName(i) + "\t");
            }
            bw.newLine();

            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    Object valorcelda = modelo.getValueAt(i, j);
                    bw.write((valorcelda != null ? valorcelda.toString() : "") + "\t\t");
                }
                bw.newLine();
            }
            System.out.println("Archivo exportado exitosamente" + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportarJTextArea(JTextArea textArea, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write(textArea.getText()); // Obtiene el texto del JTextArea y lo escribe en el archivo
            System.out.println("Archivo guardado exitosamente en: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
