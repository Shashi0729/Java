public class MyInfoRunner{


        public static void main(String[] args) {
        MyInfo obj = new MyInfo(20, "World", false, 30.5, 'B');
        System.out.println("Static variables:");
        System.out.println(MyInfo.myInfoId);
        System.out.println(MyInfo.myInfoName);
        System.out.println(MyInfo.myInfoActive);
        System.out.println(MyInfo.myInfoScore);
        System.out.println(MyInfo.myInfoGrade);
        System.out.println("Instance variables:");
        System.out.println(obj.infoId);
        System.out.println(obj.infoName);
        System.out.println(obj.infoActive);
        System.out.println(obj.infoScore);
        System.out.println(obj.infoGrade);
    }
}