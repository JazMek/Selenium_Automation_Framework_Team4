package databases;

public class User2United {
    public String From;
    public String To;
    public String Month;
    public String Adults;
    public String Seniors;
    public String Children;

    public User2United() {
    }

    public User2United(String from, String to, String month, String adults, String seniors, String children) {
        From = from;
        To = to;
        Month = month;
        Adults = adults;
        Seniors = seniors;
        Children = children;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getAdults() {
        return Adults;
    }

    public void setAdults(String adults) {
        Adults = adults;
    }

    public String getSeniors() {
        return Seniors;
    }

    public void setSeniors(String seniors) {
        Seniors = seniors;
    }

    public String getChildren() {
        return Children;
    }

    public void setChildren(String children) {
        Children = children;
    }
}
