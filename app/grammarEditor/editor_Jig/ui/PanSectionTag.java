package org.fleen.forsythia.app.grammarEditor.editor_Jig.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.fleen.forsythia.app.grammarEditor.GE;

@SuppressWarnings("serial")
public class PanSectionTag extends JPanel{
  
  public JTextField txttag;

  public PanSectionTag(){
    
    setBackground(new Color(204, 255, 51));
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    
    Box verticalBox = Box.createVerticalBox();
    add(verticalBox);
    
    Box horizontalboxtop = Box.createHorizontalBox();
    verticalBox.add(horizontalboxtop);
    
    Component rigidArea = Box.createRigidArea(new Dimension(300, 4));
    horizontalboxtop.add(rigidArea);
    
    Box horizontalboxmid = Box.createHorizontalBox();
    verticalBox.add(horizontalboxmid);
    
    Component horizontalStrut = Box.createHorizontalStrut(4);
    horizontalboxmid.add(horizontalStrut);
    
    JLabel lbljigtag = new JLabel("Section Tags =");
    lbljigtag.setFont(new Font("Dialog", Font.BOLD, 14));
    horizontalboxmid.add(lbljigtag);
    
    Component horizontalStrut_3 = Box.createHorizontalStrut(4);
    horizontalboxmid.add(horizontalStrut_3);
    
    txttag = new JTextField();
    txttag.setText("cat bat rat");
    txttag.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 18));
    txttag.setBorder(null);
    txttag.addKeyListener(new KeyAdapter(){
      public void keyTyped(KeyEvent e){
        GE.editor_jig.setSectionTags(txttag.getText());}});
    horizontalboxmid.add(txttag);
    
    Component horizontalStrut_1 = Box.createHorizontalStrut(4);
    horizontalboxmid.add(horizontalStrut_1);
    
    Box horizontalboxbottom = Box.createHorizontalBox();
    verticalBox.add(horizontalboxbottom);
    
    Component rigidArea_1 = Box.createRigidArea(new Dimension(44, 4));
    horizontalboxbottom.add(rigidArea_1);
    
  }
  
  public void setEnabled(boolean a){
    txttag.setEnabled(a);}
  
}