package fcu.oop;

public class Player {
  private String playerName;
  private Pokemon[] pokemons;
  private int level = 1;

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public Pokemon[] getPokemons() {
    return pokemons;
  }

  public void setPokemons(Pokemon[] pkms1) {
    this.pokemons = pkms1;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public Player(String playerName) {
    this.playerName = playerName;
  }
}
