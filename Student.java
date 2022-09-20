
package School;
import java.util.Scanner;

public class Student<classno> {

    Course course;
    int stuno;
    double odev;
    double vize;
    double fina;
    double note;

    Student(int stuno){
        this.stuno = stuno;
        this.odev =0;
        this.vize =0;
        this.fina =0;
        this.note =0;


    }

    public void Note(int course){

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Öğrencinin Ödev Notu : ");
        this.odev = input.nextDouble();
        System.out.print("Öğrencinin Vize Notu : ");
        this.vize = input.nextDouble();
        System.out.print("Öğrencinin Final Notu : ");
        this.fina = input.nextDouble();
        if ((odev>=0&&odev<=100)&&(vize>=0&&vize<=100)&&(fina>=0&&fina<=100)){
            note = (odev*0.2)+(vize*0.3)+(fina*0.5);
            Pass();
        } else {
            System.out.println("Hatalı not girişi");
        }
    }

    public void Pass() {
        System.out.print(stuno+" Numaralı öğrenci,"+course+" dersinden ");
        if (note>=55){
            System.out.print("Geçmiştir");
        } else {
            System.out.println("Kalmıştır");
        }
    }


}
