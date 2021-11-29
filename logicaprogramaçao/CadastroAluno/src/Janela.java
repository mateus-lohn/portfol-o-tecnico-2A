/ *
 * Para alterar este cabeçalho de licença, escolha Cabeçalhos de licença em Propriedades do projeto.
* Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
 * e abra o modelo no editor.
 * /
package  aula2a ;

import  java.util.ArrayList ;
import  javax.swing.JOptionPane ;

/ **
 *
* @author SESI_SENAI
 * /
A  classe  pública Janela  estende  javax.swing . JFrame {

    ArrayList < Aluno > chamada =  new  ArrayList <> ();

     janela pública () {
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

        campoNome =  new  javax.swing . JTextField ();
        campoIdade =  new  javax.swing . JTextField ();
        campoCpf =  new  javax.swing . JTextField ();
        campoMatricula =  novo  javax.swing . JTextField ();
        jLabel1 =  novo  javax.swing . JLabel ();
        jLabel2 =  novo  javax.swing . JLabel ();
        jLabel3 =  novo  javax.swing . JLabel ();
        jLabel4 =  novo  javax.swing . JLabel ();
        jLabel5 =  novo  javax.swing . JLabel ();
        botaoCadastra =  new  javax.swing . JButton ();
        botaoLista =  new  javax.swing . JButton ();
        botaoRemove =  new  javax.swing . JButton ();
        botaoEditar =  new  javax.swing . JButton ();

        setDefaultCloseOperation ( javax.swing . WindowConstants . EXIT_ON_CLOSE );
        setResizable ( false );

        jLabel1 . setText ( " Cadastro de Aluno " );

        jLabel2 . setText ( " Nome: " );

        jLabel3 . setText ( " CPF: " );

        jLabel4 . setText ( " Idade: " );

        jLabel5 . setText ( " Matrícula: " );

        botaoCadastra . setBackground ( novo  java.awt . Color ( 102 , 255 , 102 ));
        botaoCadastra . setText ( " Cadastra " );
        botaoCadastra . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                botaoCadastraActionPerformed (evt);
            }
        });

        botaoLista . setBackground ( novo  java.awt . Color ( 0 , 204 , 204 ));
        botaoLista . setText ( " Listar " );
        botaoLista . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                botaoListaActionPerformed (evt);
            }
        });

        botaoRemove . setBackground ( novo  java.awt . Color ( 255 , 0 , 0 ));
        botaoRemove . setText ( " Remover " );
        botaoRemove . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                botaoRemoveActionPerformed (evt);
            }
        });

        botaoEditar . setBackground ( novo  java.awt . Color ( 255 , 255 , 51 ));
        botaoEditar . setText ( " Editar " );
        botaoEditar . addActionListener ( new  java.awt.event . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                botaoEditarActionPerformed (evt);
            }
        });

        javax.swing . Layout GroupLayout =  new  javax.swing . GroupLayout (getContentPane ());
        getContentPane () . setLayout (layout);
        layout . setHorizontalGroup (
            layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 137 , 137 , 137 )
                .addComponent (jLabel1, javax.swing . GroupLayout . PREFERRED_SIZE , 113 , javax.swing . GroupLayout . PREFERRED_SIZE ))
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 10 , 10 , 10 )
                .addComponent (jLabel2)
                .addGap ( 19 , 19 , 19 )
                .addComponent (campoNome, javax.swing . GroupLayout . PREFERRED_SIZE , 274 , javax.swing . GroupLayout . PREFERRED_SIZE ))
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 10 , 10 , 10 )
                .addComponent (jLabel3)
                .addGap ( 27 , 27 , 27 )
                .addComponent (campoCpf, javax.swing . GroupLayout . PREFERRED_SIZE , 274 , javax.swing . GroupLayout . PREFERRED_SIZE ))
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 10 , 10 , 10 )
                .addComponent (jLabel4)
                .addGap ( 18 , 18 , 18 )
                .addComponent (campoIdade, javax.swing . GroupLayout . PREFERRED_SIZE , 46 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 92 , 92 , 92 )
                .addComponent (jLabel5)
                .addGap ( 6 , 6 , 6 )
                .addComponent (campoMatricula, javax.swing . GroupLayout . PREFERRED_SIZE , 83 , javax.swing . GroupLayout . PREFERRED_SIZE ))
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 130 , 130 , 130 )
                .addComponent (botaoLista, javax.swing . GroupLayout . PREFERRED_SIZE , 83 , javax.swing . GroupLayout . PREFERRED_SIZE ))
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 20 , 20 , 20 )
                .addComponent (botaoCadastra)
                .addGap ( 33 , 33 , 33 )
                .addComponent (botaoEditar, javax.swing . GroupLayout . PREFERRED_SIZE , 83 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 37 , 37 , 37 )
                .addComponent (botaoRemove))
        );
        layout . setVerticalGroup (
            layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addGap ( 20 , 20 , 20 )
                .addComponent (jLabel1, javax.swing . GroupLayout . PREFERRED_SIZE , 29 , javax.swing . GroupLayout . PREFERRED_SIZE )
                .addGap ( 11 , 11 , 11 )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 3 , 3 , 3 )
                        .addComponent (jLabel2))
                    .addComponent (campoNome, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addGap ( 18 , 18 , 18 )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 3 , 3 , 3 )
                        .addComponent (jLabel3))
                    .addComponent (campoCpf, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addGap ( 18 , 18 , 18 )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (campoIdade, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (campoMatricula, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 3 , 3 , 3 )
                        .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                            .addComponent (jLabel4)
                            .addComponent (jLabel5))))
                .addGap ( 24 , 24 , 24 )
                .addComponent (botaoLista)
                .addGap ( 7 , 7 , 7 )
                .addGroup (layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addComponent (botaoCadastra)
                    .addGroup (layout . createSequentialGroup ()
                        .addGap ( 20 , 20 , 20 )
                        .addComponent (botaoEditar))
                    .addComponent (botaoRemove)))
        );

        pacote();
    } // </editor-fold> // GEN-END: initComponents

    private  void  botaoCadastraActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_botaoCadastraActionPerformed
        if (verificaInfos ()) {
            Nome da string = campoNome . getText ();
            String cpf = campoCpf . getText ();
            Matrícula de string = campoMatricula . getText ();
            int idade =  Inteiro . parseInt (campoIdade . getText ());

            se (verificaCPF (cpf)) {
                JOptionPane . showMessageDialog ( null , " Esse CPF já está cadastrado! " );
            } else {
                Aluno a =  novo  Aluno (matrícula);
                a . setNome (nome);
                a . setIdade (idade);
                a . setCpf (cpf);
                chamada . adicione (a);
                campoNome . setText ( null );
                campoCpf . setText ( null );
                campoMatricula . setText ( null );
                campoIdade . setText ( null );
                JOptionPane . showMessageDialog ( null , " Aluno cadastrado com sucesso! " );
            }

        } else {
            JOptionPane . showMessageDialog ( null , " Digite as informações corretas! " );
        }
    } // GEN-LAST: event_botaoCadastraActionPerformed
    public  boolean  verificaInfos () {
        if (campoNome . getText () . equals ( " " ) || campoCpf . getText () . equals ( " " ) || campoMatricula . getText () . equals ( " " ) || campoIdade . getText () . equals ( " " )) {
            return  false ;
        }
        tente {
            Inteiro . parseInt (campoIdade . getText ());
        } catch ( Exceção e) {
            return  false ;
        }
        return  true ;
    }

    public  boolean  verificaCPF ( String  cpf ) {
        para ( Aluno a : chamada) {
            if (a . getCpf () . equals (cpf)) {
                return  true ;
            }
        }
        return  false ;
    }

    private  void  botaoListaActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_botaoListaActionPerformed
        String mensagem =  " Alunos \ n " ;
        para ( Aluno a : chamada) {
            mensagem + =  " Nome: "  + a . getNome () +  " \ n " ;
            mensagem + =  " Idade: "  + a . getIdade () +  " \ n " ;
            mensagem + =  " Matrícula: "  + a . getMatricula () +  " \ n " ;
            mensagem + =  " CPF: "  + a . getCpf () +  " \ n " ;
            mensagem + =  " -------------------------- \ n " ;
        }
        JOptionPane . showMessageDialog ( null , mensagem);
    } // GEN-LAST: event_botaoListaActionPerformed

    private  void  botaoRemoveActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_botaoRemoveActionPerformed
        String cpf =  JOptionPane . showInputDialog ( " Digite o CPF que deseja remover. " );
        String mensagem =  " CPF não encontrado! " ;
        para ( Aluno a : chamada) {
            if (cpf . equals (a . getCpf ())) {
                chamada . remover (a);
                mensagem =  " O aluno "  + a . getNome () +  " foi construída! " ;
                pausa ;
            }
        }
        JOptionPane . showMessageDialog ( null , mensagem);
    } // GEN-LAST: event_botaoRemoveActionPerformed

    private  void  botaoEditarActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_botaoEditarActionPerformed
        String cpf =  JOptionPane . showInputDialog ( " Digite o CPF da pessoa que deseja editar. " );
        String mensagem =  " CPF não encontrado! " ;
        para ( Aluno a : chamada) {
            if (cpf . equals (a . getCpf ())) {
                String mensagemInput =  " Qual informação deseja editar? (Digite apenas um número) \ n \ n "
                        +  " Digite 1 para Nome; \ n "
                        +  " Digite 2 para CPF; \ n "
                        +  " Digite 3 para Idade; \ n "
                        +  " Digite 4 para Matrícula; " ;
                entrada interna =  0 ;
                tente {
                    entrada =  Inteiro . parseInt ( JOptionPane . showInputDialog (mensagemInput));
                } catch ( Exceção e) {
                    entrada =  0 ;
                }
                switch (entrada) {
                    caso  1 :
                        a . setNome ( JOptionPane . showInputDialog ( " Digite o novo nome. " ));
                        mensagem =  " O nome do aluno "  + a . getNome () +  " foi atualizado com sucesso! " ;
                        pausa ;
                    caso  2 :
                        a . setCpf ( JOptionPane . showInputDialog ( " Digite o novo CPF. " ));
                        mensagem =  " O CPF do aluno "  + a . getNome () +  " foi atualizado com sucesso! " ;
                        pausa ;
                    caso  3 :
                        a . setIdade ( Integer . parseInt ( JOptionPane . showInputDialog ( " Digite a nova idade. " )));
                        mensagem =  " A idade do aluno "  + a . getNome () +  " foi atualizado com sucesso! " ;
                        pausa ;
                    caso  4 :
                        a . setMatricula ( JOptionPane . showInputDialog ( " Digite a nova Matrícula. " ));
                        mensagem =  " A matrícula do aluno "  + a . getNome () +  " foi atualizado com sucesso! " ;
                        pausa ;
                    padrão :
                        mensagem =  " Edição cancelada. " ;
                }
                pausa ;
            }
        }
        JOptionPane . showMessageDialog ( null , mensagem);
    } // GEN-LAST: event_botaoEditarActionPerformed

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
            java.util.logging . Logger . getLogger ( Janela . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( InstantiationException ex) {
            java.util.logging . Logger . getLogger ( Janela . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( IllegalAccessException ex) {
            java.util.logging . Logger . getLogger ( Janela . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        } catch ( javax.swing . UnsupportedLookAndFeelException ex) {
            java.util.logging . Logger . getLogger ( Janela . class . getName ()) . log ( java.util.logging . Nível . SEVERE , null , ex);
        }
        // </editor-fold>

        / * Crie e exiba o formulário * /
        java.awt . EventQueue . invokeLater ( new  Runnable () {
            public  void  run () {
                nova  janela () . setVisible ( true );
            }
        });
    }

    // Declaração de variáveis ​​- não modifique // GEN-BEGIN: variáveis
     javax.swing privado . JButton botaoCadastra;
     javax.swing privado . JButton botaoEditar;
     javax.swing privado . JButton botaoLista;
     javax.swing privado . JButton botaoRemove;
     javax.swing privado . JTextField campoCpf;
     javax.swing privado . JTextField campoIdade;
     javax.swing privado . JTextField campoMatricula;
     javax.swing privado . JTextField campoNome;
     javax.swing privado . JLabel jLabel1;
     javax.swing privado . JLabel jLabel2;
     javax.swing privado . JLabel jLabel3;
     javax.swing privado . JLabel jLabel4;
     javax.swing privado . JLabel jLabel5;
    // Fim da declaração de variáveis ​​// GEN-END: variáveis
}
