package JAVA.MEDIUM;

import java.util.*;

public class DesignTwitter {
    //https://leetcode.com/problems/design-twitter
    class Twitter {
        private int time=0;
        class Tweet{
            int id;
            int time;

            public Tweet(int id,int time){
                this.id=id;
                this.time=time;
            }
        }
        Map<Integer, Set<Integer>> follows;
        Map<Integer, List<Tweet>> posts;

    }

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
}
