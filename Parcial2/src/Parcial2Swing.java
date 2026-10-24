
import javax.swing.*;
import java.awt.*;

public class Parcial2Swing {

    public static final double META = 500000;
    public static final double PORCENTAJE_INCREMENTO = 0.10;
    public static final double PROMEDIO_ALTO = 100000;

    public static void main(String[] args) {
        ejecutarPrograma();
    }

    public static void ejecutarPrograma() {

        JFrame ventana = new JFrame("Sistema de ventas");
        ventana.setSize(500, 550);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel(
                "Cálculo de ventas de la jornada",
                SwingConstants.CENTER
        );

        titulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        ventana.add(titulo, BorderLayout.NORTH);

        JPanel formulario = new JPanel(new BorderLayout(5, 5));

        JPanel panelCantidad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCantidad.add(new JLabel("Cantidad de pedidos:"));

        JTextField campoCantidad = new JTextField(10);
        panelCantidad.add(campoCantidad);

        formulario.add(panelCantidad, BorderLayout.NORTH);

        JTextArea campoPedidos = new JTextArea(8, 30);
        campoPedidos.setLineWrap(true);

        JScrollPane desplazamiento = new JScrollPane(campoPedidos);
        formulario.add(new JLabel("Valores de los pedidos (uno por línea):"),
                BorderLayout.CENTER);

        JPanel panelPedidos = new JPanel(new BorderLayout(5, 5));
        panelPedidos.add(desplazamiento, BorderLayout.CENTER);

        formulario.add(panelPedidos, BorderLayout.CENTER);

        JButton botonCalcular = new JButton("Calcular ventas");

        JTextArea resultados = new JTextArea(10, 30);
        resultados.setEditable(false);

        JPanel panelCentral = new JPanel(new BorderLayout(10, 10));
        panelCentral.add(formulario, BorderLayout.NORTH);
        panelCentral.add(botonCalcular, BorderLayout.CENTER);
        panelCentral.add(new JScrollPane(resultados), BorderLayout.SOUTH);

        ventana.add(panelCentral, BorderLayout.CENTER);

        botonCalcular.addActionListener(e -> {
            try {
                int cantidadPedidos = Integer.parseInt(
                        campoCantidad.getText().trim()
                );

                if (cantidadPedidos <= 0) {
                    throw new IllegalArgumentException(
                            "La cantidad debe ser mayor que cero."
                    );
                }

                String[] valores = campoPedidos.getText().trim().split("\\s+");

                if (valores.length != cantidadPedidos) {
                    throw new IllegalArgumentException(
                            "Debes ingresar exactamente "
                                    + cantidadPedidos + " pedidos."
                    );
                }

                double totalVentas = 0;

                for (int i = 0; i < cantidadPedidos; i++) {
                    double valorPedido = Double.parseDouble(valores[i]);

                    if (valorPedido <= 0) {
                        throw new IllegalArgumentException(
                                "Todos los pedidos deben ser mayores que cero."
                        );
                    }

                    totalVentas += valorPedido;
                }

                double promedioVentas = calcularPromedioVentas(
                        totalVentas, cantidadPedidos
                );

                double cumplimientoVentas =
                        calcularCumplimientoVentas(totalVentas);

                double incrementoVentas =
                        calcularIncrementoVentas(totalVentas);

                double ventasProyectadas =
                        calcularVentasProyectadas(
                                totalVentas, incrementoVentas
                        );

                String resultadoJornada = calcularResultadoJornada(
                        totalVentas, promedioVentas
                );

                mostrarResultados(
                        resultados, cantidadPedidos, totalVentas,
                        promedioVentas, cumplimientoVentas,
                        incrementoVentas, ventasProyectadas,
                        resultadoJornada
                );

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        ventana,
                        "Ingresa números válidos.",
                        "Error de datos",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        ventana,
                        ex.getMessage(),
                        "Error de datos",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        ventana.setVisible(true);
    }

    public static double calcularPromedioVentas(
            double totalVentas, int cantidadPedidos) {

        double promedioVentas = totalVentas / cantidadPedidos;
        return promedioVentas;
    }

    public static double calcularCumplimientoVentas(double totalVentas) {

        double cumplimientoVentas = (totalVentas / META) * 100;
        return cumplimientoVentas;
    }

    public static double calcularIncrementoVentas(double totalVentas) {

        double incrementoVentas = totalVentas * PORCENTAJE_INCREMENTO;
        return incrementoVentas;
    }

    public static double calcularVentasProyectadas(
            double totalVentas, double incrementoVentas) {

        double ventasProyectadas = totalVentas + incrementoVentas;
        return ventasProyectadas;
    }

    public static String calcularResultadoJornada(
            double totalVentas, double promedioVentas) {

        String resultadoJornada;

        if (totalVentas >= META) {
            if (promedioVentas >= PROMEDIO_ALTO) {
                resultadoJornada = "Ventas con alto promedio por pedido";
            } else {
                resultadoJornada = "Ventas con bajo promedio por pedido";
            }
        } else {
            resultadoJornada = "Ventas por debajo de la meta";
        }

        return resultadoJornada;
    }

    public static void mostrarResultados(
            JTextArea resultados,
            int cantidadPedidos,
            double totalVentas,
            double promedioVentas,
            double cumplimientoVentas,
            double incrementoVentas,
            double ventasProyectadas,
            String resultadoJornada) {

        resultados.setText(String.format(
                "Cantidad de pedidos: %d%n"
                        + "Total de ventas: $%,.2f%n"
                        + "Promedio por pedido: $%,.2f%n"
                        + "Cumplimiento de la meta: %.2f%%%n"
                        + "Incremento del 10%%: $%,.2f%n"
                        + "Ventas proyectadas: $%,.2f%n"
                        + "Resultado de la jornada: %s",
                cantidadPedidos,
                totalVentas,
                promedioVentas,
                cumplimientoVentas,
                incrementoVentas,
                ventasProyectadas,
                resultadoJornada
        ));
    }
}
