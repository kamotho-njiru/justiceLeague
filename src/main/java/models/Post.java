package models;

import java.util.ArrayList;

public class Post {
    public static ArrayList<Post> getAll() {
        return instances;
    }

    public static void clearAllPosts() {
        instances.clear();
    }
}
