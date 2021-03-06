package find_person;


public class MemberData {
    String name; //이름
    String date; //날짜
    String image; //그림

    public MemberData(String name, String date, String image){
        this.name = name;
        this.date = date;
        this.image = image;
    }

    //이 아래는 getter , setter 메소드듭입니다.
    //OOP(객체 지향 프로그래밍)은 클래스 객체 외부에서 직접 엠머변수에 접근하는 것을 지양합니다.
    //객체의 멤버변수 제어는 객체 스스로 하도록 해서 재사용성을 높인 방법이죠.
    //getter, setter 멤버 메소드들은 그 목적으로 만들어 진 것이죠.

    public void setName(String name){
        this.name = name;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setImage(String image){ this.image = image; }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getImage(){ return image; }

}
