/**
 * Created by bokense on 24-May-16.
 */
public class Card {


    private String name;
    private String color;
    public int baseValue;
    public int currentValue;
    private String[] effectText;
    private String archetype;
    private String subtype;


    public Card(String cardType){

        this.name = cardType;

        this.effectText = new String[4];

        switch (cardType){
            case "Tree":
                this.color = "green";
                this.baseValue = 4;
                this.effectText[0] = "+1 for each green";
                this.effectText[1] = "card";
                this.archetype = "forestry";
                this.subtype = "plant";
                break;
            case "Lumberjack":
                this.color = "red";
                this.baseValue = 4;
                this.effectText[0] = "+3 for each ";
                this.effectText[1] = "tree";
                this.archetype = "forestry";
                this.subtype = "human";
                break;

            case "Guard":
                this.color = "black";
                this.baseValue = 4;
                this.effectText[0] = "+3 for each ";
                this.effectText[1] = "Guard";
                this.archetype = "imperial";
                this.subtype = "human";
                break;

            case "Randiq":
                this.color = "black";
                this.baseValue = 5;
                this.effectText[0] = "+2 to all Imperials";
                this.effectText[1] = "-2 to all White Cards";
                this.archetype = "imperial";
                this.subtype = "human";
                break;

            case "LumberjackAxe":
                this.color = "green";
                this.baseValue = 2;
                this.effectText[0] = "+2 for each Forestry";
                this.effectText[1] = "+1 for each Lumberjack";
                this.archetype = "forestry";
                this.subtype = "tool";
                break;

            case "Toolmaker":
                this.color = "green";
                this.baseValue = 2;
                this.effectText[0] = "x2 for each ";
                this.effectText[1] = "Tool";
                this.archetype = "imperial";
                this.subtype = "human";
                break;

            case "Shredder":
                this.color = "red";
                this.baseValue = 4;
                this.effectText[0] = "-3 to all green";
                this.effectText[1] = "x2 if next to a mech";
                this.archetype = "forestry";
                this.subtype = "mech";
                break;
            case "GreenDragon":
                this.color = "green";
                this.baseValue = 7;
                this.effectText[0] = "+4 to all forestry";
                this.effectText[1] = "turn your deck into trees";
                this.archetype = "forestry";
                this.subtype = "dragon";
                break;

            case "Coal":  // TODO: NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 2;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "BlueOre":  // TODO: NFI  - 04-Jun-16
                this.color = "blue";
                this.baseValue = 2;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "GreenOre":  // TODO: NFI  - 04-Jun-16
                this.color = "green";
                this.baseValue = 3;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "RedOre":  // TODO: NFI  - 04-Jun-16
                this.color = "red";
                this.baseValue = 4;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "BlueBar":  // TODO: NFI  - 04-Jun-16
                this.color = "blue";
                this.baseValue = 7;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "GreenBar":  // TODO: NFI  - 04-Jun-16
                this.color = "green";
                this.baseValue = 8;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "RedBar":  // TODO: NFI  - 04-Jun-16
                this.color = "red";
                this.baseValue = 9;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "mining";
                this.subtype = "material";
                break;

            case "Lumber": // TODO:  NFI  - 04-Jun-16
                this.color = "green";
                this.baseValue = 2;
                this.effectText[0] = "+3 if next to a lumberjack";
                this.effectText[1] = "";
                this.archetype = "forestry";
                this.subtype = "material";
                break;

            case "Miner": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 2;
                this.effectText[0] = "smelts all ores";
                this.effectText[1] = "(turns ores into bars)";
                this.archetype = "forestry";
                this.subtype = "material";
                break;

            case "Forge": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 2;
                this.effectText[0] = "x2 to all mining";
                this.effectText[1] = "cards";
                this.archetype = "mining";
                this.subtype = "building";
                break;

            case "Lumbermill": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 4;
                this.effectText[0] = "+3 to all forestry";
                this.effectText[1] = "cards";
                this.archetype = "forestry";
                this.subtype = "building";
                break;
            case "GuardPost": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 4;
                this.effectText[0] = "+3 to all";
                this.effectText[1] = "guards";
                this.archetype = "forestry";
                this.subtype = "building";
                break;

            case "TaxKeeper": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 5;
                this.effectText[0] = "-3 to all forestry";
                this.effectText[1] = "and mining";
                this.archetype = "imperial";
                this.subtype = "human";
                break;

            case "Blacksmith": // TODO:  NFI  - 04-Jun-16
                this.color = "black";
                this.baseValue = 6;
                this.effectText[0] = "-3 to all white";
                this.effectText[1] = "+2 to all human";
                this.archetype = "mining";
                this.subtype = "human";
                break;

            case "TownCrier": // TODO:  NFI  - 04-Jun-16
                this.color = "blue";
                this.baseValue = 4;
                this.effectText[0] = "+4 to all human";
                this.effectText[1] = "";
                this.archetype = "imperial";
                this.subtype = "human";
                break;

            case "GuardMaster": // TODO:  NFI  - 04-Jun-16
                this.color = "yellow";
                this.baseValue = 10;
                this.effectText[0] = "";
                this.effectText[1] = "";
                this.archetype = "imperial";
                this.subtype = "human";
                break;


            case "null":
                break;
        }
        currentValue = baseValue;


    }



    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String[] getEffectText() {
        return effectText;
    }

    public void setEffectText(String[] effectText) {
        this.effectText = effectText;
    }

     @Override
    public String toString (){
        return  "[" + this.getName() + "]";
    }

}
