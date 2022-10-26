public class Field {

    private final String name;
    private final Integer effect;

    private final Boolean extraTurn;

    public Field(String name, Integer effect, Boolean extraTurn){
        this.name = name;
        this.effect = effect;
        this.extraTurn = extraTurn;
    }
    // A constructor that makes an array of strings, integers and booleans. It also sets the name, effect and extra Turn.
    public String getFieldName(){return name;}
    // Made it possible to get the fields name in the Board Class
    public Integer getFieldEffect(){return effect;}
    // Made it possible to get the effect in the Board Class
    public Boolean getExtraTurn(){return extraTurn;}
    // Made it possible to get the extra turn in the Board Class

}
