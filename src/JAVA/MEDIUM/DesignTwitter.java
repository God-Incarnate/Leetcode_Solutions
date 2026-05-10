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
        public Twitter() {
            this.follows=new HashMap<>();
            this.posts=new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            posts.putIfAbsent(userId,new LinkedList<>());
            posts.get(userId).add(new Tweet(tweetId,time++));
        }

        public List<Integer> getNewsFeed(int userId) {
            List<Integer> result=new ArrayList<>();
            PriorityQueue<Tweet> maxheap=new PriorityQueue<>((a,b)->b.time-a.time);
            follows.putIfAbsent(userId,new HashSet<>());
            follows.get(userId).add(userId);

            for(int fo:follows.get(userId)){
                List<Tweet> tweets=posts.get(fo);
                if(tweets!=null){
                    for(Tweet tw:tweets){
                        maxheap.offer(tw);
                    }
                }
            }

            int count=0;
            while(!maxheap.isEmpty() && count<10){
                result.add(maxheap.poll().id);
                count++;
            }

            return result;
        }


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
