public enum BoardLayout {
    START(0, false),
    THE_TOWER(250, false),
    THE_CRATER(-100, false),
    THE_PALACE_GATES(100, false),
    THE_COLD_DESERT(-20, false),
    THE_WALLED_CITY(180, false),
    THE_MONASTERY(0, false),
    THE_BLACK_CAVE(-70, false),
    THE_HUTS_IN_THE_MOUNTAIN(60, false),
    THE_WEREWALL(-80, true),
    THE_PIT(-50, false),
    THE_GOLDMINE(650, false);

    private final int effect;
    private final boolean extraTurn;

    BoardLayout(int effect, boolean ExtraTurn) {
        this.effect = effect;
        this.extraTurn = ExtraTurn;
    }

    public int getEffect() {
        return effect;
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }
}
