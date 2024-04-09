/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.awt.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * Assuming jLabel1 is a component you want to print
 * Make sure to replace 'slipgaji' with the actual class name if needed
 */
class PJ {

    private JLabel jLabel1; // Assuming jLabel1 is a member variable of your class

    public void print() {
        try {
            // Assuming jLabel1 is a component you want to print
            PrintUtilities.printComponent(jLabel1);
        } catch (PrinterException ex) {
            Logger.getLogger(PJ.class.getName()).log(Level.SEVERE, "Error during printing", ex);
            JOptionPane.showMessageDialog(null, "Error during printing:\n" + ex.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Create a utility class for printing components
    static class PrintUtilities {

        public static void printComponent(Component component) throws PrinterException {
            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setJobName("Print Component");

            pj.setPrintable((Graphics g, PageFormat pf, int pageIndex) -> {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) g;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                disableDoubleBuffering(component);
                component.paint(g2);
                enableDoubleBuffering(component);
                return Printable.PAGE_EXISTS;
            });

            if (pj.printDialog()) {
                try {
                    pj.print();
                } catch (PrinterException e) {
                    throw new PrinterException("Error during printing");
                }
            }
        }

        public static void disableDoubleBuffering(Component c) {
            RepaintManager currentManager = RepaintManager.currentManager(c);
            currentManager.setDoubleBufferingEnabled(false);
        }

        public static void enableDoubleBuffering(Component c) {
            RepaintManager currentManager = RepaintManager.currentManager(c);
            currentManager.setDoubleBufferingEnabled(true);
        }
    }
}

