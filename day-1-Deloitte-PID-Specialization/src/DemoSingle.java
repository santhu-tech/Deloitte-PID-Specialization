public class DemoSingle {
    //private instances
    private static volatile DemoSingle instance;

    //private Constrcutor
    private DemoSingle() {
    }


    //Globally accessing from anywhere
    public static DemoSingle getInstance() {
        if (instance == null) {
            synchronized (DemoSingle.class) {
                if (instance == null) {
                    instance = new DemoSingle();
                }
            }
        }
        return instance;
    }
}
