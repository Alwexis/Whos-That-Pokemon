package WhosThatPokemon.data;

public class Pokemon {
    private int id;
    private String identifier;
    private int species_id;
    private double height;
    private double weight;
    private int base_experience;

    public Pokemon() {
    }

    public Pokemon(int id, String identifier, int species_id, double height, double weight, int base_experience) {
        this.id = id;
        this.identifier = identifier;
        this.species_id = species_id;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }    
}
