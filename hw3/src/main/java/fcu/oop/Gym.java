package fcu.oop;

public class Gym {
  /** hello. */
  public static void fight(Player player1, Player player2) {
    /** two player versus. */
    int playa = 0;
    int playb = 0;
    int ia;
    Pokemon[] ac = player1.getPokemons();
    Pokemon[] bc = player2.getPokemons();
    for (ia = 0; ia < 3; ia++) {
      if (ac[ia].getType().equals(PokemonType.FIRE) && bc[ia].getType().equals(PokemonType.WATER)) {
        playb++;
      }
      if (ac[ia].getType().equals(PokemonType.FIRE) && bc[ia].getType().equals(PokemonType.GRASS)) {
        playa++;
      }
      if (ac[ia].getType().equals(PokemonType.WATER) && bc[ia].getType().equals(PokemonType.FIRE)) {
        playa++;
      }
      if (ac[ia].getType().equals(PokemonType.WATER)
          && bc[ia].getType().equals(PokemonType.GRASS)) {
        playb++;
      }
      if (ac[ia].getType().equals(PokemonType.GRASS) && bc[ia].getType().equals(PokemonType.FIRE)) {
        playb++;
      }
      if (ac[ia].getType().equals(PokemonType.GRASS)
          && bc[ia].getType().equals(PokemonType.WATER)) {
        playa++;
      }
      if (ac[ia].getType().equals(bc[ia].getType())) {
        if (ac[ia].getCp() > bc[ia].getCp()) {
          playa++;
        }
        if (ac[ia].getCp() > bc[ia].getCp()) {
          playa++;
        }
        if (ac[ia].getCp() == bc[ia].getCp()) {
          playa++;
        }
      }
      if (playa == 2) {
        player1.setLevel(player1.getLevel() + 1);
        System.out.printf(
            "Winner is %s¡A and his/her level becomes %d",
            player1.getPlayerName(), player1.getLevel());
        break;
      }
      if (playb == 2) {
        player2.setLevel(player2.getLevel() + 1);
        System.out.printf(
            "Winner is %s¡A and his/her level becomes %d",
            player2.getPlayerName(), player2.getLevel());
        break;
      }
    }
  }
}
