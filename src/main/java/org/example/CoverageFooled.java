package org.example;

public class CoverageFooled {

    public String getNameWithPrefix(String name, char gender) {
        String nameWithPrefix;
        switch (gender) {
            case 'm':
                nameWithPrefix = "Mr. " + name;
                break;
            case 'f':
                nameWithPrefix = "Ms. " + name;
                break;
            default:
                nameWithPrefix = name;
        }
        return nameWithPrefix;
    }
}
