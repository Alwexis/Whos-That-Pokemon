package WhosThatPokemon;

import java.awt.Image;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import rotomdex.util.Util;

public class WhosThatPokemon extends javax.swing.JFrame {

    private String pokemonABuscar = "";
    private String pokemonABuscarUrl = "";
    private int puntuacion = 0;
    private long tiempo;

    public WhosThatPokemon() {
        initComponents();
        buscarPokemon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgPokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pokemon = new javax.swing.JTextField();
        nuevoPkmn = new javax.swing.JButton();
        puntuacionL = new javax.swing.JLabel();
        tiempoL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        primeraG = new javax.swing.JCheckBox();
        segundaG = new javax.swing.JCheckBox();
        terceraG = new javax.swing.JCheckBox();
        cuartaG = new javax.swing.JCheckBox();
        quintaG = new javax.swing.JCheckBox();
        sextaG = new javax.swing.JCheckBox();
        septimaG = new javax.swing.JCheckBox();
        octavaG = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("¿Quién es este Pokémon?");

        pokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pokemonKeyReleased(evt);
            }
        });

        nuevoPkmn.setText("No lo sé");
        nuevoPkmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPkmnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pokemon))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(nuevoPkmn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoPkmn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        puntuacionL.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        puntuacionL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        puntuacionL.setText("Puntuación: 0");

        tiempoL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tiempoL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tiempoL.setText("Tiempo: 0 segundos");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Generaciones:");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        primeraG.setSelected(true);
        primeraG.setText("Primera generación");

        segundaG.setSelected(true);
        segundaG.setText("Segunda generación");

        terceraG.setSelected(true);
        terceraG.setText("Tercera generación");

        cuartaG.setSelected(true);
        cuartaG.setText("Cuarta generación");

        quintaG.setSelected(true);
        quintaG.setText("Quinta generación");

        sextaG.setSelected(true);
        sextaG.setText("Sexta generación");

        septimaG.setSelected(true);
        septimaG.setText("Septima generación");

        octavaG.setSelected(true);
        octavaG.setText("Octava generación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(primeraG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segundaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(terceraG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuartaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quintaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sextaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(septimaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(octavaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primeraG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segundaG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terceraG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuartaG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quintaG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sextaG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(septimaG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(octavaG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntuacionL)
                            .addComponent(tiempoL)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(puntuacionL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoL)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void nuevoPkmnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            Image imgPkmn = Util.getImage(pokemonABuscarUrl, 2);
            imgPokemon.setIcon(new ImageIcon(imgPkmn));
        } catch (Exception e) {
            imgPokemon.setIcon(null);
        }
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                buscarPokemon();
            }
        };
        Timer timer = new Timer();
        Date tiempoNuevo = new Date();
        tiempoNuevo.setTime(tiempoNuevo.getTime() + 2000);
        timer.schedule(timerTask, tiempoNuevo);
    }                                         

    private void pokemonKeyReleased(java.awt.event.KeyEvent evt) {                                    
        if (pokemon.getText().equalsIgnoreCase(pokemonABuscar)) {
            long diferenciaTiempo = new Date().getTime() - tiempo;
            tiempoL.setText("Tiempo: " + diferenciaTiempo / 1000 + " segundos");
            pokemon.setEnabled(false);
            puntuacion += 1;
            puntuacionL.setText("Puntuación: " + puntuacion);
            try {
                Image imgPkmn = Util.getImage(pokemonABuscarUrl, 1);
                imgPokemon.setIcon(new ImageIcon(imgPkmn));
            } catch (Exception e) {
                imgPokemon.setIcon(null);
            }
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    buscarPokemon();
                }
            };
            Timer timer = new Timer();
            Date tiempoNuevo = new Date();
            tiempoNuevo.setTime(tiempoNuevo.getTime() + 2000);
            timer.schedule(timerTask, tiempoNuevo);
        }
    }                                   

    private void buscarPokemon() {
        Image imgPkmn;
        try {
            tiempo = new Date().getTime();
            tiempoL.setText("Tiempo: n/a segundos");
            int pokemonRandom = getPokemonId();
            pokemon.setText("");
            pokemon.setEnabled(true);
            String img = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/"
                    + pokemonRandom + ".png";
            imgPkmn = Util.getImage(img, 0);
            imgPokemon.setIcon(new ImageIcon(imgPkmn));
            pokemonABuscar = new Util().getPokemon(String.valueOf(pokemonRandom)).getIdentifier();
            pokemonABuscarUrl = img;
        } catch (IOException ex) {
        }
    }

    private int getPokemonId() {
        int id = 0;
        while (true) {
            id = new Random().nextInt(898);
            if (id == 0) {
                id = 1;
            }
            if (id >= 1 && id <= 151 && primeraG.isSelected()) {
                break;
            }
            if (id >= 152 && id <= 251 && segundaG.isSelected()) {
                break;
            }
            if (id >= 252 && id <= 386 && terceraG.isSelected()) {
                break;
            }
            if (id >= 387 && id <= 493 && cuartaG.isSelected()) {
                break;
            }
            if (id >= 494 && id <= 649 && quintaG.isSelected()) {
                break;
            }
            if (id >= 650 && id <= 721 && sextaG.isSelected()) {
                break;
            }
            if (id >= 722 && id <= 809 && septimaG.isSelected()) {
                break;
            }
            if (id > 809 && octavaG.isSelected()) {
                break;
            }
        }
        return id;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WhosThatPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhosThatPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhosThatPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhosThatPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WhosThatPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox cuartaG;
    private javax.swing.JLabel imgPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton nuevoPkmn;
    private javax.swing.JCheckBox octavaG;
    private javax.swing.JTextField pokemon;
    private javax.swing.JCheckBox primeraG;
    private javax.swing.JLabel puntuacionL;
    private javax.swing.JCheckBox quintaG;
    private javax.swing.JCheckBox segundaG;
    private javax.swing.JCheckBox septimaG;
    private javax.swing.JCheckBox sextaG;
    private javax.swing.JCheckBox terceraG;
    private javax.swing.JLabel tiempoL;
    // End of variables declaration                   
}
