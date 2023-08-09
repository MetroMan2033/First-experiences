public class DVD{
  private String titel = "";
  private int wieOftGeguckt;
  
  DVD (String name, int aufrufe){
    titel = name;
    if (aufrufe >= 0){
      wieOftGeguckt = aufrufe;
    }
    else {
      wieOftGeguckt = 0;
    } // end of if-else
  }
  
  DVD (String name){
    titel = name;
    wieOftGeguckt = 0;
  }
  public void filmGucken(){
    wieOftGeguckt++;
  }
  
  public String getTitel(){
    return titel;
  }
  public int getWieOftGeguckt(){
    return wieOftGeguckt;
  }  
  public void setWieOftGeguckt(int anzahl){
    wieOftGeguckt = anzahl; 
  }   
}