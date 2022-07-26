package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {



    SCISSOR_HAND_SIGN("SCISSOR"),
    PAPER_HAND_SIGN("PAPER"),
    ROCK_HAND_SIGN("ROCK");

    private String sign;

    RockPaperScissorHandSign(String paper) {
        this.sign = paper;
    }

    public RockPaperScissorHandSign getWinner() {


        return null;
    }

    public RockPaperScissorHandSign getLoser() {



        return null;
    }


}
