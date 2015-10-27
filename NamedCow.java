class NamedCow extends Cow
{
  /*protected*/private String myName;
  public NamedCow(String type, String sound, String name)
  {
    myType = type;
    mySound = sound;
    myName = name;
  }
  public NamedCow()
  {myName = "gerard";}
  public String getName(){return myName;}
}