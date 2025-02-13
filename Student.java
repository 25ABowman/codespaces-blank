public class Student implements Person{
    private String streetName;
    private int houseNum; 
    private String studentName;
    public Student(String studentName, int houseNum, String streetName){
        this.streetName = streetName;
        this.houseNum = houseNum;
        this.studentName = studentName;
    }
    public int Distance( Student other){
    if (this.getStreet().equals(other.getStreet())){
        return Math.abs(houseNum - other.getNumber());
    }   
    else{
        return 999999;
    }
}
    public String getName(){
        return studentName;
}
    public String getStreet() {
        return streetName;
}
    public int getNumber(){
        return houseNum;
}
    }

