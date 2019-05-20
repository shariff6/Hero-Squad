import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private Integer mMaxSize;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeros;

    public Squad(String name, Integer maxSize) {
        mName = name;
        mMaxSize = maxSize;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<Hero>();
    }

    public String getName() {
        return mName;
    }
    public Integer getMaxSize() {
        return mMaxSize;
    }

    public static ArrayList<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return mId;
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }

    public List<Hero> getHeros() {
        return mHeros;
    }

    public void addHero(Hero hero) {
        mHeros.add(hero);
    }

}
