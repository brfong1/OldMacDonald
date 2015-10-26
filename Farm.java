class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm()
   {
   	aBunchofAnimals[0] = new Cow("cow", "meuh");
   	aBunchofAnimals[1] = new Chick("chick", "peep","cluck");
   	aBunchofAnimals[2] = new Pig("pig", "heng heng");
   }
   public void animalSounds()
   {
   	for(int i = 0; i < aBunchofAnimals.length; i++)
   	{
   		System.out.println(aBunchofAnimals[i].getType() + " says " + aBunchofAnimals[i].getSound());
   	}
   }
}

