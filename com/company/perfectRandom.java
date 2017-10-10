package com.company;

/**
 * Created by bs666 on 10/10/17.
 */
public class perfectRandom {
    public int fNum = (int)(Math.random() * 10);

    public perfectRandom(int num)
    {
        num = fNum;
    }
    public int square(int sq)
    {
        sq = fNum*fNum;
        return sq;
    }
}
