package homeworkday01;

import javax.jws.soap.SOAPBinding;

public class day01 {
    /*1.使用BigDecimal写一个计算器,实现加减乘除,考虑可能是很大的数值计算场景

        * */
    public void homework01(){

    }
    /*2.基于1的时间,进行一个包装,是的输入double型和string型都可以兼任
    */

    /*
    3.时间字符串左空格trim,例如字符串"   abc    def",输出"abc    def"
    */
    public static String homework03(String str) {
        int len = str.length();
        int st = 0;
        char[] val = str.toCharArray();
        String newstr="";

        for (int i = 0; i < len; i++) {
            if(val[i]==' '){
//                System.out.println(val[i]);
                ++st;
            }else
                break;
        }
        newstr =str.substring(st);
        return newstr;
    }
    public static void TestHomework03(){
        System.out.println("----TestHomework03-----");
        String newstr = homework03("   abc    def    ");
        System.out.println(newstr);
        String newstr1 = homework03("abc    def    ");
        System.out.println(newstr1);
    }
    /*
    4.时间字符串左空格trim,例如字符串"   abc    ",输出"   abc"
    */
    public static String homework04(String str) {
        int len = str.length();
        int st = len;
        char[] val = str.toCharArray();
        String newstr="";

        for (int i = (len-1); i>-1; i--) {
            if(val[i]==' '){
//                System.out.println(val[i]);
                st--;
            }else
                break;
        }
        newstr =str.substring(0,st);
        return newstr;
    }
    public static void TestHomework04(){
        System.out.println("----TestHomework04-----");
        String newstr = homework04("   abc    def     ");
        System.out.println(newstr);
        String newstr1 = homework04("   abc    def");
        System.out.println(newstr1);
    }
    /*
    5.实现字符串左右指定字符的trim,例如,字符串"***abc***",输出"abc",干掉"*"
    */
    public static String homework05(String str) {
        int len = str.length();
        int st = 0;
        int et = len;
        char[] val = str.toCharArray();
        String newstr="";

        for (int i = 0; i<len; i++) {
            if(val[i]=='*'){
//                System.out.println(val[i]);
                st++;
            }else
                break;
        }
        for (int i = (len-1); i>-1; i--) {
            if(val[i]=='*'){
//                System.out.println(val[i]);
                et--;
            }else
                break;
        }
        newstr =str.substring(st,et);
        return newstr;
    }
    public static void TestHomework05(){
        System.out.println("----TestHomework05-----");
        String newstr = homework05("***abc***");
        System.out.println(newstr);
    }
    /*
    6.基于startWith,实现可忽略大小写的实现,即,abc_和ABC_皆可以*/
    /*
    7.基于endWith,实现可忽略大小写的实现,即,_abc和_ABC皆可以
    */
    /*
    8.实现toTitle()转化,即 "hello"输入"Hello"*/
    public static String homework08(String str1){

        char[] arrs = str1.toCharArray(); // Display the contents of the char array.
        int arrsLen=arrs.length;
        char[] NewArrs =new char[arrsLen];
        String NewStr="";
        for (int i = 0; i <arrsLen; i++) {
            if( !Character.isLetter(arrs[i])){
                return "input each string is not Letter";
            }
            if(i==0){
                NewArrs[0] =Character.toUpperCase(arrs[0]);
            } else{
                NewArrs[i] =arrs[i];
            }
            NewStr = String.valueOf(NewArrs);
        }
        return NewStr;
    }

    public static void TestHomework08(){
        System.out.println("----TestHomework08-----");
        String str = homework08("hello");
        System.out.println(str);
        String str1 = homework08("hello1");
        System.out.println(str1);
    }

    /*
    9.练习数组的定义,赋值和初始化,使用int型即可*/
    public static int[] homework09() {
        int[] ints1=new int[]{1,2,3,4};
        return ints1;
    }
    public static void TestHomework09(){
        System.out.println("----TestHomework09-----");
        int[] insts =homework09();
        for (int i:insts){
            System.out.print(i);
        }
        System.out.println("----end TestHomework09-----");
    }
    /*
    10.基于9中定义的数组,实现数组内容的基本排序,冒泡
    */
    /*
    11.基于9中定义的数组,实现数组内容的二分查找,查找给定元素
    */
    /*
    12.实现一个水仙花数,要去输入2个参数,第一个参数是层级数,比如5,第二个打印的字符类型,若类型是"a"则打印"*"类型是b,打印"#"
    */
    /*13基于面向对象的预习,定义一个类User,要去具备:
    --a 有私有的属性
    --b 有公共的属性
    有默认构造方法
    有重载1个和2个参数的构造方法
    有方法,只需实现获取属性值
    有类属性 静态域
    有类方法 静态方法
    对user对象实例化,并调用其方法,获取属性值*/
    public static class User {
        User(){
            name="alam";
            age=33;
        }
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }

        private String name;
        public int age;
    }
    public static void TestHomework13(){
        System.out.println("----定义一个类User----");
        User alam= new User("adam",22);
        System.out.println(alam.getName());
        User alam1= new User();
        System.out.println(alam1.getName());
    }
    public static void main(String[] args) {
        TestHomework03();
        TestHomework04();
        TestHomework05();
        TestHomework08();
        TestHomework09();
        TestHomework13();

    }
}

