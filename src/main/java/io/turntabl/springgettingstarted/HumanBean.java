package io.turntabl.springgettingstarted;

import java.util.logging.Logger;

public class HumanBean {
    public String fname;
    public String lname;
    private HumanBean bestFriend;


    public HumanBean(){}

    public String getFName(){return this.fname;}

    public void setFName(String fname){this.fname = fname;}

    public String getLName(){return this.lname;}

    public void setLName(String lname){this.lname = lname;}

    public HumanBean getBestFriend() {
        return this.bestFriend;
    }

    public void setBestFriend(HumanBean bestFriend) {
        this.bestFriend = bestFriend;
    }
}
