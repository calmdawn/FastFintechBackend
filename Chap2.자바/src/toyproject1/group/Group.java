package toyproject1.group;

public class Group {
    GroupType groupType;
    Parameter parameter;
    boolean writeHistory;

    public Group() {
        this.parameter = new Parameter();
        this.writeHistory = false;
    }
}
