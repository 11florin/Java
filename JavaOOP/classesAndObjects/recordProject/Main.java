package recordProject;

public class Main {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++) {
            LAPStudent s = new LAPStudent("S92300" + i, 
            switch(i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Lisa";
                case 5 -> "Harry";
                default -> "Anonymous";
            },
            "05/11/1985",
            "JavaMasterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985",
         "JavaMasterclass");
         LAPStudent recordStudent = new LAPStudent("S923007", "Bill", "05/11/1985",
          "Java Masterclas");
          System.out.println(pojoStudent);
          System.out.println(recordStudent);

          pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
          //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam");

          System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
          System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
