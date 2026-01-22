package day02.案例;

// 课程链接：
// https://www.bilibili.com/video/BV1gb42177hm?spm_id_from=333.788.player.switch&vd_source=9916ba039b625fccde258af0ad4edb7b&p=59

public class Test {
    public static void main(String[] args) {
        Movie[] movie = new Movie[6];
        movie[0] = new Movie(1, "《长津湖》", 88.0, "吴京");
        movie[1] = new Movie(2, "《我和我的父辈》", 78.0, "张译");
        movie[2] = new Movie(3, "《独行月球》", 65.0, "雷佳音");

        MovieService mo = new MovieService(movie);
        mo.printAllMovie(movie);
        mo.searchMovieById();
    }
}
