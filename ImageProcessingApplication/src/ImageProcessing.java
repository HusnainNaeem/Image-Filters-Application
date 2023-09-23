import java.awt.Image;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;



public class ImageProcessing extends javax.swing.JFrame {
    private JFileChooser objJFileChooser = new JFileChooser();   // Object forthe file to be choosed   
    private File objFile = null;                                 // An object of the file to store the choosen file
    private BufferedImage inputImage;                            // To store input image as a file
    private BufferedImage outputImage;                           // To store output file
  
    public ImageProcessing() {
        initComponents();
        objJFileChooser.setFileFilter(new FileNameExtensionFilter("ImageFiles", "jpg", "jpeg", "png"));
        buttonStates(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        inputImageScrollPane = new javax.swing.JScrollPane();
        inputImageLabel = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        outputImageScrollPane = new javax.swing.JScrollPane();
        outputImageLabel = new javax.swing.JLabel();
        filter2 = new javax.swing.JButton();
        filter1 = new javax.swing.JButton();
        filter3 = new javax.swing.JButton();
        grayScale = new javax.swing.JButton();
        save = new javax.swing.JButton();
        zoom = new javax.swing.JButton();
        load = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        fileChooser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Filtering Application");
        setResizable(false);

        inputPanel.setPreferredSize(new java.awt.Dimension(498, 500));

        inputImageScrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inputImageScrollPane.setViewportView(inputImageLabel);

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputImageScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputImageScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        outputPanel.setPreferredSize(new java.awt.Dimension(498, 500));

        outputImageScrollPane.setViewportView(outputImageLabel);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputImageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputImageScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        filter2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        filter2.setText("Filter # 2");
        filter2.setOpaque(false);
        filter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter2ActionPerformed(evt);
            }
        });

        filter1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        filter1.setText("Filter # 1");
        filter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter1ActionPerformed(evt);
            }
        });

        filter3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        filter3.setText("Filter # 3");
        filter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter3ActionPerformed(evt);
            }
        });

        grayScale.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        grayScale.setText("Gray Scale");
        grayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayScaleActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        zoom.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        zoom.setText("Zoom");
        zoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomActionPerformed(evt);
            }
        });

        load.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        load.setText("LOAD");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        File.setText("File");

        fileChooser.setText("File Chooser");
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });
        File.add(fileChooser);

        MenuBar.add(File);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zoom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(filter3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save)
                    .addComponent(load))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filter3)
                    .addComponent(filter1)
                    .addComponent(filter2)
                    .addComponent(grayScale)
                    .addComponent(zoom))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        pictureFileChooserAndSetter();  // To choose the file and set it on the input and output panel
    }//GEN-LAST:event_fileChooserActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        pictureFileChooserAndSetter();  // To choose the file and set it on the input and output panel
    }//GEN-LAST:event_loadActionPerformed

    private void filter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter1ActionPerformed
       outputImage = Filters.filter1(inputImage);
       outputImageLabel.setIcon(new ImageIcon(outputImage));
    }//GEN-LAST:event_filter1ActionPerformed

    private void filter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter2ActionPerformed
        outputImage = Filters.filter2(inputImage);
        outputImageLabel.setIcon(new ImageIcon(outputImage));
    }//GEN-LAST:event_filter2ActionPerformed

    private void filter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter3ActionPerformed
        outputImage = Filters.filter3(inputImage);
        outputImageLabel.setIcon(new ImageIcon(outputImage));

    }//GEN-LAST:event_filter3ActionPerformed

    private void grayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayScaleActionPerformed
        outputImage = Filters.grayScale(inputImage);
        outputImageLabel.setIcon(new ImageIcon(outputImage));
    }//GEN-LAST:event_grayScaleActionPerformed

    private void zoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomActionPerformed
        int zoomFactor = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Zoom Factor"));
        outputImage = Filters.zoomImage(inputImage, zoomFactor);
        Image img = outputImage ;
        Image imgScale = img.getScaledInstance(outputImageLabel.getWidth(),outputImageLabel.getHeight(),Image.SCALE_SMOOTH);
        outputImageLabel.setIcon(new ImageIcon(outputImage));
    }//GEN-LAST:event_zoomActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int option = objJFileChooser.showSaveDialog(null);
        if(objJFileChooser.APPROVE_OPTION == option){
        File outputFile = objJFileChooser.getSelectedFile();
        try{
            ImageIO.write(outputImage, "JPG", outputFile);
        }catch(Exception objException){
            JOptionPane.showMessageDialog(null, objException, "Unable to save", JOptionPane.ERROR_MESSAGE);
        }
 }

    }//GEN-LAST:event_saveActionPerformed
    
    private void pictureFileChooserAndSetter(){
        int option = objJFileChooser.showOpenDialog(null);
        if(option == objJFileChooser.APPROVE_OPTION){
            objFile = objJFileChooser.getSelectedFile();
            try {
                inputImage = ImageIO.read(objFile);
                inputImageLabel.setIcon(new ImageIcon(inputImage));
                outputImage = ImageIO.read(objFile);
                Image img = outputImage ;
                Image imgScale = img.getScaledInstance(outputImageLabel.getWidth(),outputImageLabel.getHeight(),Image.SCALE_SMOOTH);
                outputImageLabel.setIcon(new ImageIcon(imgScale));

            } catch (Exception objIoException) {
                JOptionPane.showMessageDialog(null, objIoException, "Unable to open", JOptionPane.ERROR_MESSAGE);
            }
            buttonStates(true);
        }
    }
    private void buttonStates(boolean state) {
        filter1.setEnabled(state);
        filter2.setEnabled(state);
        filter3.setEnabled(state);
        grayScale.setEnabled(state);
        zoom.setEnabled(state);
        save.setEnabled(state);
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageProcessing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem fileChooser;
    private javax.swing.JButton filter1;
    private javax.swing.JButton filter2;
    private javax.swing.JButton filter3;
    private javax.swing.JButton grayScale;
    private javax.swing.JLabel inputImageLabel;
    private javax.swing.JScrollPane inputImageScrollPane;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton load;
    private javax.swing.JLabel outputImageLabel;
    private javax.swing.JScrollPane outputImageScrollPane;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton save;
    private javax.swing.JButton zoom;
    // End of variables declaration//GEN-END:variables
}
