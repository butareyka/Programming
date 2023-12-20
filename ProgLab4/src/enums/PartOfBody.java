package enums;

public enum PartOfBody {
    OPEN(" открыл глаза"),
    CLOSE(" закрыл глаза"),
    UP(" поднял руки"),
    DOWN(" опустил руки");

    private String s;

    PartOfBody(String s){
        this.s = s;
    }

    public String getStringStatusPartOfBody(){
        return s;
    }

}
