
void setup()
{
	Chick pyo = new Chick("chick", "peep");
    System.out.println(pyo.getType() + " goes " + pyo.getSound());

	Cow steben = new Cow("Cow", "mueh");
	System.out.println(steben.getType() + " goes " + steben.getSound());
    
	Pig zhu = new Pig("Pig", "heng heng");
	System.out.println(zhu.getType() + " goes " + zhu.getSound());
}