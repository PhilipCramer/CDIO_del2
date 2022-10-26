public class Field {

    private final String name;
    private final Integer effect;

    private final Boolean extraTurn;

    public Field(String name, Integer effect, Boolean extraTurn){
        this.name = name;
        this.effect = effect;
        this.extraTurn = extraTurn;
    }
    public String getFieldName(String String){return name;}

    public Integer getFieldEffect(Integer Int){return effect;}

    public Boolean getExtraTurn(){return extraTurn;}


}
