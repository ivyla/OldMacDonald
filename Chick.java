class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  public Chick(String type, String sound, String sound2){
  
    myType = type;
    if((int)(Math.random()*2 + 1) == 1)
    mySound = sound2;
    else
    mySound = sound;
  }
  
  public String getSound(){
  return mySound;
  }
  public String getType(){
  return myType;
  }
     //your code here
}
