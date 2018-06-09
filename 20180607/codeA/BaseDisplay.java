public class BaseDisplay extends Display{
  private String s;
  public BaseDisplay(String s){
    this.s = s;
  }
  public int getColumns(){
    return s.getBytes().length;
  }
  public int getRows(){
    return 1;
  }
  public String getRowText(int row){
    if(row ==0){
      return s;
    }else{
      return null;
    }
  }
}
