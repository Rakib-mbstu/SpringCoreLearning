package ZooKeeper;

public class Lion implements Animal {

    private String scientificName;
    private String countryOfOrigin;
    private int numberOfAnimal;
    @Override
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Override
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void setNumberOfAnimal(int numberOfAnimal) {
        this.numberOfAnimal = numberOfAnimal;
    }

    @Override
    public String getScientificName() {
        return scientificName;
    }

    @Override
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public int getNumberOfAnimal() {
        return numberOfAnimal;
    }
}
