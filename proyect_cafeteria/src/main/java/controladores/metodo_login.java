package controladores;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Bd.conexion;
import modelos.DAO.DaoLogin;
import modelos.Entidades.usuario;
import vistas.inicio;
import vistas.inicio_empleado;
import vistas.login;

public class metodo_login {

    private final login vista; //vista del panel
    private DaoLogin loginDAO;
    inicio ventanaprincipal;
    inicio_empleado ventanaempleado;

    public metodo_login(login login) {
        this.vista = login;
        this.loginDAO = new DaoLogin();
    }

    public static usuario usuariologeado;

    public void cargarinterfaz() {
        ventanaprincipal = new inicio();
        ventanaempleado = new inicio_empleado();
    }

    public void acceso() {
        usuariologeado = loginDAO.userselect(vista.txt_usuario.getText().trim(), vista.txt_clave.getText().trim());
        if (usuariologeado != null) {
            String rol = usuariologeado.getRol();
            switch (rol) {
                case "empleado":
                    new Thread() {
                        public void run() {
                            ventanaempleado.pedido();
                        }
                    }.start();
                    JOptionPane.showMessageDialog(null, "Ingresando como Empleado");
                    vista.setVisible(false);
                    ventanaempleado.obteneruser(this.usuariologeado);
                    ventanaempleado.setVisible(true);
                    break;
                case "administrador":
                    new Thread() {
                        public void run() {
                            ventanaprincipal.pedido();
                        }
                    }.start();
                    JOptionPane.showMessageDialog(null, "Ingresando como Administrador");
                    abrirVentanaPrincipal(ventanaprincipal);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Rol no reconocido",
                            "Error de autenticación",
                            JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Credenciales incorrectas",
                    "Error de autenticación",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirVentanaPrincipal(JFrame si) {
        vista.dispose();

        ventanaprincipal.obteneruser(this.usuariologeado);
        ventanaprincipal.setVisible(true);
    }
}
