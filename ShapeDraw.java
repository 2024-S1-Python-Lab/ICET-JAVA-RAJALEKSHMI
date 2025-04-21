import java.awt.*;
import java.awt.event.*;

public class ShapeDraw extends Frame implements ItemListener {
    Choice shapeChoice;
    Canvas canvas;

    public ShapeDraw() {
        setTitle("Shape Draw");
        setSize(500, 500);
        setLayout(new BorderLayout());

        // Choice box for selecting shape
        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addItemListener(this); 
        add(shapeChoice, BorderLayout.NORTH);  // Use `add()` instead of `Add()`

        // Canvas to draw shapes
        canvas = new Canvas() {
            public void paint(Graphics g) {
                drawShape(g, shapeChoice.getSelectedItem());
            }
        };
        canvas.setBackground(Color.WHITE);
        add(canvas, BorderLayout.CENTER); 

        // Window closing behavior
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();  // Close the window
            }
        });

        setVisible(true);
    }

    // This method is called when the shape selection is changed
    public void itemStateChanged(ItemEvent e) {
        canvas.repaint();  // Redraw the canvas
    }

    // Method to draw shapes based on the selected choice
    private void drawShape(Graphics g, String shape) {
        g.setColor(Color.BLUE);
        switch (shape) {
            case "Rectangle":
                g.drawRect(100, 100, 200, 100);  // Draw rectangle
                break;
            case "Triangle":
                int[] x = {150, 250, 350};
                int[] y = {200, 100, 200};
                g.drawPolygon(x, y, 3);  // Draw triangle
                break;
            case "Square":
                g.drawRect(150, 100, 100, 100);  // Draw square
                break;
            case "Circle":
                g.drawOval(150, 100, 100, 100);  // Draw circle
                break;
        }
    }

    public static void main(String[] args) {
        new ShapeDraw();  // Start the application
    }
}
