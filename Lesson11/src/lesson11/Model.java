/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

/**
 *
 * @author thiennd
 */
public class Model {

    int player_x, player_y,
            enemy_x, enemy_y,
            target_x, target_y;

    public static final int PLAYING = 1;
    public static final int WIN = 2;
    public static final int LOSE = 3;
    public static final int SOMETHINGELSE = 4;

    public Model() {
        player_x = 200;
        player_y = 200;
        enemy_x = 400;
        enemy_y = 400;
        target_x = 600;
        target_y = 600;
    }

    public int checkStatus() {
        // return 1 if playing
        // return 2 if win 
        // return 3 if lose 
        if (player_x == enemy_x && player_y == enemy_y) {
            return LOSE;
        }
        if (player_x == target_x && player_y == target_y) {
            return WIN;
        }
        return PLAYING;
    }
}
