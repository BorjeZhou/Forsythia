package org.fleen.forsythia.app.grammarEditor.editor_EditGrammar.ui;

import java.util.List;

import org.fleen.forsythia.app.grammarEditor.GE;
import org.fleen.forsythia.app.grammarEditor.project.ProjectMetagon;
import org.fleen.forsythia.app.grammarEditor.util.ElementMenu;
import org.fleen.forsythia.app.grammarEditor.util.ElementMenuItem;
import org.fleen.forsythia.app.grammarEditor.util.UI;


@SuppressWarnings("serial")
public class PanMetagonMenu extends ElementMenu{

  /**
   * Create the panel.
   */
  public PanMetagonMenu(){
    super(UI.ELEMENTMENU_OVERVIEWMETAGONSROWS);}

  protected void doPopupMenu(int x,int y){}
  
  protected List<? extends ElementMenuItem> getItems(){
    if(GE.focusgrammar==null)return null;
    return GE.focusgrammar.metagons;}
  
  protected boolean isFocusItem(ElementMenuItem i){
    return i==GE.focusmetagon;}
  
  protected void setFocusItem(ElementMenuItem i){
    GE.editor_grammar.setFocusMetagon((ProjectMetagon)i);}
  
  protected void doDoubleclick(ElementMenuItem i){
    GE.editor_grammar.editMetagon();}

}