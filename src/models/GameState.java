package models;

import java.util.Vector;


public record GameState(Vector<BoardAction> actions, Vector<Base> bases, GameConfig config, Game game) {
}
