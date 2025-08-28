import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PostManager {

    // 1. calculateEngagement uses varargs for interactions, returns total or 0 if none provided
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    // 2. getCategoryRating returns rating based on engagement score
    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000)
            return "Viral";
        else if (engagementScore >= 500)
            return "Popular";
        else if (engagementScore >= 100)
            return "Good";
        else if (engagementScore >= 50)
            return "Low";
        else
            return "Poor";
    }

    // 3a. displayPostStats (post title and engagement only)
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + (postTitle == null ? "Untitled" : postTitle));
        System.out.println("Engagement Score: " + engagementScore);
    }

    // 3b. displayPostStats overloaded - includes category rating
    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + (postTitle == null ? "Untitled" : postTitle));
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + (category == null ? "Uncategorized" : category));
    }

    // 4. manageHashtags uses fixed-size array of size 5, returns unique hashtags as ArrayList
    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        if (hashtags == null) {
            return uniqueHashtags; // empty list
        }
        // Fixed size 5 array: if more than 5 passed, only take first 5, if less, fill with nulls
        String[] fixedSizeArray = new String[5];
        for (int i = 0; i < 5; i++) {
            fixedSizeArray[i] = i < hashtags.length ? hashtags[i] : null;
        }

        // Convert array to collection and add unique non-null hashtags
        HashSet<String> set = new HashSet<>();
        for (String tag : fixedSizeArray) {
            if (tag != null && !tag.trim().isEmpty()) {
                set.add(tag);
            }
        }
        uniqueHashtags.addAll(set);
        return uniqueHashtags;
    }

    // 5. findTrendingPosts returns LinkedList of posts with engagement > 500
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();
        if (posts == null || postEngagement == null) {
            return trendingPosts;
        }
        for (String post : posts) {
            if (post != null) {
                Integer engagement = postEngagement.get(post);
                if (engagement != null && engagement > 500) {
                    trendingPosts.add(post);
                }
            }
        }
        return trendingPosts;
    }

    // 6. getUniqueAuthors removes duplicates via HashSet and returns list of unique authors
    public ArrayList<String> getUniqueAuthors(String... authors) {
        ArrayList<String> uniqueAuthors = new ArrayList<>();
        if (authors == null || authors.length == 0) {
            return uniqueAuthors;
        }
        HashSet<String> set = new HashSet<>();
        for (String author : authors) {
            if (author != null && !author.trim().isEmpty()) {
                set.add(author);
            }
        }
        uniqueAuthors.addAll(set);
        return uniqueAuthors;
    }
