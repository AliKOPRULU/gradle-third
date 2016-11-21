package koprulu.SpringGradle;

/**
 * Created by Ali on 21.11.2016.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id=id;
        this.content=content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
