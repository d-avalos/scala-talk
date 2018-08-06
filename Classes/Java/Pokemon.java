public class Pokemon {
  final private int number;
  final private String type1;
  final private String type2;
  private String name;

  public int getNumber() 
  {
    return this.number;
  }

  public String getType1()
  {
    return this.type1;
  }

  public String getType2()
  {
    return this.type2;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public Pokemon(int number, String type1, String type2, String name) {
    System.out.println("Initializing java object");
    this.number = number;
    this.type1 = type1;
    this.type2 = type2;
    this.name = name;
  }
}