package day02.案例;

import java.util.Scanner;

public class MovieService {

    private Movie[] movies;

    public MovieService() {
    }

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovie(Movie[] movie) {
        for (int i = 0; i < movie.length; i++) {
            if (movie[i] != null) {
                System.out.println("电影编号：" + movie[i].getId() + "，电影名称：" + movie[i].getName() + "，电影价格：" + movie[i].getPrice() + "，主演：" + movie[i].getActor());
            }
        }
    }

    public void searchMovieById() {
        System.out.println("请输入要查询的电影编号：");
        int id = new Scanner(System.in).nextInt();
        for (Movie movie : movies) {
            if (movie != null && movie.getId() == id) {
                System.out.println("电影编号：" + movie.getId() + "，电影名称：" + movie.getName() + "，电影价格：" + movie.getPrice() + "，主演：" + movie.getActor());
                return;
            }
        }
        System.out.println("未找到该电影信息。");
    }
}
