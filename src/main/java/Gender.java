/**
 * Created by Administrator on 2017/10/7 0007.
 */
public enum Gender implements GenterDesc{
    MALE("男"){
        public void info() {
            System.out.print("这个枚举值代表男性");
        }
    },FEMALE("女"){
        public void info() {
            System.out.print("这个枚举值代表女性");
        }
    };
    private final String name;
    private Gender(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

//    public void info() {
//        System.out.print("这是一个用来定义性别Field的枚举类");
//    }
}
