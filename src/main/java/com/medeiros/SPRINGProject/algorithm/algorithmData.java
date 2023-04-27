package com.medeiros.SPRINGProject.algorithm;

public class algorithmData {

    private int rithmPoints;

    private boolean black_list;

    public int getRithmPoints() {
        return rithmPoints;
    }

    public void setRithmPoints(int rithmPoints) {
        this.rithmPoints = rithmPoints;
    }

    public boolean isBlack_list() {
        return black_list;
    }

    public void setBlack_list(boolean black_list) {
        this.black_list = black_list;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    private boolean blocked;

    public int rithmPointsByLike(int likes){
        return likes*10;
    }

    public int rithmPointsByComents(int coments){
        return coments*15;
    }


}
