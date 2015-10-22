void setup()
{
	Farm theFarm = new Farm();
	theFarm.animalSounds();
	Chick pyo = new Chick("chick", "peep", "cluck");
    System.out.println(pyo.getType() + " goes " + pyo.getSound());

	Cow steben = new Cow("Cow", "gerard", "mueh");
	System.out.println(steben.getType() + " goes " + steben.getSound());

	Pig zhu = new Pig("Pig", "heng heng");
	System.out.println(zhu.getType() + " goes " + zhu.getSound());
}