package base.interface_bs;

interface guitar {
    public void play();
}

interface guitar_player extends guitar {
    public void player();
}

public class music_fo {
    public static void main(String[] args) {
        guitar_player g = new guitar_player() {
            public void play() {
                System.out.println("Guitar is playing");
            }

            public void player() {
                System.out.println("Guitar player");
            }
        };
        g.play();
        g.player();
    }

}
