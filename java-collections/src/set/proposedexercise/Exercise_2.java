package set.proposedexercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Create a FavoriteLanguage class that has the attributes name, yearOfCreation and ide. Then, create a set with 3 languages ​​and make a program that sorts this set by:
 * A. Order of insertion.
 * B. Natural Order (name).
 * C. IDE
 * D. Year of creation and name.
 * E. Name, year of creation and IDE.
 * 
 * At the end, display the languages ​​in the console one below the other.
 */

public class Exercise_2 {
    public static void main(String[] args) {

        Set<FavoriteLanguage> myFavoriteLanguages = new HashSet<>();
        myFavoriteLanguages.add(new FavoriteLanguage("Python", 1991, "Pycharm"));
        myFavoriteLanguages.add(new FavoriteLanguage("JavaScript", 1995, "IntelliJ"));
        myFavoriteLanguages.add(new FavoriteLanguage("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tInsertion Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguages1 = new LinkedHashSet<>(
            Arrays.asList(
                new FavoriteLanguage("Python", 1991, "Pycharm"),
                new FavoriteLanguage("JavaScript", 1995, "IntelliJ"),
                new FavoriteLanguage("Java", 1991, "Visual Studio Code")
            )
        );
        for (FavoriteLanguage language : myFavoriteLanguages1) System.out.println(language);

        System.out.println("--------\tNatural Order (Name)\t--------");

        Set<FavoriteLanguage> myFavoriteLanguages2 = new TreeSet<>(myFavoriteLanguages);
        for (FavoriteLanguage language : myFavoriteLanguages2) System.out.println(language);

        System.out.println("--------\tIDE Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguages3 = new TreeSet<FavoriteLanguage>(new ComparatorIde());
        myFavoriteLanguages3.addAll(myFavoriteLanguages);
        for (FavoriteLanguage language : myFavoriteLanguages3) System.out.println(language);

        System.out.println("--------\tYear of Creation and Name Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguages4 = new TreeSet<FavoriteLanguage>(new ComparatorYearOfCreationAndName());
        myFavoriteLanguages4.addAll(myFavoriteLanguages);
        for (FavoriteLanguage language : myFavoriteLanguages4) System.out.println(language);

        System.out.println("--------\tName - Year of Creation - IDE Order\t--------");
        Set<FavoriteLanguage> myFavoriteLanguages5 = new TreeSet<FavoriteLanguage>(new ComparatorNameYearOfCreationIde());
        myFavoriteLanguages5.addAll(myFavoriteLanguages);
        for (FavoriteLanguage language : myFavoriteLanguages5) System.out.println(language);
        
    }
}

class FavoriteLanguage implements Comparable<FavoriteLanguage> {

    public String name;
    public Integer yearOfCreation;
    public String ide;

    

    public FavoriteLanguage(String name, Integer yearOfCreation, String ide) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "FavoriteLanguage [ name = " + name + ", yearOfCreation = " + yearOfCreation + ", ide = " + ide + " ]";
    }

    @Override
    public int compareTo(FavoriteLanguage language) {
        return this.name.compareTo(language.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((yearOfCreation == null) ? 0 : yearOfCreation.hashCode());
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FavoriteLanguage other = (FavoriteLanguage) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (yearOfCreation == null) {
            if (other.yearOfCreation != null)
                return false;
        } else if (!yearOfCreation.equals(other.yearOfCreation))
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }
    
}

class ComparatorIde implements Comparator<FavoriteLanguage>{

    @Override
    public int compare(FavoriteLanguage language1, FavoriteLanguage language2) {
        return language1.ide.compareToIgnoreCase(language2.ide);
    }
    
}

class ComparatorYearOfCreationAndName implements Comparator<FavoriteLanguage>{

    @Override
    public int compare(FavoriteLanguage language1, FavoriteLanguage language2) {
        int yearOfCreation = Integer.compare(language1.yearOfCreation, language2.yearOfCreation);
        if(yearOfCreation != 0) return yearOfCreation; 
        return language1.name.compareToIgnoreCase(language2.name);
    }
}

class ComparatorNameYearOfCreationIde implements Comparator<FavoriteLanguage>{

    @Override
    public int compare(FavoriteLanguage language1, FavoriteLanguage language2) {
        int name = language1.name.compareToIgnoreCase(language2.name);
        int yearOfCreation = Integer.compare(language1.yearOfCreation, language2.yearOfCreation);
        if (name != 0) return name;
        if(yearOfCreation != 0) return yearOfCreation;
        return language1.ide.compareToIgnoreCase(language2.ide);
    }

}
