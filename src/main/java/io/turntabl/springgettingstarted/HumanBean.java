package io.turntabl.springgettingstarted;

import java.util.logging.Logger;

public class HumanBean {
    public String fname;
    public String lname;
    public BestFriendBean bestFriend;

    public BestFriendBean getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(BestFriendBean bestFriend) {
        this.bestFriend = bestFriend;
    }



    public HumanBean(){}

    public String getFName(){return this.fname;}

    public void setFName(String fname){this.fname = fname;}

    public String getLName(){return this.lname;}

    public void setLName(String lname){this.lname = lname;}

}
