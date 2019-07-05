package spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PlayerSeller{

    private final Player player;

    public PlayerSeller(@Qualifier("mp5Player") Player player) {
            this.player = player;
    }

    void sell() {
            player.play();
    }
}
