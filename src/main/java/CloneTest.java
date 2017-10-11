/**
 * Created by Administrator on 2017/10/10 0010.
 */
class Address
{
    String detail;
    public Address(String detail)
    {
        this.detail = detail;
    }
}
//实现Cloneable接口
class User implements Cloneable
{
    int age;
    Address address;
    public User(int age)
    {
        this.age = age;
        address = new Address("天津师范大学");
    }
    //通过调用super.clone方法来实现克隆
    public User clone() throws CloneNotSupportedException
    {
        return (User) super.clone();
    }
}
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1==u2);//flase
        System.out.println(u1.address==u2.address);//true
        //克隆机制只对对象里的各实例对象进行"简单复制"，如果对象是引用类型的实例对象，clone也只是简单的复制这个
        //引用变量，所有原有对象的引用类型的实例变量与克隆对象的引用类型的实例变量指向内存中的同一个实例
    }
}
