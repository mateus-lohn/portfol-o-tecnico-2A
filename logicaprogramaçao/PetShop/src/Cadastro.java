/ *
 * Para alterar este cabeçalho de licença, escolha Cabeçalhos de licença em Propriedades do projeto.
* Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
 * e abra o modelo no editor.
 * /
pacote  petshop ;

import  java.util.ArrayList ;
import  javax.swing.JOptionPane ;

/ **
 *
* @author SESI_SENAI
 * /
public  class  Cadastro  estende  javax.swing . JFrame {

    ArrayList < Cachorro > cachorro =  novo  ArrayList < Cachorro > ();

    / **
     * Cria novo formulário Cadastro
     * /
     Cadastro público () {
        initComponents ();
    }

    / **
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     * AVISO: NÃO modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Form Editor.
     * /
    @SuppressWarnings ( " desmarcado " )
    // <editor-fold defaultstate = "collapsed" desc = "Generated Code"> // GEN-BEGIN: initComponents
    private  void  initComponents () {

        jTextField5 =  novo  javax.swing . JTextField ();
        jLabel6 =  novo  javax.swing . JLabel ();
        jLabel1 =  novo  javax.swing . JLabel ();
        jLabel2 =  novo  javax.swing . JLabel ();
        camponome =  new  javax.swing . JTextField ();
        jLabel3 =  novo  javax.swing . JLabel ();
        campomatricula =  new  javax.swing . JTextField ();
        jLabel4 =  novo  javax.swing . JLabel ();
        campocor =  new  javax.swing . JTextField ();
        campogenero =  new  javax.swing . JTextField ();
        jLabel5 =  novo  javax.swing . JLabel ();
        campoidade =  novo  javax.swing . JTextField ();
        jLabel7 =  novo  javax.swing . JLabel ();
        campopeso =  new  javax.swing . JTextField ();
        jLabel8 =  novo  javax.swing . JLabel ();
        jLabel9 =  novo  javax.swing . JLabel ();
        camporabo =  new  javax.swing . JTextField ();
        isfocinheira =  new  javax.swing . JSlider ();
        jLabel10 =  novo  javax.swing . JLabel ();
        jLabel11 =  novo  javax.swing . JLabel ();
        jLabel12 =  novo  javax.swing . JLabel ();
        jLabel13 =  novo  javax.swing . JLabel ();
        jLabel14 =  novo  javax.swing . JLabel ();
        iscastrado =  new  javax.swing . JSlider ();
        jLabel15 =  novo  javax.swing . JLabel ();
        jButton1 =  novo  javax.swing . JButton ();
        jButton2 =  novo  javax.swing . JButton ();
        jButton3 =  novo  javax.swing . JButton ();

        jLabel6 . setText ( " Genero: " );

        setDefaultCloseOperation ( javax.swing . WindowConstants . EXIT_ON_CLOSE );

        jLabel1 . setFont ( new  java.awt . Font ( " Dialog " , 1 , 18 )); // NOI18N
        jLabel1 . setText ( " Cadastro do Pet Shop " );

        jLabel2 . setText ( " Nome: " );

        camponome . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                camponomeActionPerformed (evt);camponomeActionPerformed(evt);
            }
        });

        jLabel3 . setText ( " Matrícula: " );

        campomatricula . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                campomatriculaActionPerformed (evt);
            }
        });

        jLabel4 . setText ( " Cor da pelagem: " );

        jLabel5 . setText ( " Genero: " );

        jLabel7 . setText ( " Idade: " );

        jLabel8 . setText ( " Peso: " );

        jLabel9 . setText ( " Estilo de rabo: " );

        isfocinheira . setMaximum ( 1 );

        jLabel10 . setText ( " Focinehira: " );

        jLabel11 . setText ( " NÃO " );

        jLabel12 . setText ( " SIM " );

        jLabel13 . setText ( " Castrado: " );

        jLabel14 . setText ( " NÃO " );

        iscastrado . setMaximum ( 1 );

        jLabel15 . setText ( " SIM " );

        jButton1 . setText ( " Cadastrar " );
        jButton1 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton1ActionPerformed (evt);
            }
        });

        jButton2 . setText ( " Remover " );
        jButton2 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton2ActionPerformed (evt);
            }
        });

        jButton3 . setText ( " Listar " );
        jButton3 . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                jButton3ActionPerformed (evt);
            }
        });

        javax.swing . Layout GroupLayout =  new  javax.swing . GroupLayout (getContentPane ());
        getContentPane () . setLayout (layout);
        layout . setHorizontalGroup (
            layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 19 , 19 , 19 )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . CENTER )
                    .addComponent (jLabel10)
                    .addComponent (jLabel9)
                    .addComponent (jLabel7)
                    .addComponent (jLabel4)
                    .addComponent (jLabel2))
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 18 , 18 , 18 )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . CENTER )
                            .addComponent (camponome)
                            .addComponent (campocor)
                            .addComponent (campoidade))
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                            .addGroup (layout . createSequentialGroup ()
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . CENTER )
                                    .addComponent (jLabel3)
                                    .addComponent (jLabel5))
                                .addGap ( 18 , 18 , 18 )
                                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                                    .addComponent (campomatricula, javax.swing . GroupLayout . PREFERRED_SIZE , 84 , javax.swing . GroupLayout . PREFERRED_SIZE )
                                    .addComponent (campogenero))
                                .addGap ( 17 , 17 , 17 ))
                            .addGroup (layout . createSequentialGroup ()
                                .addGap ( 32 , 32 , 32 )
                                .addComponent (jLabel8)
                                .addGap ( 18 , 18 , 18 )
                                .addComponent (campopeso)
                                .addContainerGap ())))
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 11 , 11 , 11 )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                            .addComponent (camporabo)
                            .addGroup (layout . createSequentialGroup ()
                                .addGap ( 6 , 6 , 6 )
                                .addComponent (jLabel11)
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                                .addComponent (isfocinheira, javax.swing . GroupLayout . PREFERRED_SIZE , 47 , javax.swing . GroupLayout . PREFERRED_SIZE )
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                                .addComponent (jLabel12)
                                .addGap ( 26 , 26 , 26 )
                                .addComponent (jLabel13)
                                .addGap ( 18 , 18 , 18 )
                                .addComponent (jLabel14)
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                                    .addComponent (jButton3, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                                    .addGroup (layout . createSequentialGroup ()
                                        .addComponent (iscastrado, javax.swing . GroupLayout . PREFERRED_SIZE , 47 , javax.swing . GroupLayout . PREFERRED_SIZE )
                                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                                        .addComponent (jLabel15)
                                        .addGap ( 0 , 39 , Short . MAX_VALUE )))))
                        .addContainerGap ())))
            .addGroup (layout . createSequentialGroup ()
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 102 , 102 , 102 )
                        .addComponent (jLabel1))
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 41 , 41 , 41 )
                        .addComponent (jButton1)
                        .addGap ( 81 , 81 , 81 )
                        .addComponent (jButton2)))
                .addContainerGap ( javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE ))
        );
        layout . setVerticalGroup (
            layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addContainerGap ()
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                    .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                        .addComponent (jLabel10)
                        .addComponent (jLabel11))
                    .addGroup (layout . createSequentialGroup ()
                        .addComponent (jLabel1)
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELACIONADO )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . CENTER )
                            .addComponent (jLabel2)
                            .addComponent (camponome, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jLabel3)
                            .addComponent (campomatricula, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addGap ( 18 , 18 , 18 )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel4)
                            .addComponent (campocor, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jLabel5)
                            .addComponent (campogenero, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel7)
                            .addComponent (campoidade, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jLabel8)
                            .addComponent (campopeso, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                            .addComponent (jLabel9)
                            .addComponent (camporabo, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                        .addGap ( 28 , 28 , 28 )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . TRAILING )
                            .addComponent (isfocinheira, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                            .addComponent (jLabel12)))
                    .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                        .addComponent (jLabel14)
                        .addComponent (jLabel13))
                    .addComponent (iscastrado, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (jLabel15))
                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . RELATED , 32 , Short . MAX_VALUE )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jButton1)
                    .addComponent (jButton2)
                    .addComponent (jButton3))
                .addGap ( 18 , 18 , 18 ))
        );

        pacote();
    } // </editor-fold> // GEN-END: initComponents

    private  void  camponomeActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_camponomeActionPerformed
        // TODO adicione seu código de manuseio aqui:
    } // GEN-LAST: event_camponomeActionPerformed

    private  void  campomatriculaActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_campomatriculaActionPerformed
        // TODO adicione seu código de manuseio aqui:
    } // GEN-LAST: event_campomatriculaActionPerformed

    private  void  jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton1ActionPerformed
        // TODO adicione seu código de manuseio aqui:
        if (verificaMatricula ( Integer . parseInt (campomatricula . getText ()))) {
            JOptionPane . showMessageDialog ( null , " A matrícula já está cadastrada. " );
        } else {
            Cachorro c =  Cachorro novo  ();
            c . setNome (camponome . getText ());
            c . setMatricula ( Integer . parseInt (campomatricula . getText ()));
            c . setFocinheira (isfocinheira . getValueIsAdjusting ());
            c . setCastrado (iscastrado . getValueIsAdjusting ());
            c . setCor_pelagem (campocor . getText ());
            c . setEstilo_rabo (camporabo . getText ());
            c . setGenero (campogenero . getText ());
            c . setIdade ( Integer . parseInt (campoidade . getText ()));
            c . setPeso ( Float . parseFloat (campopeso . getText ()));
            cachorro . adicione (c);
            JOptionPane . showMessageDialog ( este , " Cachorro cadastrado com sucesso. " );
    } // GEN-LAST: event_jButton1ActionPerformed
    }

    public  boolean  verificaMatricula ( int  matricula ) {
        para ( Cachorro c : cachorro) {
            if (c . getMatricula () == matricula) {
                return  true ;
            }
        }
        return  false ;
    }

    private  void  jButton3ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton3ActionPerformed
        // TODO adicione seu código de manuseio aqui:
        String resultado =  "  " ;
        para ( Cachorro c : cachorro) {
            resultado + =  " Nome: "  + c . getNome () +  " . \ n " ;
            resultado + =  " Idade: "  + c . getIdade () +  " . \ n " ;
            resultado + =  " Matrícula: "  + c . getMatricula () +  " . \ n " ;
            resultado + =  " ----------------- \ n " ;
            JOptionPane . showMessageDialog ( isto , resultado);
        }
    } // GEN-LAST: event_jButton3ActionPerformed

    private  void  jButton2ActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_jButton2ActionPerformed
        // TODO adicione seu código de manuseio aqui:
        matrícula int =  Inteiro . parseInt ( JOptionPane . showInputDialog ( " Qual o número da matrícula do cachorro que você deseja remover? " ));
        para ( Cachorro c : cachorro) {
            if (c . getMatricula () == matricula) {
                cachorro . remova (c);
                JOptionPane . showMessageDialog ( isto , " Removendo o cachorro "  + c . getNome () +  " . " );
            } else {
                JOptionPane . showMessageDialog ( this , " A matrícula não existe. " );
            }
        }
    } // GEN-LAST: event_jButton2ActionPerformed

    / **
     * @param args os argumentos da linha de comando
     * /
    public  static  void  main ( String  args []) {
        / * Definir a aparência e comportamento do Nimbus * /
        // <editor-fold defaultstate = "collapsed" desc = "Código de configuração de aparência e comportamento (opcional)">
        / * Se o Nimbus (introduzido no Java SE 6) não estiver disponível, mantenha a aparência padrão.
         * Para obter detalhes, consulte http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         * /
        tente {
            para ( javax.swing . UIManager . LookAndFeelInfo info :  javax.swing . UIManager . getInstalledLookAndFeels ()) {
                if ( " Nimbus " . equals (info . getName ())) {
                    javax.swing . UIManager . setLookAndFeel (info . getClassName ());
                    pausa ;
                }
            }
        } catch ( ClassNotFoundException ex) {
            java.util.logging . Logger . getLogger ( Cadastro . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( InstantiationException ex) {
            java.util.logging . Logger . getLogger ( Cadastro . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( IllegalAccessException ex) {
            java.util.logging . Logger . getLogger ( Cadastro . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( javax.swing . UnsupportedLookAndFeelException ex) {
            java.util.logging . Logger . getLogger ( Cadastro . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        }
        // </editor-fold>

        / * Crie e exiba o formulário * /
        java.awt . EventQueue . invokeLater ( new  Runnable () {
            public  void  run () {
                novo  Cadastro () . setVisible ( true );
            }
        });
    }

    // Declaração de variáveis ​​- não modifique // GEN-BEGIN: variáveis
     javax.swing privado . JTextField campocor;
     javax.swing privado . JTextField campogenero;
     javax.swing privado . JTextField campoidade;
     javax.swing privado . JTextField campomatricula;
     javax.swing privado . JTextField camponome;
     javax.swing privado . JTextField campopeso;
     javax.swing privado . JTextField camporabo;
     javax.swing privado . JSlider iscastrado;
     javax.swing privado . JSlider isfocinheira;
     javax.swing privado . JButton jButton1;
     javax.swing privado . JButton jButton2;
     javax.swing privado . JButton jButton3;
     javax.swing privado . JLabel jLabel1;
     javax.swing privado . JLabel jLabel10;
     javax.swing privado . JLabel jLabel11;
     javax.swing privado . JLabel jLabel12;
     javax.swing privado . JLabel jLabel13;
     javax.swing privado . JLabel jLabel14;
     javax.swing privado . JLabel jLabel15;
     javax.swing privado . JLabel jLabel2;
     javax.swing privado . JLabel jLabel3;
     javax.swing privado . JLabel jLabel4;
     javax.swing privado . JLabel jLabel5;
     javax.swing privado . JLabel jLabel6;
     javax.swing privado . JLabel jLabel7;
     javax.swing privado . JLabel jLabel8;
     javax.swing privado . JLabel jLabel9;
     javax.swing privado . JTextField jTextField5;
    // Fim da declaração de variáveis ​​// GEN-END: variáveis
}
