import java.util.Scanner;

class Maim {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Info Student1 = new Info("", 0, "ул.Пушкина 24", "", 0, "Гриффиндор");
        System.out.println("Информация про 1 студента:");
        System.out.print("Введите ФИО: ");
        String FIO1 = scan.nextLine();
        Student1.setFIO(FIO1);
        System.out.print("ФИО: ");
        System.out.println(Student1.getFIO());
        System.out.print("Введите год поступления: ");
        int date1 = scan.nextInt();
        Student1.setDate(date1);
        System.out.print("Адрес: ");
        System.out.println(Student1.getAddress());
        System.out.print("Введите телефон: ");
        String number1 = scan.next();
        Student1.setNumber(number1);
        System.out.print("телефон: ");
        System.out.println(Student1.getNumber());
        System.out.print("Введите курс: ");
        int well1 = scan.nextInt();
        scan.nextLine();
        Student1.setWell(well1);
        System.out.print("Факультет: ");
        System.out.println(Student1.getFaculty());

        Info Student2 = new Info("", 0, "ул.Мира 13", "", 0, "Пуффендуй");
        System.out.println("Информация про 2 студента:");
        System.out.print("Введите ФИО: ");
        String FIO2 = scan.nextLine();
        Student2.setFIO(FIO2);
        System.out.print("ФИО: ");
        System.out.println(Student2.getFIO());
        System.out.print("Введите год поступления: ");
        int date2 = scan.nextInt();
        Student2.setDate(date2);
        System.out.print("Адрес: ");
        System.out.println(Student2.getAddress());
        System.out.print("Введите телефон: ");
        String number2 = scan.next();
        Student2.setNumber(number2);
        System.out.print("телефон: ");
        System.out.println(Student2.getNumber());
        System.out.print("Введите курс: ");
        int well2 = scan.nextInt();
        scan.nextLine();
        Student2.setWell(well2);
        System.out.print("Факультет: ");
        System.out.println(Student2.getFaculty());

        Info Student3 = new Info("", 0, "ул.Толстого 45", "", 0, "Пуффендуй");
        System.out.println("Информация про 3 студента:");
        System.out.print("Введите ФИО: ");
        String FIO3 = scan.nextLine();
        Student3.setFIO(FIO3);
        System.out.print("ФИО: ");
        System.out.println(Student3.getFIO());
        System.out.print("Введите год поступления: ");
        int date3 = scan.nextInt();
        Student3.setDate(date3);
        System.out.print("Адрес: ");
        System.out.println(Student3.getAddress());
        System.out.print("Введите телефон: ");
        String number3 = scan.next();
        Student3.setNumber(number3);
        System.out.print("телефон: ");
        System.out.println(Student3.getNumber());
        System.out.print("Введите курс: ");
        int well3 = scan.nextInt();
        scan.nextLine();
        Student3.setWell(well3);
        System.out.print("Факультет: ");
        System.out.println(Student3.getFaculty());

        Info Student4 = new Info("", 0, "ул.Гоголя 5", "", 0, "Слизерин");
        System.out.println("Информация про 4 студента:");
        System.out.print("Введите ФИО: ");
        String FIO4 = scan.nextLine();
        Student4.setFIO(FIO4);
        System.out.print("ФИО: ");
        System.out.println(Student4.getFIO());
        System.out.print("Введите год поступления: ");
        int date4 = scan.nextInt();
        Student4.setDate(date4);
        System.out.print("Адрес: ");
        System.out.println(Student4.getAddress());
        System.out.print("Введите телефон: ");
        String number4 = scan.next();
        Student4.setNumber(number4);
        System.out.print("телефон: ");
        System.out.println(Student4.getNumber());
        System.out.print("Введите курс: ");
        int well4 = scan.nextInt();
        scan.nextLine();
        Student4.setWell(well4);
        System.out.print("Факультет: ");
        System.out.println(Student4.getFaculty());

        System.out.println("ФИО всех студентов:");
        System.out.println(Student1.getFIO());
        System.out.println(Student2.getFIO());
        System.out.println(Student3.getFIO());
        System.out.println(Student4.getFIO());

        System.out.print("Введите факультет: ");
        String faculty0 = scan.next();
        Info[] arr = {Student1, Student2, Student3, Student4};
        for(Info inf:arr){
            if(inf.getFaculty().equals(faculty0)){
                System.out.println(inf.getFIO());
            }
        }

        System.out.print("Введите год поступления: ");
        int year = scan.nextInt();
        for(Info inf:arr){
            if(inf.getDate() > year){
                System.out.println(inf.getFIO());
            }
        }
    }
}

class Info {
    private String FIO;
    private int date;
    private String Address;
    private String number;
    private int well;
    private String faculty;

    public Info(String FIO, int date, String Address, String number, int well, String faculty) {
        this.FIO = FIO;
        this.date = date;
        this.Address = Address;
        this.number = number;
        this.well = well;
        this.faculty = faculty;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return this.FIO;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate(){
        return this.date;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setWell(int well) {
        this.well = well;
    }

    public String getFaculty() {
        return this.faculty;
    }
}