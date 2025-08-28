public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int[] interactions = {150, 75, 25};
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        String[] authors = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        int engagementScore = manager.calculateEngagement(interactions);
        String category = manager.getCategoryRating(engagementScore);
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);

        ArrayList<String> postsList = new ArrayList<>();
        postsList.add("Advanced Java Tutorial");
        postsList.add("Spring Boot Guide");
        postsList.add("Java Programming Tips");

        HashMap<String, Integer> postEngagementMap = new HashMap<>();
        postEngagementMap.put("Advanced Java Tutorial", 1100);
        postEngagementMap.put("Spring Boot Guide", 600);
        postEngagementMap.put("Java Programming Tips", 250);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(postsList, postEngagementMap);
        ArrayList<String> uniqueAuthors = manager.getUniqueAuthors(authors);

        // ===== Stylized Output =====
        System.out.println("══ Social Media Post Manager ══");
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trendingPosts);
        System.out.println("Unique Authors: " + uniqueAuthors);
}
