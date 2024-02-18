package PBL09_a1;

import java.util.Arrays;

public class A1_main {
    public static void main(String[] args) {
        int[] a = {1,3,2,1};
        String[] title = {"A", "B", "C", "D"};

        Movie[] movies = makeCatalogue(a, title);
        System.out.println("numMovie: " + Movie.getNumMovie() + ", numAction: " + Action.getNumAction() + ", numAnimation: " + Animation.getNumAnimation());
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }


        // 创建电影对象
        Movie movie1 = new Movie("Generic Movie");
        Movie action1 = new Action("Action Movie");
        Movie animation1 = new Animation("Animation Movie");
        Movie movie2 = new Movie("Another Generic Movie");



        // 创建包含这些电影的数组
        Movie[] testA = {movie1, action1, animation1, movie2};

        // 测试不同的情况
        testIsAvailable(testA, 0, 1); // 应该返回 null，因为位置 0 不是 Action 类型
        testIsAvailable(testA, 1, 1); // 应该返回 Action 类型的电影
        testIsAvailable(testA, 2, 2); // 应该返回 Animation 类型的电影
        testIsAvailable(testA, 3, 3); // 应该返回 Movie 类型的电影，因为它既不是 Action 也不是 Animation
    }

    public static void testIsAvailable(Movie[] movies, int pos, int cat) {
        Movie result = isAvailable(movies, pos, cat);
        if (result != null) {
            System.out.println("At position " + pos + " with category " + cat + ", found movie: " + result.getTitle());
        } else {
            System.out.println("At position " + pos + " with category " + cat + ", no matching movie found.");
        }
    }

    public static Movie[] makeCatalogue(int[] a, String[] title) {
        Movie[] movies = new Movie[a.length];
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    movies[i] = new Action(title[i]);
                    break;
                case 2:
                    movies[i] = new Animation(title[i]);
                    break;
                default:
                    movies[i] = new Movie(title[i]);
                    break;
            }
        }
        return movies;
    }

    public static Movie isAvailable(Movie[] movies, int pos, int cat) {
        Movie movie = movies[pos];
        if (cat == 1 && movie instanceof Action) {
            return movie;
        } else if (cat == 2 && movie instanceof Animation) {
            return movie;
        } else if (cat != 1 && cat != 2 && !(movie instanceof Action) && !(movie instanceof Animation)) {
            return movie;
        }
        return null;
    }

}
