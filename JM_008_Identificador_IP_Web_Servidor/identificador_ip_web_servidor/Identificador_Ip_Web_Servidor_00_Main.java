/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 */
package identificador_ip_web_servidor;

import br.com.jmary.home.Home;
import br.com.jmary.home.imagens.Imagens_Internas;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import identificador_ip_web_servidor_menu_e_submenu.Identificador_Ip_Web_Servidor_Menu_01;
import identificador_ip_web_servidor_menu_e_submenu.Identificador_Ip_Web_Servidor_Submenu_01;
 
/** 
 *
 * @author NewUser
 */
public class Identificador_Ip_Web_Servidor_00_Main extends JApplet {
    
    static JFrame frame;

    Home Home;
      
    @Override
    public void init() {

        Home = new Home( frame );
        
        add( Home ); //BorderLayout.CENTER   ---------
        
        Home.adicionar_Menu(new Identificador_Ip_Web_Servidor_Menu_01( Home ).Barra_Menu );
        Home.adicionar_SubMenu(new Identificador_Ip_Web_Servidor_Submenu_01( Home ) );
        //Home.adicionar_Tela_De_Trabalho( "Login no Sistema", new Login_Do_Sistema(Home) );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {}
                
                frame = new JFrame( "JMARYSYSTEMS - Suporte: 85 9.9139.2441", null );                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new Identificador_Ip_Web_Servidor_00_Main();
        applet.init();
                
        frame.setContentPane( applet.getContentPane() );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setIconImage(null);
                
        iconeDoPrograma( frame );
        telaCheia ( frame );

        applet.start();
            }
        });
    }
    
    public static void iniciarJFrame(){
        main(new String [2]);
    }
    
    private static void telaCheia( JFrame frame ) {
        try{ frame.setUndecorated(true);                                    } catch( Exception e ){}
        try{ frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME); } catch( Exception e ){}
        try{ frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                 } catch( Exception e ){}
    }
    
    /* Início Setando O Ícone do Programa  */
    private static void iconeDoPrograma( JFrame frame ) {     
        try{ 
            BufferedImage bufImg = ImageIO.read(Imagens_Internas.class.getResource("jmol.png") );  
                        
            frame.setIconImage( bufImg ); //bi
        }catch( IOException e ){}      
    }
    /* Fim Setando O Ícone do Programa  */

    
}
