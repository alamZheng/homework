package homeworkday01;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Random;

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
    private static String homework03(String str) {
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
    private static void TestHomework03(){
        System.out.println("----TestHomework03-----");
        String newstr = homework03("   abc    def    ");
        System.out.println(newstr);
        String newstr1 = homework03("abc    def    ");
        System.out.println(newstr1);
    }
    /*
    4.时间字符串左空格trim,例如字符串"   abc    ",输出"   abc"
    */
    private static String homework04(String str) {
        int len = str.length();
        int st = len;
        char[] val = str.toCharArray();
        String newstr="";

        for (int i = (len-1); i>-1; i--) {
            if(val[i]==' '){
//                System.out.println(val[i]);
                st--;
            }else{
                break;}
        }
        newstr =str.substring(0,st);
        return newstr;
    }
    private static void TestHomework04(){
        System.out.println("----TestHomework04-----");
        String newstr = homework04("   abc    def     ");
        System.out.println(newstr);
        String newstr1 = homework04("   abc    def");
        System.out.println(newstr1);
    }
    /*
    5.实现字符串左右指定字符的trim,例如,字符串"***abc***",输出"abc",干掉"*"
    */
    private static String homework05(String str) {
        int len = str.length();
        int st = 0;
        int et = len;
        char[] val = str.toCharArray();
        String newstr="";

        for (int i = 0; i<len; i++) {
            if(val[i]=='*'){
//                System.out.println(val[i]);
                st++;
            }else{
                break;}
        }
        for (int i = (len-1); i>-1; i--) {
            if(val[i]=='*'){
//                System.out.println(val[i]);
                et--;
            }else{
                break;}
        }
        newstr =str.substring(st,et);
        return newstr;
    }
    private static void TestHomework05(){
        System.out.println("----TestHomework05-----");
        String newstr = homework05("***abc***");
        System.out.println(newstr);
    }
    /*
    6.基于startWith,实现可忽略大小写的实现,即,abc_和ABC_皆可以*/
    private static boolean homework06(String prefix,String str){
        int preLen = prefix.length();
        char[] prechar=prefix.toCharArray();
        char[] strchar=str.toCharArray();
        for (int i = 0; i < preLen; i++) {
//            if(!String.valueOf(prechar[i]).toUpperCase().equals(String.valueOf(strchar[i]).toUpperCase())) {
//                return false;
//            }
            /*A-Z 65-90
             *a-z 97-122 */
            if(prechar[i]>64&&prechar[i]<91){
                prechar[i]+=32;
//                System.out.println(prechar[i]);
            }
            if(strchar[i]>64&&strchar[i]<91){
                strchar[i]+=32;
//                System.out.println(strchar[i]);
            }
            if (prechar[i]!=strchar[i]){
//                System.out.println(prechar[i]);
//                System.out.println(strchar[i]);
                return false;
            }
        }
        return true;
    }

    private static void TestHomework06(){
        System.out.println("----TestHomework06-----");
        System.out.println(homework06("abc_","abc_1234"));
        System.out.println(homework06("abc_","ABC_1231"));
        System.out.println(homework06("abc_","aBc_1231"));
        System.out.println(homework06("abc_","aBcd_1231"));
        System.out.println(homework06("ABC_","ABC_5645"));
        System.out.println(homework06("ABC_","abc_345345"));
        System.out.println(homework06("ABC_","aBc_1231"));
        System.out.println(homework06("ABC_","aBsc_1231"));
    }
    /*
    7.基于endWith,实现可忽略大小写的实现,即,_abc和_ABC皆可以
    */
    private static boolean homework07(String endfix,String str){
        int endLen = endfix.length();
        int strLen = str.length();
        int subLen = strLen-endLen;
        char[] endchar=endfix.toCharArray();
        char[] strchar=str.toCharArray();
        for (int i = (endLen-1); i >-1; i--) {
            if(!String.valueOf(endchar[i]).toUpperCase().equals(String.valueOf(strchar[subLen+i]).toUpperCase())) {
                return false;
            }
        }
        return true;
    }

    private static void TestHomework07(){
        System.out.println("----TestHomework07-----");
        System.out.println(homework07("_abc","1234_abc"));
        System.out.println(homework07("_abc","657657_ABC"));
        System.out.println(homework07("_abc","67868_aBc"));
        System.out.println(homework07("_abc","446456_aBcd"));
        System.out.println(homework07("_ABC","3345_ABC"));
        System.out.println(homework07("_ABC","123123_abc"));
        System.out.println(homework07("_ABC","234234_aBc"));
        System.out.println(homework07("_ABC","45646_aBsc"));
    }
    /*
    8.实现toTitle()转化,即 "hello"输入"Hello"*/
    private static String homework08(String str1){

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

    private static void TestHomework08(){
        System.out.println("----TestHomework08-----");
        String str = homework08("hello");
        System.out.println(str);
        String str1 = homework08("hello1");
        System.out.println(str1);
    }

    /*
    9.练习数组的定义,赋值和初始化,使用int型即可*/
    private static int[] homework09() {
        Random ran1=new Random();
        int[] ints1=new int[10];
        for (int i = 0; i <10 ; i++) {
            ints1[i]=ran1.nextInt(100);
        }
        return ints1;
    }
    private static void TestHomework09(){
        System.out.println("----TestHomework09-----");
        int[] insts =homework09();
        for (int i:insts){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }
    /*
    10.基于9中定义的数组,实现数组内容的基本排序,冒泡
    */
    private static int[] homework10() {
        int[] insts =homework09();
        for (int i:insts){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        //10
        int intsLen=insts.length;
//        int[] newInsts=new int[intsLen];
//        System.out.println(max);
        //9-0
        for (int i = (intsLen-1); i >-1; i--) {
//            System.out.println(i);
            for (int j = 0; j <i ; j++) {
                if(insts[j]>insts[j+1]){
                    int tmp=insts[j];
                    insts[j]=insts[j+1];
                    insts[j+1]=tmp;
                }
            }
//            System.out.println();
//            for (int ni:insts){
//                System.out.print(ni);
//                System.out.print(",");
//            }
//            System.out.println();
        }

        return insts;
    }
    private static void TestHomework10(){
        System.out.println("----TestHomework10-----");
        int[] newInsts =homework10();
//        newInsts=homework10();
        for (int i:newInsts){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
    }
    /*
    11.基于9中定义的数组,实现数组内容的二分查找,查找给定元素
    */
    private static int homework11(int findInt) {
//        int[] insts =homework10();
        int[] insts ={4,6,38,48,49,50,70,73,74,93};
        for (int i:insts){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        //10
        int intsLen=insts.length;
        int left=0;
        int right=intsLen-1;
        int mid=intsLen/2;
        int findIndex=-1;
        while(right>left+1){
            if(findInt>insts[mid]){
                left=mid;
                mid=(right+left)/2;
            }else if(findInt<insts[mid]){
                right=mid;
                mid=(right+left)/2;
            }else {
                findIndex=mid;
                break;
            }
        }

        return findIndex;
    }
    private static void TestHomework11(){
        System.out.println("----TestHomework11-----");
        int findIndex =homework11(74);
        System.out.println(findIndex);
        int findIndex1 =homework11(48);
        System.out.println(findIndex1);
        int findIndex2 =homework11(174);
        System.out.println(findIndex2);
    }
    /*
    12.实现一个水仙花数,要求输入2个参数,第一个参数是层级数,比如5,
    第二个打印的字符类型,若类型是"a"则打印"*"类型是b,打印"#"
    */
    private static ArrayList homework12(int pows,String str) {
        ArrayList al=new ArrayList();
        //求10到10000之间所有的素数，一个大的循环
        for (int number = 100; number <= Math.pow(10, pows); number++) {
            //这步代码是为了让Getlength(number)不变
            int temp = number;
            int sum = 0;
            for (int i = 0; i < Getlength(number); i++) {
                //次方和相加
                sum += Math.pow(temp % 10, Getlength(number));
                temp = temp / 10;
            }//判断是否相等
            if (sum == number) {
//                System.out.print(number + " ");
                al.add(number);
            }

        }return al;
    }
    private static int Getlength(int number){ //这个函数是为了求一个数字的位数
        int i = 0;
        while (number / 10 > 0) {
            i++;
            number /= 10;
        }
        return i + 1;
    }

    private static void TestHomework12(){
        System.out.println("----TestHomework12-----");
        ArrayList result =homework12(5,"a");
        for (int i = 0; i <result.size() ; i++) {
            System.out.print(result.get(i)+ " ");
        }
        System.out.println();

    }
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
        private User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private String getName() {
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
    private static void TestHomework13(){
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
        TestHomework06();
        TestHomework07();
        TestHomework08();
        TestHomework09();
        TestHomework10();
        TestHomework11();
        TestHomework12();
        TestHomework13();

    }
}


