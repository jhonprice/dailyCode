public class SideBorder extends Border{
  private char borderChar;
  public SideBorder(Display display,char ch){
    super(display);
    this.borderChar  = ch;
  }

  public int getColumns(){
    return i+display.getColumns()+i;
  }

  public int getRows(){
    return display.getRows();
  }
  public String getRowText(int row){
    return borderChar+display.getRowText(row)+borderChar;
  }
}
