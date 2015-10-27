class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm()
   {
   	aBunchofAnimals[0] = new NamedCow("cow", "meuh", "gerard");
   	aBunchofAnimals[1] = new Chick("chick", "peep","cluck");
   	aBunchofAnimals[2] = new Pig("pig", "oink");
   }
   public void animalSounds()
   {
   	for(int i = 0; i < aBunchofAnimals.length; i++)
   	{
   		System.out.println(aBunchofAnimals[i].getType() + " says " + aBunchofAnimals[i].getSound());
   	}
      System.out.println( "The cow is known as " + ((NamedCow)aBunchofAnimals[0]).getName());    
   }
}

