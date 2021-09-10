
import Model.Conexion;
import Screens.AltaDocenteScreen;
import Screens.InicioScreen;
import Screens.AltaDatosProfecionalesScreen;
import Screens.ConsultaDocenteScreen;
import Screens.ConsultaPerfilScreen;
import Screens.AltaAlumnosScreen;
import Screens.MateriasAndCarrerasSecreen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author alejandrovelasco
 */
public class MainForm extends javax.swing.JFrame {

    InicioScreen inicioScreen = new InicioScreen();
    AltaDocenteScreen altaDocenteScreen = new AltaDocenteScreen();
    AltaDatosProfecionalesScreen altaDatosProfecionalesScreen = new AltaDatosProfecionalesScreen();
    ConsultaDocenteScreen consultaDocenteScreen = new ConsultaDocenteScreen();
    ConsultaPerfilScreen consultaPerfilScreen = new ConsultaPerfilScreen();
    AltaAlumnosScreen altaAlumnos = new AltaAlumnosScreen();
    MateriasAndCarrerasSecreen materiasAndCarrerasSecreen = new MateriasAndCarrerasSecreen();
    
    private javax.swing.JMenu mAlumnos;
    private javax.swing.JMenuItem mMaterias;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu datosM;
    private javax.swing.JMenu inicioM;
    private javax.swing.JMenu consultM;
    private javax.swing.JMenuItem consultaDocenteMenu;
    private javax.swing.JMenuItem ConsultaPerfilMenu;
    private javax.swing.JMenuItem altaAlumnosMOption;
    private javax.swing.JMenuItem altaDatosProfecionales;
    private javax.swing.JMenuItem altaDocentes;
    

    public MainForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Menu Variables
        menuBar = new javax.swing.JMenuBar();
        inicioM = new javax.swing.JMenu();
        datosM = new javax.swing.JMenu();
        altaDocentes = new javax.swing.JMenuItem();
        altaDatosProfecionales = new javax.swing.JMenuItem();
        consultM = new javax.swing.JMenu();
        consultaDocenteMenu = new javax.swing.JMenuItem();
        ConsultaPerfilMenu = new javax.swing.JMenuItem();
        mAlumnos = new javax.swing.JMenu();
        altaAlumnosMOption = new javax.swing.JMenuItem();
        mMaterias = new javax.swing.JMenuItem();
        
        //Menu
        menuBar.setPreferredSize(new java.awt.Dimension(75, 44));
        menuBar.setSize(new java.awt.Dimension(75, 44));
        menuBar.setVisible(false);

        inicioM.setText("Inicio");
        inicioM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMMouseClicked(evt);
            }
        });
        menuBar.add(inicioM);

        datosM.setText("Datos Personales");

        altaDocentes.setText("Alta de Docente");
        altaDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaDocentesActionPerformed(evt);
            }
        });
        datosM.add(altaDocentes);

        altaDatosProfecionales.setText("Alta de Datos Profecionales");
        altaDatosProfecionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaDatosProfecionalesActionPerformed(evt);
            }
        });
        datosM.add(altaDatosProfecionales);

        menuBar.add(datosM);

        consultM.setText("Consultas");

        consultaDocenteMenu.setText("Consulta Docente");
        consultaDocenteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDocenteMenuActionPerformed(evt);
            }
        });
        consultM.add(consultaDocenteMenu);

        ConsultaPerfilMenu.setText("Consuta Perfil");
        ConsultaPerfilMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaPerfilMenuActionPerformed(evt);
            }
        });
        consultM.add(ConsultaPerfilMenu);

        menuBar.add(consultM);

        mAlumnos.setText("Alumnos");

        altaAlumnosMOption.setText("Gestion estudiantes");
        altaAlumnosMOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaAlumnosMOptionActionPerformed(evt);
            }
        });
        mAlumnos.add(altaAlumnosMOption);

        mMaterias.setText("Materias");
        mMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasActionPerformed(evt);
            }
        });
        mAlumnos.add(mMaterias);

        menuBar.add(mAlumnos);
        
        Color color = new Color(hex("000080"));
        this.setBackground(color);
        
        barra.setLayout(new BorderLayout());
        barra.add(menuBar,BorderLayout.NORTH);
        titulo.setBackground(color);
        lateralPanel.setBackground(color);
        menuBar.setVisible(true);
        lbTitulo.setForeground(Color.white);
        
        
        try {
            inicioM.setIcon(setIcon("/imagenes/Home.png", inicioM));
            consultM.setIcon(setIcon("/imagenes/search.png", consultM));
            datosM.setIcon(setIcon("/imagenes/teamwork.png", datosM));

            altaDocentes.setIcon(setIconItem("/imagenes/registro.png", altaDocentes));
            altaDatosProfecionales.setIcon(setIconItem("/imagenes/dataUpdate.png", altaDatosProfecionales));

            consultaDocenteMenu.setIcon(setIconItem("/imagenes/look.png", consultaDocenteMenu));
            ConsultaPerfilMenu.setIcon(setIconItem("/imagenes/look2.png", consultaDocenteMenu));

            mAlumnos.setIcon(setIcon("/imagenes/alumno.png", mAlumnos));
            altaAlumnosMOption.setIcon(setIconItem("/imagenes/login.png", altaAlumnosMOption));
            
            mMaterias.setIcon(setIconItem("/imagenes/lista.png", mMaterias));
            
            btnCerrar.setIcon(setIconButton("/imagenes/cancel.png", btnCerrar));

        } catch (Exception e) {
            System.err.println(e);
        }

        //Init visible Screens
        container.add(inicioScreen);
        inicioScreen.setVisible(true);
        altaDocenteScreen.setVisible(false);
        altaDatosProfecionalesScreen.setVisible(false);
        consultaDocenteScreen.setVisible(false);
        consultaPerfilScreen.setVisible(false);
        altaAlumnos.setVisible(false);
        materiasAndCarrerasSecreen.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lateralPanel = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad Complementaria");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        titulo.setMaximumSize(new java.awt.Dimension(32767, 44));
        titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tituloMouseDragged(evt);
            }
        });
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloMousePressed(evt);
            }
        });
        titulo.setLayout(new java.awt.BorderLayout());

        btnCerrar.setBackground(null);
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        titulo.add(btnCerrar, java.awt.BorderLayout.LINE_END);

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Actividad Complementaria");
        lbTitulo.setVerifyInputWhenFocusTarget(false);
        lbTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbTituloMouseDragged(evt);
            }
        });
        lbTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbTituloMousePressed(evt);
            }
        });
        titulo.add(lbTitulo, java.awt.BorderLayout.CENTER);
        titulo.add(lateralPanel, java.awt.BorderLayout.LINE_START);

        getContentPane().add(titulo);

        barra.setMaximumSize(new java.awt.Dimension(32767, 44));
        getContentPane().add(barra);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.BorderLayout());
        getContentPane().add(container);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed
    int xx,xy;
    private void tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMousePressed
        
    }//GEN-LAST:event_tituloMousePressed

    private void lbTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTituloMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_lbTituloMouseDragged

    private void tituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseDragged
        
    }//GEN-LAST:event_tituloMouseDragged

    private void lbTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTituloMousePressed
        xx= evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_lbTituloMousePressed

    private void mMateriasActionPerformed(java.awt.event.ActionEvent evt) {

        if (materiasAndCarrerasSecreen.isVisible()) {

        } else {
            inicioScreen.setVisible(false);
            altaDocenteScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            altaAlumnos.setVisible(false);

            container.add(materiasAndCarrerasSecreen);
            materiasAndCarrerasSecreen.setVisible(true);
        }
    }

    private void altaAlumnosMOptionActionPerformed(java.awt.event.ActionEvent evt) {
        if (altaAlumnos.isVisible()) {

        } else {
            inicioScreen.setVisible(false);
            altaDocenteScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(altaAlumnos);
            altaAlumnos.setVisible(true);
        }
    }

    private void ConsultaPerfilMenuActionPerformed(java.awt.event.ActionEvent evt) {
        if (consultaPerfilScreen.isVisible()) {

        } else {
            inicioScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            altaDocenteScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(consultaPerfilScreen);

            consultaPerfilScreen.setVisible(true);

        }
    }

    private void consultaDocenteMenuActionPerformed(java.awt.event.ActionEvent evt) {
        if (consultaDocenteScreen.isVisible()) {

        } else {
            inicioScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            altaDocenteScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(consultaDocenteScreen);
            consultaDocenteScreen.setVisible(true);
        }
    }

    private void altaDatosProfecionalesActionPerformed(java.awt.event.ActionEvent evt) {
        if (altaDatosProfecionalesScreen.isVisible()) {

        } else {
            inicioScreen.setVisible(false);
            altaDocenteScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(altaDatosProfecionalesScreen);
            altaDatosProfecionalesScreen.setVisible(true);

        }
    }

    private void altaDocentesActionPerformed(java.awt.event.ActionEvent evt) {
        if (altaDocenteScreen.isVisible()) {
            System.out.println("Estas en la ventana");
        } else {
            inicioScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(altaDocenteScreen);
            altaDocenteScreen.setVisible(true);

        }
    }

    private void inicioMMouseClicked(java.awt.event.MouseEvent evt) {
        if (inicioScreen.isVisible()) {

        } else {

            altaDocenteScreen.setVisible(false);
            altaDatosProfecionalesScreen.setVisible(false);
            consultaPerfilScreen.setVisible(false);
            consultaDocenteScreen.setVisible(false);
            altaAlumnos.setVisible(false);
            materiasAndCarrerasSecreen.setVisible(false);

            container.add(inicioScreen);
            inicioScreen.setVisible(true);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
        
        
    }

    public Icon setIcon(String url, JMenu menu) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = 24;
        int alto = 24;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }

    public Icon setIconItem(String url, JMenuItem menu) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = 24;
        int alto = 24;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }
    public Icon setIconButton(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = 24;
        int alto = 24;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));

        return icono;
    }
    private int hex( String color_hex )
    {
        return Integer.parseInt(color_hex,  16 );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel container;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables
}
