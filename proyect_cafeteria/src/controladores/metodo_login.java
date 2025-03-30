package controladores;

import javax.swing.JOptionPane;
import modelos.Bd.conexion;
import modelos.DAO.DaoLogin;
import modelos.Entidades.usuario;
import vistas.inicio;
import vistas.login;

public class metodo_login {

    private final login vista; //vista del panel
    private DaoLogin loginDAO;
    inicio ventanaprincipal;

    public metodo_login(login login) {
        this.vista = login;
        this.loginDAO = new DaoLogin();
    }

    usuario usuariologeado;
    
    public void cargarinterfaz(){
    ventanaprincipal = new inicio();
    }

    public void acceso() {
        usuariologeado = loginDAO.userselect(vista.txt_usuario.getText().trim(), vista.txt_clave.getText().trim());
        if (usuariologeado != null) {
            String rol = usuariologeado.getRol();
            switch (rol) {
                case "empleado":
                    JOptionPane.showMessageDialog(null, "Ingresando como Empleado");
                    ventanaprincipal.setVisible(true);
                    abrirVentanaPrincipal();
                    break;
                case "administrador":
                    JOptionPane.showMessageDialog(null, "Ingresando como Administrador");
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

    private void abrirVentanaPrincipal() {
        vista.dispose();
        ventanaprincipal.obteneruser(this.usuariologeado);
        ventanaprincipal.setVisible(true);
    }
}
