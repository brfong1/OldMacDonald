class Cow implements Animal 
{     
     private String myType;
     private String mySound;
     public Cow(String type, String sound, String name)
     {
     	myType = type;
     	mySound = sound;
        myName = name;
     }
     public Cow()
     {
     	myType = "cow";
     	mySound = "meuh";
     }

     public String getSound()
      {return mySound;}
     public String getType()
      {return myType;} 
}