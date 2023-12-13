package org.studyeasy.phone;

public class OnePlus5 implements Phone{


    @Override
    public String processor() { return "SD835"; }

    @Override
    public String OS() {
        return "Andriod";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}
