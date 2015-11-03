class NamedCow extends Cow
{
  private String cowName;
  public NamedCow(String type, String name, String sound) {
    cowName = name;
  }
  public String getName() {
    return cowName;
  }
}
