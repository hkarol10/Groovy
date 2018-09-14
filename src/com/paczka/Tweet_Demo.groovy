/*
package com.paczka

@groovy.transform.Canonical

class Tweet {
    String post
    String username
    String postDateTime

    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtags = []

    void favorite (String username) {
        favorite << username
    }

    List getFavorites(){
        favorites

    }

    void retweet(String username){
      retweets << username
    }

    List getRetweets(){
        retweets
    }

}

Tweet tweet = new Tweet(post: "Kurs tego goscia wymiata! #groovy #therealdanvega", username:"@hkarol10" , postDateTime: new Date())
println tweet

tweet.favorite("@kherzyk")
tweet.retweet("@ApacheGroovy")

println tweet.getFavorites()
println tweet.getRetweets()
*/