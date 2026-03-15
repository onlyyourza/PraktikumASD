package Jobsheet3;

public class DataDosen14 {

    public void dataAllDosen(Dosen14[] arrayOfDosen) {
        System.out.println("=== ALL LECTURERS DATA ===");
        for (Dosen14 d : arrayOfDosen) {
            d.printInfo();
            System.out.println("----------------------------");
        }
    }

    public void numberOfLecturersPerGender(Dosen14[] arrayOfDosen) {
        int male = 0, female = 0;

        for (Dosen14 d : arrayOfDosen) {
            if (d.gender) male++;
            else female++;
        }

        System.out.println("Male   : " + male);
        System.out.println("Female : " + female);
    }

    public void AverageAgeOfLecturersPerGender(Dosen14[] arrayOfDosen) {
        int maleCount = 0, femaleCount = 0;
        int maleSum = 0, femaleSum = 0;

        for (Dosen14 d : arrayOfDosen) {
            if (d.gender) {
                maleCount++;
                maleSum += d.age;
            } else {
                femaleCount++;
                femaleSum += d.age;
            }
        }

        double avgMale = (maleCount == 0) ? 0 : (double) maleSum / maleCount;
        double avgFemale = (femaleCount == 0) ? 0 : (double) femaleSum / femaleCount;

        System.out.println("Average Age (Male)   : " + avgMale);
        System.out.println("Average Age (Female) : " + avgFemale);
    }

    public void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
        Dosen14 oldest = arrayOfDosen[0];

        for (Dosen14 d : arrayOfDosen) {
            if (d.age > oldest.age) {
                oldest = d;
            }
        }

        System.out.println("=== OLDEST LECTURER ===");
        oldest.printInfo();
    }

    public void infoDosenMostYoungest(Dosen14[] arrayOfDosen) {
        Dosen14 youngest = arrayOfDosen[0];

        for (Dosen14 d : arrayOfDosen) {
            if (d.age < youngest.age) {
                youngest = d;
            }
        }

        System.out.println("=== YOUNGEST LECTURER ===");
        youngest.printInfo();
    }
}