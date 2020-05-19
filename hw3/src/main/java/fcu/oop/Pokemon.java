package fcu.oop;

public class Pokemon {
  /** create a pokemon.*/
  private String name;
  private PokemonType type;
  private int cp;

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  public String getName() {
    return name;
  }

  public PokemonType getType() {
    return type;
  }
  /**maybe there need javadoc.*/
  public Pokemon(String name, PokemonType type, int cp) {
    /**creation.
     * maybe one line is not enough.
     */
    this.name = name;
    this.type = type;
    this.cp = cp;
  }
  
}
