public class DVDRegal {
  private DVD[] menge = new DVD[20]; 
  private int anzahl = 0;
  
  public DVD getMenge(int stelle){
    return menge[stelle];
  }
  public int getLaenge(){
    return menge.length;
  }
  
  public void add(DVD dvd){
    if (anzahl < menge.length){
      for (int i  = 0;i<=menge.length-1;i++) {
        if (menge[i] == null){
          menge[i] = dvd;
          anzahl++;
          return;
        }
      } // end of for
    }
    else {
      System.out.println("Das Regal ist leider voll.");
    } // end of if-else
  }
  
  public void remove(String name){
    for (int i = 0;i<=menge.length-1;i++) {
      if (menge[i] != null && menge[i].getTitel().equals(name)){
        menge[i] = null;
        anzahl--;
      }
    } // end of for
  }
    
  public void filmGucken(String name){
    for (int i = 0;i<=menge.length -1  ;i++ ) {
       if (menge[i] != null && menge[i].getTitel().equals(name)){
        menge[i].filmGucken();
      } // end of for
    } 
  }
  
  public void zeigeInhalt(){
    for (int i = 0;i<=menge.length-1;i++) {
      if (menge[i] != null){
        System.out.println(menge[i].getTitel());
      }
    } // end of for
  }
  
  public void alleGucken(){
    for (int i = 0; i<=menge.length-1; i++) {
      if (menge[i] != null){
        menge[i].setWieOftGeguckt(menge[i].getWieOftGeguckt()+1);
      }  
    } // end of for
  }
}