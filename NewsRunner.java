public class NewsRunner {

    public static void main(String[] args) {
	 System.out.println("News Source: " + News.newsSource);
        System.out.println("News Headline: " + News.newsHeadline);
        System.out.println("News Category: " + News.newsCategory);
        System.out.println("News Author: " + News.newsAuthor);
        System.out.println("News Ratings: " + News.newsRatings + " out of 5");
		News news= new News();
	    System.out.println("News Date: "+news.newsDate);
        System.out.println("News Word Count: "+news.newsWordCount);
        System.out.println("News is Breaking: "+news.newsIsBreaking);
    
    }
}