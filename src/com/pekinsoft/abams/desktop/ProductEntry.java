/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pekinsoft.abams.desktop;

import javax.swing.JOptionPane;
import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;

/**
 *
 * @author Sean Carrick
 */
public class ProductEntry extends javax.swing.JInternalFrame {

    private final SingleFrameApplication app;
    private boolean saveAllowed;
    
    /**
     * Creates new form ProductEntry
     * @param app
     */
    public ProductEntry(SingleFrameApplication app) {
        this.app = app;
        this.saveAllowed = false;
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productIdLabel = new javax.swing.JLabel();
        productIdField = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        unitPriceField = new javax.swing.JFormattedTextField();
        unitPriceLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        dimensionsLabel = new javax.swing.JLabel();
        dimensionsField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        picturePanel = new javax.swing.JPanel();
        imageScrollPane = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();
        pictureButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry"); // NOI18N
        setTitle(bundle.getString("productEntry.title")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.pekinsoft.abams.AbAMSApp.class).getContext().getResourceMap(ProductEntry.class);
        setFrameIcon(resourceMap.getIcon("productEntry.frameIcon")); // NOI18N
        setName("productEntry"); // NOI18N

        productIdLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("productIdLabel.mnemonic").charAt(0));
        productIdLabel.setLabelFor(productIdField);
        productIdLabel.setText(bundle.getString("productIdLabel.text")); // NOI18N
        productIdLabel.setToolTipText(resourceMap.getString("productIdLabel.toolTipText")); // NOI18N
        productIdLabel.setName("productIdLabel"); // NOI18N

        productIdField.setEditable(false);
        productIdField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        productIdField.setText(resourceMap.getString("productIdField.text")); // NOI18N
        productIdField.setName("productIdField"); // NOI18N
        productIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productIdFieldFocusGained(evt);
            }
        });

        productNameLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("productLabel.mnemonic").charAt(0));
        productNameLabel.setLabelFor(productNameField);
        productNameLabel.setText(bundle.getString("productNameLabel.text")); // NOI18N
        productNameLabel.setName("productNameLabel"); // NOI18N

        productNameField.setText(bundle.getString("productNameField.text")); // NOI18N
        productNameField.setName("productNameField"); // NOI18N
        productNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productNameFieldFocusGained(evt);
            }
        });

        unitPriceField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        unitPriceField.setText(bundle.getString("unitPriceField.text")); // NOI18N
        unitPriceField.setName("unitPriceField"); // NOI18N
        unitPriceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unitPriceFieldFocusGained(evt);
            }
        });

        unitPriceLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("unitPriceLabel.mnemonic").charAt(0));
        unitPriceLabel.setLabelFor(unitPriceField);
        unitPriceLabel.setText(bundle.getString("unitPriceLabel.text")); // NOI18N
        unitPriceLabel.setName("unitPriceLabel"); // NOI18N

        descriptionLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("descriptionLabel.mnemonic").charAt(0));
        descriptionLabel.setLabelFor(dimensionsField);
        descriptionLabel.setText(bundle.getString("decriptionLabel.text")); // NOI18N
        descriptionLabel.setName("descriptionLabel"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        descriptionField.setColumns(20);
        descriptionField.setLineWrap(true);
        descriptionField.setRows(5);
        descriptionField.setText(bundle.getString("descriptionField.text")); // NOI18N
        descriptionField.setWrapStyleWord(true);
        descriptionField.setName("descriptionField"); // NOI18N
        descriptionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descriptionFieldFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(descriptionField);

        dimensionsLabel.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("dimensionsLabel.mnemonic").charAt(0));
        dimensionsLabel.setLabelFor(dimensionsField);
        dimensionsLabel.setText(bundle.getString("dimensionsLabel.text")); // NOI18N
        dimensionsLabel.setName("dimensionsLabel"); // NOI18N

        dimensionsField.setText(bundle.getString("dimensionsField.text")); // NOI18N
        dimensionsField.setName("dimensionsField"); // NOI18N
        dimensionsField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dimensionsFieldFocusGained(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(com.pekinsoft.abams.AbAMSApp.class).getContext().getActionMap(ProductEntry.class, this);
        cancelButton.setAction(actionMap.get("doCancel")); // NOI18N
        cancelButton.setIcon(resourceMap.getIcon("cancelButton.icon")); // NOI18N
        cancelButton.setMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("cancelButton.mnemonic").charAt(0));
        cancelButton.setText(bundle.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cancelButtonFocusGained(evt);
            }
        });

        saveButton.setAction(actionMap.get("doSave")); // NOI18N
        saveButton.setIcon(resourceMap.getIcon("saveButton.icon")); // NOI18N
        saveButton.setMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("saveButton.mnemonic").charAt(0));
        saveButton.setText(bundle.getString("saveButton.text")); // NOI18N
        saveButton.setName("saveButton"); // NOI18N
        saveButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                saveButtonFocusGained(evt);
            }
        });

        helpLabel.setBackground(resourceMap.getColor("helpLabel.background")); // NOI18N
        helpLabel.setForeground(resourceMap.getColor("helpLabel.foreground")); // NOI18N
        helpLabel.setText(resourceMap.getString("helpLabel.text")); // NOI18N
        helpLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        helpLabel.setName("helpLabel"); // NOI18N
        helpLabel.setOpaque(true);

        picturePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("picturePanel.border.title"))); // NOI18N
        picturePanel.setName("picturePanel"); // NOI18N

        imageScrollPane.setName("imageScrollPane"); // NOI18N

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
        imageLabel.setText(resourceMap.getString("imageLabel.text")); // NOI18N
        imageLabel.setName("imageLabel"); // NOI18N
        imageScrollPane.setViewportView(imageLabel);

        pictureButton.setIcon(resourceMap.getIcon("pictureButton.icon")); // NOI18N
        pictureButton.setMnemonic(java.util.ResourceBundle.getBundle("com/pekinsoft/abams/desktop/resources/ProductEntry").getString("pictureButton.mnemonic").charAt(0));
        pictureButton.setText(bundle.getString("pictureButton.text")); // NOI18N
        pictureButton.setIconTextGap(15);
        pictureButton.setName("pictureButton"); // NOI18N
        pictureButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pictureButtonFocusGained(evt);
            }
        });

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
            .addGroup(picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pictureButton, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picturePanelLayout.createSequentialGroup()
                .addComponent(imageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picturePanelLayout.createSequentialGroup()
                    .addGap(0, 207, Short.MAX_VALUE)
                    .addComponent(pictureButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dimensionsLabel)
                            .addComponent(descriptionLabel)
                            .addComponent(productNameLabel)
                            .addComponent(productIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dimensionsField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(unitPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(helpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(saveButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productIdLabel)
                            .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitPriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameLabel)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimensionsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dimensionsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitPriceFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unitPriceFieldFocusGained
        unitPriceField.selectAll();
        JOptionPane.showInternalMessageDialog(this, app.getContext().getResourceMap().getString("unitPriceField.help"));
        helpLabel.setText(app.getContext().getResourceMap().getString("unitPriceLabel.help"));
    }//GEN-LAST:event_unitPriceFieldFocusGained

    private void productIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdFieldFocusGained
        helpLabel.setText(app.getContext().getResourceMap().getString("productIdField.help"));
    }//GEN-LAST:event_productIdFieldFocusGained

    private void productNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameFieldFocusGained
        productNameField.selectAll();
        helpLabel.setText(app.getContext().getResourceMap().getString("productNameField.help"));
    }//GEN-LAST:event_productNameFieldFocusGained

    private void descriptionFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionFieldFocusGained
        descriptionField.selectAll();
        helpLabel.setText(app.getContext().getResourceMap().getString("descriptionField.help"));
    }//GEN-LAST:event_descriptionFieldFocusGained

    private void dimensionsFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dimensionsFieldFocusGained
        dimensionsField.selectAll();
        helpLabel.setText(app.getContext().getResourceMap().getString("dimensionsField.help"));
    }//GEN-LAST:event_dimensionsFieldFocusGained

    private void pictureButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pictureButtonFocusGained
        helpLabel.setText(app.getContext().getResourceMap().getString("pictureButton.help"));
    }//GEN-LAST:event_pictureButtonFocusGained

    private void saveButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saveButtonFocusGained
        helpLabel.setText(app.getContext().getResourceMap().getString("saveButton.help"));
    }//GEN-LAST:event_saveButtonFocusGained

    private void cancelButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cancelButtonFocusGained
        helpLabel.setText(app.getContext().getResourceMap().getString("cancelButton.help"));
    }//GEN-LAST:event_cancelButtonFocusGained

    @Action
    public void doCancel() {
        JOptionPane.showInternalMessageDialog(this, " width = " + getSize().width + "\nheight = " + getSize().height, "imageLabel Dimensions", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    @Action(enabledProperty = "saveAllowed")
    public void doSave() {
    }
    
    public boolean isSaveAllowed() {
        return !unitPriceField.getText().equals("0.00") 
                && unitPriceField.getText().length() > 0
                && !productNameField.getText().equals("[Product Name]")
                && productNameField.getText().length() > 0
                && !descriptionField.getText().equals("[Enter detailed product description]")
                && descriptionField.getText().length() > 0
                && !dimensionsField.getText().equals("[Width x Height x Depth  (Weight)]")
                && dimensionsField.getText().length() > 0;
    }

    public void setSaveAllowed(boolean b) {
        boolean old = isSaveAllowed();
        this.saveAllowed = b;
        firePropertyChange("saveAllowed", old, isSaveAllowed());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField dimensionsField;
    private javax.swing.JLabel dimensionsLabel;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane imageScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pictureButton;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JTextField productIdField;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JTextField productNameField;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JFormattedTextField unitPriceField;
    private javax.swing.JLabel unitPriceLabel;
    // End of variables declaration//GEN-END:variables
}