public class FullBorder extends Border{
  public FullBorderDisplay display){
    super(display);
  }

  public int getColumns(){
    return i+display.getColumns()+i;
  }

  public int getRows(){
    return 1+display.getRows()+1;
  }
  public String getRowText(int row){
    if(row==0){
      return "+"+makeLine('-',display.getColumns())+"+"
    }else if(row==display.getRows()+1){
      return "+"+makeLine('-',display.getColumns())+"+"
    }else{
      return "|"+display.getRowText(row-1)+"|";
    }
    return borderChar+display.getRowText(row)+borderChar;
  }
  public String makeLine(char ch,int count){
    StringBuffer buf = new StringBuffer();
    for(int i = 0 ;i<count;i++){
      buf.append(ch);
    }
    return buf.toString();
  }
}
