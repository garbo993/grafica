/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.BasicStroke;
import java.awt.Color;
 
import javax.swing.JFrame;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
 
public class grafico
{
 
    public static void main(String[] args) {
        
        Insercion i = new Insercion();
        burbuja b =new burbuja();
        seleccion s = new seleccion();
        QuickSort q = new QuickSort();
        RadixSort r = new RadixSort();
        Seleccion_Binaria  SB =new  Seleccion_Binaria();
        
        
        XYSeries I = new XYSeries("Insercion");
        XYSeries B = new XYSeries("Burbuja");
        XYSeries S = new XYSeries("Seleccion");
        XYSeries R = new XYSeries("Radix Sort");
        XYSeries SBI = new XYSeries("Seleccion Binaria");
        XYSeries Q = new XYSeries("Quicksort");
        
        
        
        
        for(int n=1;n<20000;n++){
            /*I.add(n,i.insercion(n));
            B.add(n,b.burbuja(n));
            S.add(n,s.seleccion(n));
            Q.add(n,q.clasificar(n));
            R.add(n,r.RadixSort(n));*/
            SBI.add(n,SB.SeleccionBinaria(n));
        }
 
      
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(SBI);
        /*dataset.addSeries(Q);
        dataset.addSeries(I);
        dataset.addSeries(S);
        dataset.addSeries(B);
        dataset.addSeries(R);*/
      
 
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "efectividad de los metodos ", 
                "N", 
                "OE", 
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
 
        
        XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
       
        
        /*renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2, Color.GREEN);
        renderer.setSeriesPaint(3, Color.WHITE);
        renderer.setSeriesPaint(4, Color.YELLOW);
        
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
        renderer.setSeriesStroke(3, new BasicStroke(1.0f));
        renderer.setSeriesStroke(4, new BasicStroke(0.0f));*/
       
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart);
 
        // Crea la ventana donde aparece la grafica
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ventana.add(panel);
 
    }
 
}