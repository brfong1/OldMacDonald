class NamedCow extends Cow
{
	protected String myName;
  public NamedCow(String name, String type, String sound)
  {
    myName = name;
    myType = type;
    mySound = sound;
  }
  public NamedCow()
  {
  	myName = "gerard";
  }
  public String getName()
  {
  	return myName;
  }
}